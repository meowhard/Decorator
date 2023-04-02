public class Main {
    public static void main(String[] args) {
        Tool multitool = new Knife(new Screwdriver(new ClawHammer()));
        Tool multitool1 = new ClawHammer(new Knife());
        multitool.work();
        multitool1.work();
    }
}