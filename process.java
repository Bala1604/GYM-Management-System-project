package GYM;
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
    public void diplayequipment(){
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
public class process {

    public static void main(String[]args){

          equipment e1=new equipment("Treadmill","Cardio");
          e1.diplayequipment();

          trainingprogram t1=new trainingprogram("Weight Loss","3 months");
          t1.displaytrainingprogram();
         
    }

}
