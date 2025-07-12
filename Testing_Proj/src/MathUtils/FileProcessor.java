package MathUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.security.auth.Subject;

public class FileProcessor {
    
    
    private Subject subject;

    // constructor
    public FileProcessor(String fileName) {

        ArrayList<Student> students = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Reading the first line for subject information
            String subjectLine = bufferedReader.readLine();
            String[] subjectInfo = subjectLine.split(",");
            String subjectName = subjectInfo[0];
            String subjectCode = subjectInfo[1];
            int fullMarks = Integer.parseInt(subjectInfo[2]);

            subject = new Subject(subjectName,subjectCode,fullMarks);
            
            // Reading student information
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] studentInfo = line.split(",");
                String studentName = studentInfo[0];
                String studentNumber = studentInfo[1];
                int activitiesMark = Integer.parseInt(studentInfo[2]);
                int practicalMark = Integer.parseInt(studentInfo[3]);
                int midtermExamMark = Integer.parseInt(studentInfo[4]);
                int finalExamMark = Integer.parseInt(studentInfo[5]);

                // Create a Student object and add it to the list
                Student student = new Student(studentName, studentNumber, activitiesMark, practicalMark, midtermExamMark, finalExamMark);
                students.add(student);
            }

            subject.setEnrolledStudents(students);
            
            // Close the BufferedReader
            bufferedReader.close();
            
        }
        
        catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        
    }
    
    public Subject getSubject() {
        return subject;
    }
    
}