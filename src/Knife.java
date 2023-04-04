public class Knife extends Tool{
    public Knife(Workable workable) {
        super(workable);
    }

    public Knife() {}

    @Override
    public String getString() {
        return "режу";
    }
}
