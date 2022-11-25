package se.lexicon.dao;

import se.lexicon.Person;
import se.lexicon.TodoItemTask;

import java.util.Collection;

public interface TodoItemTaskDAO {

    TodoItemTask persist(TodoItemTask todoItemTask);
    TodoItemTask findById(Integer id);
    Collection<TodoItemTask> findAll();

    boolean findByAssignedStatus(boolean available);

    Collection<TodoItemTask> findByPersonId(int id);

    void removeId(int id);
}
