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
class Equipment extends person implements GYMManagementSystem {
    private String type;

    public Equipment(String newname,String newtype) {
        super(newname,0); 
        this.type=newtype;
    }
    public String gettype() {
        return type;
    }
    public void displayDetails() {
        System.out.println("Equipment Name:"+getname());
        System.out.println("Equipment Type:"+gettype());
    }
}
class Trainingprogram extends person implements GYMManagementSystem {
    private String programname;
    private String duration;

    public Trainingprogram(String newname,String newprogramname,String newduration) {
        super(newname,newtype); 
        this.programname=newprogramname;
        this.duration=newduration;
    }
    public String getProgramname() {
        return programname;
    }
    public String getDuration() {
        return duration;
    }
    public void displayDetails() {
        System.out.println("Training Program Name:"+getProgramname());
        System.out.println("Training Program Duration:"+getDuration());
    }
}
public class GYMprocess3 {
    public static void main(String[] args) {
        Member m1=new Member("John",25);
        m1.displayDetails();

        Trainer t1=new Trainer("Mike",30,"Weightlifting");
        t1.displayDetails();

        Equipment e1=new Equipment("Treadmill","Cardio");
        e1.displayDetails();

        Trainingprogram tp1=new Trainingprogram("shaan","weightloss","3 months");
        tp1.displayDetails();
    }
}
