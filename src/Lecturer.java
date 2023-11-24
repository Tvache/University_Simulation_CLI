public class Lecturer {
    private String name;
    private Subject subject;
    private Faculty faculty;

    public Lecturer(String name){
        this.name = name;
        this.subject = null;
        this.faculty = null;
    }

    public String getName() {
        return "Lecturer:" + name;
    }

    public Subject getSubject() {
        return subject;
    }
    public Faculty getFaculty(){
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
    public void setSubject(Subject subject){
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "LecturerName{"  + name +
                '}';
    }
}
