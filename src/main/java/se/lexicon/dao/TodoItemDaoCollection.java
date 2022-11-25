package se.lexicon.dao;

import se.lexicon.TodoItem;

import java.time.LocalDate;
import java.util.*;

public class TodoItemDaoCollection implements TodoItemDAO{


    private List<TodoItem> itemStorage;
    private List<TodoItem> afterDeadLine;
    private List<TodoItem> beforeDeadLine;

    public TodoItemDaoCollection(){
        itemStorage = new ArrayList<>();
    }


    @Override
    public TodoItem persist(TodoItem todoItem) {
        if (todoItem == null) throw new IllegalArgumentException("todoItem was null");
        TodoItem result = findById(todoItem.getId());
        if(result != null) throw new IllegalArgumentException("item was duplicate");
        itemStorage.add(todoItem);
        return todoItem;
    }

    @Override
    public TodoItem findById(Integer id) {
        if(id == null) throw new IllegalArgumentException("ID was null");
        for (TodoItem todoItem:itemStorage)
            if(todoItem.getId().equals(id)) { // Didn't know what to do here!!!
                return todoItem;
            }
        return null;
    }

    @Override
    public Collection<TodoItem> findAll() {
        return new ArrayList<>(itemStorage);
    }

    @Override
    public Collection<TodoItem> findAllByDoneStatus(TodoItem todoItem, boolean itemDone) {
        if (itemDone == true) throw new IllegalArgumentException("itemDone was done");
        if(itemDone == false) itemStorage.add(todoItem);
        return null;
    }

    @Override
    public Collection<TodoItem> findByTitleContains(String title) {
        if (title == null) throw new IllegalArgumentException("title was null");
        Set<TodoItem> theTitle = new HashSet<>();
        for (TodoItem todoItem : itemStorage)
            if (todoItem.getTitle().equalsIgnoreCase(title))
                theTitle.add(todoItem);
        return theTitle;
    }

    @Override
    public Collection<TodoItem> findByPersonId(int id) {
        if (id == 0) throw new IllegalArgumentException("id was null");
        Set<TodoItem> personID = new HashSet<>();
        for (TodoItem personalID : itemStorage)
            if (personalID.getId() == id)
                personID.add(personalID);
        return personID;
    }

    @Override
    public Collection<TodoItem> findByDeadlineBefore(LocalDate date) {
        for (TodoItem remaining : itemStorage){
            LocalDate day = remaining.getDeadLine();
            if(day.equals(date)) beforeDeadLine.add(remaining);
        } return beforeDeadLine;
    }

    @Override
    public Collection<TodoItem> findByDeadlineAfter(LocalDate date) {
        for (TodoItem overdue : itemStorage){
            LocalDate day = overdue.getDeadLine();
            if(day.isAfter(date)) beforeDeadLine.add(overdue);
        } return afterDeadLine;
    }

    @Override
    public void removeId(int id) {
        if(id == 0) throw new IllegalArgumentException("id was null");
        if (id != 0) itemStorage.remove(id);
    }
}
