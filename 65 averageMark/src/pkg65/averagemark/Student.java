/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg65.averagemark;

/**
 *
 * @author Thinkpad
 */
public class Student {
    double math, physical, chemistry, mark;
    String name, classStudent;
    char type;

    public Student() {
    }

    public Student(double math, double physical, double chemistry, String name, String classStudent) {
        this.math = math;
        this.physical = physical;
        this.chemistry = chemistry;
        this.mark = caculatorMark();
        this.name = name;
        this.classStudent = classStudent;
        this.type = caculatorType();
    }
    
    

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysical() {
        return physical;
    }

    public void setPhysical(double physical) {
        this.physical = physical;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    private double caculatorMark() {
        return (math + chemistry + physical) / 3;
    }

    private char caculatorType() {
        double mark = caculatorMark();
        if (mark > 7.5) {
            return 'A';
        } else if (mark >= 6 && mark <= 7.5) {
            return 'B';
        } else if (mark < 6 && mark >= 4) {
            return 'C';
        } else {
            return 'D';
        }
    }
    
    public void info() {
        System.out.println("Name" + this.name);
        System.out.println("class" + this.classStudent);
        System.out.println("avg" + this.mark);
        System.out.println("type" + this.type);
    }
}
