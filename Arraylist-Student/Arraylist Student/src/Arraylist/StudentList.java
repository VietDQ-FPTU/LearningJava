package Arraylist;

import java.util.ArrayList;

public class StudentList extends ArrayList<Student> {
    public StudentList(){
      super(); 
    }
    public Student search(String code){
       code= code.trim().toUpperCase();
       for (int i=0; i<this.size(); i++)
           if (this.get(i).getCode().equals(code)) return this.get(i);
       return null;
    }
    private boolean isCodeDupplicated (String code){
        code= code.trim().toUpperCase();
        return search(code)!=null;
    }
    public void addStudent(){
        String newCode;
        String newName;
        int newMark;
        boolean codeDuplicated= false;
        do{
            newCode = Inputter.inputPattern("St. codeS000: ", "[sS][\\d]{3}" );
            newCode= newCode.trim() .toUpperCase();
            codeDuplicated = isCodeDupplicated(newCode);
            if (codeDuplicated)System.out.println("Code is duplicated!");
        }
        while (codeDuplicated==true);
        newName = Inputter.inputNonBlankStr("Name of new student: ");
        newName= newName.toUpperCase();
        newMark = Inputter.inputInt("Mark: ", 0, 10);
             // Create new student 
        Student st = new Student(newCode, newName, newMark);
             // Add new student to the list 
        this.add(st);
        System.out.println("Student " + newCode + " has been added.");
    }
    public void searchStudent(){
        if (this.isEmpty())
            System.out.println("Empty list. No search canbe performed");
        else{
            String sCode =Inputter.inputStr("Input student code for search:");
            Student st= this.search(sCode);
            if (st==null)
                System.out.println("Student " + sCode + " doesn't existed!");
            else System.out.println("Found: " + st);
        }
    }
// Update name and mark based on student's code
    public void updateStudent(){

    if (this.isEmpty())
        System.out.println("Empty list. No update can be performed!");
    else{
        String uCode =Inputter.inputStr("Input code of updated student:");
        Student st = this.search(uCode);
if (st==null) 
    System.out.println("Student " + uCode + "doesn't existed");
else{
    String oldName = st.getName();
    String msg = "Old name: " + oldName + ", new name";
    String newName = Inputter.inputNonBlankStr(msg);
    st.setName(newName);
    
    int oldMark = st.getMark();
    msg = "Old mark: " + oldMark + ", new mark 0..10:";
    int newMark;
            newMark = Inputter.inputInt(msg, 0, 10);
    st.setMark(newMark);
    System.out.println("Student " + uCode + "has been updated.");
    
    }
}}
    public void removeStudent(){
        if (this.isEmpty())
            System.out.println("Empty list. No remove can be performaed!");
        else{
            String rCode =Inputter.inputStr("Input code of remove student:");
            Student st = this.search(rCode);
            if (st==null)
                System.out.println("Student " + rCode + "doesn't existed!");
            else{
                this.remove(st);
                System.out.println("Student " + rCode + "has been removed.");
            }
        }
    }
    public void printAll(){
    if (this.isEmpty())
        System.out.println("Empty list!");
    else {
        System.out.println("Student list:");
        for (Student st: this)
            System.out.println(st);
        System.out.println("Total: " + this.size() + " student(s).");
    }
    }

    
}