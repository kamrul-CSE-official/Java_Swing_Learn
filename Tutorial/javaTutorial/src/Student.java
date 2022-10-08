
public class Student {
    
    String nameString;
    int id;
    String daeOfBirthString;
    String depNameString;
    
    public Student(String name, int studentId, String dob, String dep ){
        this.nameString = name;
        this.id = studentId;
        this.daeOfBirthString = dob;
        this.depNameString = dep;
        
    }
    
    
    public void Admin(){
        System.out.println("Student Admited"+" Name: "+nameString);
       
    }
    
    public void Exam(){
        
    }
    
}
