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
            if(student.getFaculty() == null) {
                students.add(student);
                System.out.println("added " + student.getName() + " to " + name);
                System.out.println();
                student.setFaculty(this);
            } else {
                try{
                    throw new Exception("Student is already in a faculty");
                } catch(Exception e){
                    throw new RuntimeException(e);
                }
            }

    }
    public void addFacultyLecturer(Lecturer lecturer){
            lecturers.add(lecturer);
            System.out.println("added " + lecturer.getName()  + " to " + name);
            System.out.println();
            lecturer.setFaculty(this);

    }
    public void addFacultySubject(Subject subject){
            boolean containsValue = subjects.stream()
                            .anyMatch(object  -> subject.getName().equals(object.getName()));
            if(!containsValue) {
                subjects.add(subject);
                System.out.println("added " + subject.getName() + " to " + name);
                subject.setFaculty(this);
            } else {
                try{
                    throw new Exception("Subject in that faculty already exists");
                } catch(Exception e){
                    throw new RuntimeException(e);
                }
            }

    }
    public void setFacultySubjectLecturer(Subject subject, Lecturer lecturer){
        if(subject.getLecturer() == null && lecturer.getSubject() == null) {
            subject.setLecturer(lecturer);
            lecturer.setSubject(subject);
        }
        else {
            try{
                throw new Exception("subject is already assigned to a lecturer OR lecturer already has 1 subject");
            } catch(Exception e){
                throw new RuntimeException(e);
            }
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
