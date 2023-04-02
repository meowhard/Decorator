public class ClawHammer extends Tool{
    public ClawHammer(Workable workable) {
        super(workable);
    }

    public ClawHammer() {}

    @Override
    public void work() {
        System.out.println("выдираю гвоздь");
        if (workable != null) {
            workable.work();
        }
    }
}
