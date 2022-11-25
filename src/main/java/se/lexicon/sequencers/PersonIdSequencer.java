package se.lexicon.sequencers;

public class PersonIdSequencer {
    private static int currentId;

    private static int nextId(){
        currentId++;
    return currentId; //Why did you write ++currentId?
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        PersonIdSequencer.currentId = currentId;
    }
}
