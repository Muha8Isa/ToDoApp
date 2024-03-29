package se.lexicon.dao;


import se.lexicon.model.TodoItem;

import java.time.LocalDate;
import java.util.Collection;

public interface TodoItemDAO {

    TodoItem persist(TodoItem todoItem);

    TodoItem findById(Integer id);

    Collection<TodoItem> findAll();

    Collection<TodoItem> findAllByDoneStatus(TodoItem todoItem, boolean itemDone);

    Collection<TodoItem> findByTitleContains(String title);

    Collection<TodoItem> findByPersonId(int id);


    Collection<TodoItem> findByDeadlineBefore(LocalDate beforeDate);


    Collection<TodoItem> findByDeadlineAfter(LocalDate afterDate);

    void removeId(int id);
}
