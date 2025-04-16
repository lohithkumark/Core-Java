public class Encap{
    String NAME ;
    String school;
    int age;
    String heigth;

    public Encap (String NAME , String school ,int age ,String height) {
        this.NAME = NAME;
        this.school = school;
        this.age = age;
        this.heigth = height;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getNAME() {
        return NAME;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHeigth(String heigth) {
        this.heigth = heigth;
    }

    public String getHeigth() {
        return heigth;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.NAME);
        System.out.println("School: " + school);
        System.out.println("Age: " + age);
        System.out.println("Height: " + this.heigth);
    }

    public static void main(String[] args) {
        Encap s = new Encap("Lohith", "Oxford", 21, "158cm");
        System.out.println("Student Name: " + s.NAME);

        s.setAge(22);
        s.setHeigth("178");
        s.displayInfo();

}
}
