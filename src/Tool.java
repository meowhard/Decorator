public abstract class Tool implements Workable{
    protected Workable workable;

    public Tool(Workable workable) {
        this.workable = workable;
    }

    public Tool() {}

    @Override
    public void work() {
        if (workable != null) {
            System.out.println(workable.getString());
            workable.work();
        }
    }

    public String getString() {
        return null;
    }
}