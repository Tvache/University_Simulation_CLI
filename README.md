# University_Simulation_CLI
University Simulation CLI
This command-line application simulates university processes, allowing users to manage faculties, subjects, lecturers, and students within the university structure.

University Structure:
Subjects: Represent the courses offered within the university.
Faculties: Include subjects; a subject can belong to multiple faculties.
Lecturers: Instructors teaching various subjects.
Students: Enrolled individuals associated with specific faculties.
Application Methods:
Create Faculty,
Create Subject,
Create Lecturer,
Create Student,
Assign Subject to Lecturer: add lecturerSubject {lecturerName} {subjectName} - Assigns a subject to a lecturer, ensuring exclusive teaching assignments.
Display Methods:
show faculties - Displays all faculties.
show students - Displays all students.
show subjects - Displays all subjects.
show lecturers - Displays all lecturers.
show facultyLecturers {facultyName} - Lists lecturers teaching subjects related to a specific faculty.
show facultySubjects {facultyName} - Lists subjects offered by a specific faculty.
show studentLecturers {studentName} - Lists lecturers for a specific student.
show subjectStudents {subjectName} - Lists students enrolled in a specific subject.
show fullUniversityTree - Prints the entire university structure in a tree-like format as described in the documentation.
Deletion Methods:
Delete Lecturer: delete lecturer {lecturerName} - Deletes a lecturer if not teaching any subjects with enrolled students.
Delete Faculty: delete faculty {facultyName} - Deletes a faculty if no primary student is enrolled.
