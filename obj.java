public class obj {
    String NAME ;
    String school;
    int age;
    String heigth;


    public obj(String NAME,String school,int age , String height){
        this.NAME= NAME;
        this.school=school;
        this.age =age;
        this.heigth=height;
    }

    public void op(){
        System.out.println("The name is:" + NAME);
        System.out.println(("Studied School:" + school));
        System.out.println(("Age is :"+age));
        System.out.println("Heigth is :" + heigth);
    }

    public static void main(String[] args) {

        obj obj = new obj("lohith","Oxford",21,"158cm");
        obj.op();


    }
}
