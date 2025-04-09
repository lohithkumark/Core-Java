import Lock.Lock;  // Importing Lock class

public class Main {
    public static void main(String[] args) {
        // Create an instance of Lock
        Lock lock = new Lock();

        // Call methods from the hierarchy
        lock.protect();      // From Security class
        lock.alert();        // From Security class
        lock.lockDoor();     // From Lock class
        lock.unlockDoor();   // From Lock class

    }
}
