package GYM;
class member{
    private String name;
    private int age;

    public member(String newname,int newage ){
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
public class person {
    public static void main(String[] args) {
        member m1=new member("John",25);
        m1.displaymember();
        trainer t1=new trainer("Mike",30,"weightlifting");
        t1.displaytrainer();
    }
}
