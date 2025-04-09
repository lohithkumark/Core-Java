package Lock;

import Security.Security;  // Importing Security class

public class Lock extends Security {
    // Attributes of Lock
    String lockType;
    boolean isLocked;

    public void lockDoor() {
        isLocked = true;
        System.out.println("The door is now locked.");
    }

    public void unlockDoor() {
        isLocked = false;
        System.out.println("The door is now unlocked.");

    }
}
