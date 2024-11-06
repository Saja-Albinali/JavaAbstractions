public class Teacher extends Person{
    private String Subject;
    private String School;

    public Teacher(String name, String subject,String school){
        super(name);
        this.Subject=subject;
        this.School=school;
    }
    public void describeRole(){
        System.out.println("name: " + name + " teacher of: " + Subject + " at: " + School) ;
    }
    public String getSubject() {
        return Subject;
    }
    public void setSubject(String subject){
        this.Subject=subject;
    }
    public String getSchool() {
        return School;
    }
    public void setSchool(String school){
        this.School=school;
    }
 }