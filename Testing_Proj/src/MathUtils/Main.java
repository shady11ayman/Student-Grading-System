package MathUtils;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String file_hand = "C:\\testing_project\\Testing_Proj\\input_file.txt";
        FileProcessor fileProcessor = new FileProcessor(file_hand);

        System.out.println(fileProcessor.getSubject().getName());
        System.out.println(fileProcessor.getSubject().getCode());
        System.out.println(fileProcessor.getSubject().getFullMark());
        System.out.println(fileProcessor.getSubject().getEnrolledStudents().get(1).getName());
        System.out.println(fileProcessor.getSubject().getEnrolledStudents().get(2).getNumber());
        System.out.println(fileProcessor.getSubject().getEnrolledStudents().get(3).getName());
        System.out.println(fileProcessor.getSubject().getEnrolledStudents().get(4).getName());
    }
}