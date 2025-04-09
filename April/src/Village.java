import java.sql.SQLOutput;

public class Village {
    String state;
    String district;
    int no_of_house;


public Village(String state,String district,int no_of_houses){
    this.state=state;
    this.district=district;
    this.no_of_house=no_of_houses;

}

public void villageInfo(){
    System.out.println("state name is :" + this.state);
    System.out.println("DISTRICT IS:" + this.district);
    System.out.println("no of houses:" + this.no_of_house);
}}
