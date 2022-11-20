package se.lexicon.dao;

import se.lexicon.TodoItemTask;

import java.util.*;

public class TodoItemTaskDaoCollection implements TodoItemTaskDAO{

    private List<TodoItemTask> itemTaskStorage;

    public TodoItemTaskDaoCollection(){
        itemTaskStorage = new ArrayList<>();
    }


    @Override
    public TodoItemTask persist(TodoItemTask todoItemTask) {
        if (todoItemTask == null) throw new IllegalArgumentException("todoItemTask was null");
        TodoItemTask result = findById(todoItemTask.getId());
        if(result != null) throw new IllegalArgumentException("item task was duplicate");
        itemTaskStorage.add(todoItemTask);
        return todoItemTask;
    }

    @Override
    public TodoItemTask findById(int id) {
        if(id == 0) throw new IllegalArgumentException("ID was null");
        for (TodoItemTask todoItemTask:itemTaskStorage)
            if(TodoItemTask.getId() == id) { // Didn't know what to do here!!!
                return todoItemTask;
            }
        return null;
    }

    @Override
    public Collection<TodoItemTask> findAll() {
        return new ArrayList<>(itemTaskStorage);
    }

    @Override
    public boolean findByAssignedStatus(boolean available) {
        if (available == false) throw new IllegalArgumentException("item is not available");
        if(available) return true;
        return available;
    }

    @Override
    public Collection<TodoItemTask> findByPersonId(int id) {
        if (id == 0) throw new IllegalArgumentException("id was null");
        Set<TodoItemTask> personID = new HashSet<>();
        for (TodoItemTask personalID : itemTaskStorage)
            if (personalID.getId() == id)
                personID.add(personalID);
        return personID;
    }

    @Override
    public void removeId(int id) {
        if(id == 0) throw new IllegalArgumentException("id was null");
        if (id != 0) itemTaskStorage.remove(id);
    }
}
