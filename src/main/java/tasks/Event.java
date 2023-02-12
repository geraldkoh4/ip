package tasks;

public class Event extends Task {

    private String from;
    private String to;

    public Event(String description, String from, String to) {
        super(description);
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (from: " + from + "to: " + to + ")";

    }

    public String getCommand() {
        return "e/" + this.getStatusIcon() + "/" + this.getDescription() + "/" + this.from + "/" + this.to ;
    }
}
