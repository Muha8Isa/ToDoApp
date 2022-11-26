package se.lexicon.dao;

import se.lexicon.model.TodoItemTask;

import java.util.Collection;

public interface TodoItemTaskDAO {

    TodoItemTask persist(TodoItemTask todoItemTask);
    TodoItemTask findById(Integer id);
    Collection<TodoItemTask> findAll();

    boolean findByAssignedStatus(boolean available);

    Collection<TodoItemTask> findByPersonId(int id);

    void removeId(int id);
}
