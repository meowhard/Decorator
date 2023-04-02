public class Screwdriver extends Tool{
    public Screwdriver(Workable workable) {
        super(workable);
    }

    public Screwdriver() {}

    @Override
    public void work() {
        System.out.println("кручу");
        if (workable != null) {
            workable.work();
        }
    }
}
