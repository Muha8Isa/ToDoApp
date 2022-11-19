package se.lexicon.sequencers;

public class TodoItemSequencer {
    private static int currentId;

    private static int nextId(){
        currentId++;
        return currentId;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        TodoItemSequencer.currentId = currentId;
    }
}
