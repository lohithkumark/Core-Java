import GoodDay.GoodDay;  // Importing GoodDayBiscuit class

public class Main {
    public static void main(String[] args) {
        // Create an instance of GoodDayBiscuit
        GoodDay goodDay = new GoodDay();
        goodDay.eat();          // From Food class
        goodDay.SnackTime();    // From Snack class
        goodDay.crunch();       // From Biscuit class
        goodDay.enjoy();        // From GoodDayBiscuit class
    }
}
