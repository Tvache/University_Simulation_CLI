import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Subject> subjects;
    private List<Lecturer> lecturers;
    private List<Faculty> faculties;
    private List<Student> students;

    public University() {
        this.subjects = new ArrayList<>();
        this.lecturers = new ArrayList<>();
        this.faculties = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public Faculty createFaculty(String facultyName){
        Faculty faculty = new Faculty(facultyName);
        faculties.add(faculty);
        System.out.println("Created Faculty " + faculty.getName());
        System.out.println();
        return faculty;
    }
    public Subject createSubject(String subjectName){
        Subject subject = new Subject(subjectName);
        subjects.add(subject);
        System.out.println("Created Subject " + subject.getName());
        System.out.println();
        return subject;
    }

    public Student createStudent(String studentName){
        Student student = new Student(studentName);
        students.add(student);
        System.out.println("Created Student " + student.getName());
        System.out.println();
        return student;
    }
    public Lecturer createLecturer(String lecturerName){
        Lecturer lecturer = new Lecturer(lecturerName);
        lecturers.add(lecturer);
        System.out.println("Created " + lecturer.getName());
        System.out.println();
        return lecturer;
    }

    public void showFaculties(){
        System.out.println(faculties);
        System.out.println();
    }
    public void showStudents(){
        System.out.println(students);
        System.out.println();
    }
    public void showLecturers(){
        System.out.println(lecturers);
        System.out.println();
    }
    public void showSubjects(){
        System.out.println(subjects);
        System.out.println();
    }

    public void showFacultyLecturers(Faculty faculty){
        System.out.println(faculty.getLecturers());
        System.out.println();
    }
    public void showFacultySubjects(Faculty faculty){
        System.out.println(faculty.getSubjects());
        System.out.println();
    }
    public void showStudentLecturers(Student student){
        System.out.println(student.getFaculty().getLecturers());
        System.out.println();
    }
    public void showSubjectStudents(Subject subject){
        System.out.println(subject.getFaculty().getStudents());
        System.out.println();
    }

    public void showFullUniversityTree(){
        for(Faculty faculty : faculties){
            System.out.println(faculty.getName());
            System.out.println();
            for(Lecturer lecturer : faculty.getLecturers()){
                System.out.println(lecturer.getName() + " || " + lecturer.getSubject());
                System.out.println(faculty.getStudents());
            }
            System.out.println();
        }
    }



}
