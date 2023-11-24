import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private List<Subject> subjects;
    private List<Student> students;
    private List<Lecturer> lecturers;

    public Faculty(String name){
        this.name = name;
        this.subjects = new ArrayList<>();
        this.students = new ArrayList<>();
        this.lecturers = new ArrayList<>();
    }

    public void addFacultyStudent(Student student){
        if(students.contains(student)){
            System.out.println("This Student in that faculty already exists");
        } else {
            students.add(student);
            System.out.println("added " + student.getName() + " to " + name);
            System.out.println();
            student.setFaculty(this);
        }
    }
    public void addFacultyLecturer(Lecturer lecturer){
        if(lecturers.contains(lecturer)){
            System.out.println("This Lecturer in that faculty already exists");
        } else {
            lecturers.add(lecturer);
            System.out.println("added " + lecturer.getName()  + " to " + name);
            System.out.println();
            lecturer.setFaculty(this);
        }
    }
    public void addFacultySubject(Subject subject){
        if(subjects.contains(subject)) {
            System.out.println("This Subject in that faculty already exists");
        } else {
            subjects.add(subject);
            subject.setFaculty(this);
        }
    }
    public void setFacultySubjectLecturer(Subject subject, Lecturer lecturer){
        if(subjects.contains(subject) && lecturers.contains(lecturer)){
            subject.setLecturer(lecturer);
            lecturer.setSubject(subject);
        } else {
            System.out.println("that subject or lecturer does not exist in this faculty");
        }
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Lecturer> getLecturers() {
        return lecturers;
    }

    @Override
    public String toString() {
        return "Faculty Name{" +
                 name +
                '}';
    }
}
