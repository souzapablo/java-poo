package domain;

public class Content {
    protected final String name;
    private final int experience;
    private boolean finished;

    public Content(String name, int experience) {
        this.name = name;
        this.experience = experience;
        this.finished = false;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return name;
    }
}
