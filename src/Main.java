import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to OL university");
        University uni = new University();
        Student student1 = uni.createStudent("Tornike");
        Student student2 = uni.createStudent("Bob");
        Student student3 = uni.createStudent("Adam");
        Student student4 = uni.createStudent("Sam");
        Student student5 = uni.createStudent("Otar");
        Student student6 = uni.createStudent("Mamuka");

        Faculty faculty1 = uni.createFaculty("MACS");
        Faculty faculty2 = uni.createFaculty("Business");
        Faculty faculty3 = uni.createFaculty("Communications");


        Subject subject1 = uni.createSubject("Programming");
        Subject subject2 = uni.createSubject("Economics");
        Subject subject3 = uni.createSubject("Psychology");

        Lecturer lecturer1 = uni.createLecturer("Professor Gurami");
        Lecturer lecturer2 = uni.createLecturer("Professor Levani");
        Lecturer lecturer3 = uni.createLecturer("Professor Anzori");
        Lecturer lecturer4 = uni.createLecturer("Professor Merabi");

        faculty1.addFacultySubject(subject1);
        faculty1.addFacultySubject(subject2);
        faculty1.addFacultySubject(subject3);
        faculty1.addFacultyLecturer(lecturer1);
        faculty1.addFacultyLecturer(lecturer2);
        faculty1.addFacultyLecturer(lecturer3);
        faculty1.addFacultyLecturer(lecturer4);
        faculty1.setFacultySubjectLecturer(subject1,lecturer1);
        faculty1.setFacultySubjectLecturer(subject2,lecturer2);
        faculty1.setFacultySubjectLecturer(subject3,lecturer3);
        faculty1.addFacultyStudent(student1);
        faculty1.addFacultyStudent(student2);
        faculty1.addFacultyStudent(student3);
        faculty1.addFacultyStudent(student4);
        faculty1.addFacultyStudent(student5);
        faculty1.addFacultyStudent(student6);

        uni.showSubjects();
        uni.showLecturers();
        uni.showFaculties();
        uni.showStudents();
        uni.showFacultyLecturers(faculty1);
        uni.showFacultySubjects(faculty1);
        uni.showStudentLecturers(student1);
        uni.showSubjectStudents(subject1);
        uni.showFullUniversityTree();
        uni.deleteFaculty(faculty3);
        uni.deleteLecturer(lecturer4);



    }
}