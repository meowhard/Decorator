public abstract class Tool implements Workable{
    protected Workable workable;

    public Tool(Workable workable) {
        this.workable = workable;
    }

    public Tool() {}
}