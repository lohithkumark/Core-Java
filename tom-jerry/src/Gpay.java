public class Gpay extends Payments {

    void hello() {
        System.out.println("running in gpay");
    }

    @Override
    public void people() {
        super.people();
        System.out.println("poeple running in gpay");
    }
}
