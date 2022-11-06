package se.lexicon;

public class TodoItemTask {

    private int id;
    private boolean assigned;
    private String todoItem;
    private String assignee;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public String getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(String todoItem) {
        if (todoItem == null) throw new IllegalArgumentException("todoItem param was null");
        this.todoItem = todoItem;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = String.valueOf(assignee);
    }
}
