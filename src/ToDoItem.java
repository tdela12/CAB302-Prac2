public class ToDoItem {
    private String description;
    private boolean isDone;

    // TODO Now:
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    // Add getters and setters for each field
    public ToDoItem(String desc) {
        description = desc;
        isDone = false;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String newDescription){
        description = newDescription;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setIsDone(boolean newIsDone) {
        isDone =  newIsDone;
    }
}
