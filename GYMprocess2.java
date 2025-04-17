package GYM;
interface GYMManagementSystem {
    void displayDetails();
}
abstract class Person {
    private String name;
    private String type;

    public Person(String newname, String newtype) {
        this.name=newname;
        this.type=newtype;
    }
     public String getname() {
        return name;
    }
    public String gettype() {
        return type;
    }
}
class Equipment extends person implements GYMManagementSystem {
    private String type;

    public Equipment(String newname,String newtype) {
        super(newname,newtype); 
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
public class GYMprocess2 {
    public static void main(String[] args) {
        Equipment e1=new Equipment("Treadmill","Cardio");
        e1.displayDetails();

        Trainingprogram tp1=new Trainingprogram("seenu","weightlifting","1 hour daily");
        tp1.displayDetails();
    }
    
}
