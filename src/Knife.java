public class Knife extends Tool{
    public Knife(Workable workable) {
        super(workable);
    }

    public Knife() {}

    @Override
    public void work() {
        System.out.println("режу");
        if (workable != null) {
            workable.work();
        }
    }
}
