public class Screwdriver extends Tool{
    public Screwdriver(Workable workable) {
        super(workable);
    }

    public Screwdriver() {}

    @Override
    public String getString() {
        return "кручу";
    }
}
