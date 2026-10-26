// Student Grade System - Shows Classes and Inheritance
class Student {
    String name;
    int matricNo;

    public Student(String name, int matricNo) {
        this.name = name;
        this.matricNo = matricNo;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + " | Matric: " + matricNo);
    }
}

class GraduateStudent extends Student {
    String thesisTitle;

    public GraduateStudent(String name, int matricNo, String thesis) {
        super(name, matricNo);
        this.thesisTitle = thesis;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Thesis Title: " + thesisTitle);
    }
}

public class StudentGradeSystem {
    public static void main(String[] args) {
        GraduateStudent gs = new GraduateStudent("Abibat", 2001, "AI in Education");
        gs.displayInfo();
    }
}
