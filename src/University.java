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

    //CREATE METHODS
    public Faculty createFaculty(String facultyName){
        Faculty faculty = new Faculty(facultyName);
        boolean containsValue = faculties.stream()
                        .anyMatch(object -> facultyName.equals(object.getName()));
        if(!containsValue) {
            faculties.add(faculty);
            System.out.println("Created Faculty " + faculty.getName());
            System.out.println();
            return faculty;
        }
        else {
            try {
                throw new Exception("Faculty Already Exists");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
    public Subject createSubject(String subjectName){
        Subject subject = new Subject(subjectName);
        boolean containsValue = subjects.stream()
                        .anyMatch(object -> subjectName.equals(object.getName()));
        if(!containsValue) {
            subjects.add(subject);
            System.out.println("Created Subject " + subject.getName());
            System.out.println();
            return subject;
        } else {
            try {
                throw new Exception("Subject Already Exists");
            } catch(Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Student createStudent(String studentName){
        Student student = new Student(studentName);
        boolean containsValue = students.stream()
                        .anyMatch(object -> studentName.equals(object.getName()));
        if(!containsValue) {
            students.add(student);
            System.out.println("Created Student " + student.getName());
            System.out.println();
            return student;
        } else {
            try {
                throw new Exception("Student already exists");
            } catch (Exception e){
                throw new RuntimeException(e);
            }
        }
    }
    public Lecturer createLecturer(String lecturerName){
        Lecturer lecturer = new Lecturer(lecturerName);
        boolean containsValue = lecturers.stream()
                        .anyMatch(object -> lecturerName.equals(object.getName()));
        if(!containsValue) {
            lecturers.add(lecturer);
            System.out.println("Created " + lecturer.getName());
            System.out.println();
            return lecturer;
        } else {
            try{
                throw new Exception("Lecturer already exists");
            } catch(Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    //DISPLAY METHODS
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

    //DELETION METHODS
    public void deleteLecturer(Lecturer lecturer){
        if(lecturer.getFaculty() == null && lecturer.getSubject() == null){
            lecturers.remove(lecturer);
            System.out.println("Removing " + lecturer);
            System.out.println();
        }else if(lecturer.getSubject() == null && lecturer.getFaculty() != null){
            lecturers.remove(lecturer);
            lecturer.getFaculty().getLecturers().remove(lecturer);
            System.out.println("Removing " + lecturer);
            System.out.println();
        }
        else if(lecturer.getSubject() != null){
            try{
                throw new Exception("Lecturer is in a Faculty and has subjects");
            } catch(Exception e){
                throw new RuntimeException(e);
            }
        }
    }

    public void deleteFaculty(Faculty faculty){
        if(faculty.getStudents().isEmpty()){
            faculties.remove(faculty);
            System.out.println("Removing " + faculty);
            System.out.println();
        } else {
            try{
                throw new Exception("Students study in that faculty");
            } catch(Exception e){
                throw new RuntimeException(e);
            }
        }
    }



}
