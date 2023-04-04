public class Main {
    public static void main(String[] args) {
        Tool multitool = new Knife(new Screwdriver(new ClawHammer()));
        multitool.work();
        Tool knife = new Knife();
        knife.work();
    }
}