package ly.generalassemb.lab;

public class Student {
    private final String name;
    private final char grade;
    private final String subject;

    public Student(String name, char grade, String subject) {
        this.name = name;
        this.grade = grade;
        this.subject = subject;
    }

    public String getName() { return name; }
    public char getGrade() { return grade; }
    public String getSubject() { return subject; }
}