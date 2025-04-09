public class Village {
    String state;
    String district;
    int no_of_houses;

public Village(String state,String district,int no_of_houses){
    this.state=state;
    this.district=district;
    this.no_of_houses=no_of_houses;
}

public void VillageDetails(){
    System.out.println("The state name is " + state);
    System.out.println(("district name:" + district));
    System.out.println("Total no of houses:" + no_of_houses);
}
}
