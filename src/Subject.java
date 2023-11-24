import java.util.List;

public class Subject {
    private String name;
    private Faculty faculty;
    private Lecturer lecturer;

    public Subject(String name){
        this.name = name;
        this.faculty = null;
        this.lecturer = null;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public String getName() {
        return name;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public List<Student> getStudents() {
        return faculty.getStudents();
    }

    @Override
    public String toString() {
        return "SubjectName{" + name +
                '}';
    }
}
