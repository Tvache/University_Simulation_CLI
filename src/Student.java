public class Student {
    private String name;
    private Faculty faculty;


    public Student(String name){
        this.name = name;
        this.faculty = null;

    }
    public String getName() {
        return name;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty){
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "StudentName{" + name +
                '}';
    }
}
