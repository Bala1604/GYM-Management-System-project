package GYM;
class member{
    private String name;
    private int age;

    public member(String newname,int newage){
        this.name=newname;
        this.age=newage;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public void displaymember(){
        System.out.println("membername:"+name);
        System.out.println("memberage:"+age);
    }
}
class trainer{
    private String name;
    private int age;
    private String specialization;

    public trainer(String newname,int newage,String newspecialization){
        this.name=newname;
        this.age=newage;
        this.specialization=newspecialization;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public String getspecialization(){
        return specialization;
    }
    public void displaytrainer(){
        System.out.println("trainername:"+name);
        System.out.println("trainerage:"+age);
        System.out.println("trainerspecialization:"+specialization);
    }
}
class equipment{
    private String name;
    private String type;

    public equipment(String newname,String newtype){
        this.name=newname;
        this.type=newtype;
    }
    public String getname(){
        return name;
    }
    public String gettype(){
        return type;
    }
    public void displayequipment(){
        System.out.println("equipmentname:"+name);
        System.out.println("equipmenttype:"+type);
    }
}
class trainingprogram{
    private String programname;
    private String duration;

    public trainingprogram(String newprogramname,String newduration){
        this.programname=newprogramname;
        this.duration=newduration;
    }
    public String getprogramname(){
        return programname;
    }
    public String getduration(){
        return duration;
    }
    public void displaytrainingprogram(){
        System.out.println("programname:"+programname);
        System.out.println("duration:"+duration);
    }
}
public class GYMManagementSystem {
    public static void main(String[] args) {
        member m1=new member("John",25);
        m1.displaymember();
        trainer t1=new trainer("Mike",30,"weightlifting");
        t1.displaytrainer();
        equipment e1=new equipment("Treadmill","Cardio");
        e1.displayequipment();
        trainingprogram p1=new trainingprogram("Weightlifting","3 months");
        p1.displaytrainingprogram();
    }
}