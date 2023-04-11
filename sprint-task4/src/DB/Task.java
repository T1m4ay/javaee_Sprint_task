package DB;

public class Task {
    private int id;
    private String name;
    private String description;
    private String deadlineDate;
    private String done;

    public Task() {
    }

    public Task(String name, String description, String deadlineDate) {
        this.name = name;
        this.description = description;
        this.deadlineDate = deadlineDate;
    }

    public Task(int id, String name, String description, String deadlineDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.deadlineDate = deadlineDate;
    }

    public Task(int id, String name, String description, String deadlineDate, String done) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.deadlineDate = deadlineDate;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(String deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public String getDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = done;
    }
}
