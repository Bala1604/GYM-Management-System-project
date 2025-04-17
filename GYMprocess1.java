package GYM;

interface GYMManagementSystem {
    void displayDetails();
}
abstract class Person {
    private String name;
    private int age;

    public Person(String newname, int newage) {
        this.name=newname;
        this.age=newage;
    }
     public String getname() {
        return name;
    }
    public int getage() {
        return age;
    }
}
class Member extends Person implements GYMManagementSystem {
    public Member(String newname,int newage) {
        super(newname,newage);
    }
    public void displayDetails() {
        System.out.println("Member Name:"+getname());
        System.out.println("Member Age:"+getage());
    }
}
class Trainer extends Person implements GYMManagementSystem {
    private String specialization;

    public Trainer(String newname,int newage,String newspecialization) {
        super(newname,newage);
        this.specialization = newspecialization;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void displayDetails() {
        System.out.println("Trainer Name:"+getname());
        System.out.println("Trainer Age:"+getage());
        System.out.println("Trainer Specialization:"+specialization);
    }
}
public class GYMprocess1 {
    public static void main(String[] args) {
        Member m1=new Member("John",25);
        m1.displayDetails();

        Trainer t1=new Trainer("Mike",30,"Weightlifting");
        t1.displayDetails();
    }
}

