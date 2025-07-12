package MathUtilsTest;
import MathUtils.Student;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class StudentTest {

    private Student st ;
    int temp;

    @Before
    public void setup(){
     st = new Student(null , null , 0 , 0 , 0 , 0);
    }

    @AfterEach
    public void cleanup(){
        temp = 0;
    }



    @Test
    public void test_setGpa() {


        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        st.setGpa(3.7f);

        String actual = baos.toString();
        String expected = "OK";

        assertEquals(expected,actual);
    }

    /////////////////////////////////////////////////
    /////////////// STUDENT NAME TEST ///////////////
    /////////////////////////////////////////////////

    @Test
    public void test_studentName_alphWithSpace() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setName("Hassan Khaled");
        String actual2 = boas.toString();

        int expected1 = 1;
        String expected2 = "correct student name info" ;

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }

    @Test
    public void test_studentName_numbersonly() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setName("1234");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid student name containing numbers" ;

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }

    @Test
    public void test_studentName_numbers_with_alphabetic() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setName("hk1234");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid student name containing numbers" ;

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }

    @Test
    public void test_studentName_alphabetic_only() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setName("Hassan");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid name containing Alphabetic only" ;

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_studentName_Start_with_spaces() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setName(" Hassan");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid student name start with space";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_studentName_Empty_name() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setName("");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid student name empty";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }



    @Test
    public void test_studentName_with_special_symbol_name() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setName("hassan@");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid student name contains special symbol";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }

    /////////////////////////////////////////////////
    /////////////// STUDENT NUMBER TEST /////////////
    /////////////////////////////////////////////////

    @Test
    public void test_studentNumber_with_8_num() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setNumber("12345678");
        String actual2 = boas.toString();

        int expected1 = 1;
        String expected2 = "Valid Number";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }

    @Test
    public void test_studentNumber_with_7_num_1_alph() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setNumber("1234567H");
        String actual2 = boas.toString();

        int expected1 = 1;
        String expected2 = "Valid Number";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_studentNumber_with_7_numers_only() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setNumber("1234567");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid width number";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_studentNumber_with_alphabetic() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setNumber("12H45678");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid number contains alphabetic";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_studentNumber_with_special_symbol() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setNumber("@1245678");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid number contains special symbol";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }



    @Test
    public void test_studentNumber_with_spaces() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setNumber("123456 8");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid number contains space";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    /////////////////////////////////////////////////
    //////////////ACTIVITY MARKS TEST////////////////
    /////////////////////////////////////////////////

    @Test
    public void test_ActivitiesMark_in_range() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setActivitiesMark(5);
        String actual2 = boas.toString();

        int expected1 = 1;
        String expected2 = "Valid ActivityMark";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_ActivitiesMark_corner_case_0() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setActivitiesMark(0);
        String actual2 = boas.toString();

        int expected1 = 1;
        String expected2 = "Valid ActivityMark";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_ActivitiesMark_corner_case_10() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setActivitiesMark(10);
        String actual2 = boas.toString();

        int expected1 = 1;
        String expected2 = "Valid ActivityMark";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_ActivitiesMark_corner_case_11() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setActivitiesMark(11);
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid ActivityMark out of range";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }

    @Test
    public void test_ActivitiesMark_corner_case_minus1() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setActivitiesMark(-1);
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid ActivityMark out of range";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_ActivitiesMark_out_of_range() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setActivitiesMark(50);
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid ActivityMark out of range";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    /////////////////////////////////////////////////
    //////////////Practical MARKS TEST///////////////
    /////////////////////////////////////////////////

    @Test
    public void test_PracticalMark_in_range() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setPracticalMark(5);
        String actual2 = boas.toString();

        int expected1 = 1;
        String expected2 = "Valid PracticalMark";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_PracticalMark_corner_case_0() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setPracticalMark(0);
        String actual2 = boas.toString();

        int expected1 = 1;
        String expected2 = "Valid PracticalMark";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_PracticalMark_corner_case_10() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setPracticalMark(10);
        String actual2 = boas.toString();

        int expected1 = 1;
        String expected2 = "Valid PracticalMark";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_PracticalMark_corner_case_11() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setPracticalMark(11);
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid PracticalMark out of range";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }

    @Test
    public void test_PracticalMark_corner_case_minus1() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setPracticalMark(-1);
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid PracticalMark out of range";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_PracticalMark_out_of_range() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setPracticalMark(50);
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid PracticalMark out of range";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }



    /////////////////////////////////////////////////
    //////////////Midterm MARKS TEST///////////////
    /////////////////////////////////////////////////

    @Test
    public void test_MidtermlMark_in_range() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setMidtermExamMark(10);
        String actual2 = boas.toString();

        int expected1 = 1;
        String expected2 = "Valid MidtermMark";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_MidtermlMark_corner_case_0() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setMidtermExamMark(0);
        String actual2 = boas.toString();

        int expected1 = 1;
        String expected2 = "Valid MidtermMark";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_MidtermlMark_corner_case_20() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setMidtermExamMark(20);
        String actual2 = boas.toString();

        int expected1 = 1;
        String expected2 = "Valid MidtermMark";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_MidtermlMark_corner_case_21() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setMidtermExamMark(21);
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid MidtermMark out of range";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }

    @Test
    public void test_MidtermlMark_corner_case_minus1() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setMidtermExamMark(-1);
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid MidtermMark out of range";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_MidtermlMark_out_of_range() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setMidtermExamMark(50);
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid MidtermMark out of range";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }

    /////////////////////////////////////////////////
    //////////////FINAL MARKS TEST///////////////////
    /////////////////////////////////////////////////

    @Test
    public void test_FinalMark_in_range() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setFinalExamMark(10);
        String actual2 = boas.toString();

        int expected1 = 1;
        String expected2 = "Valid FinalMark";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_FinalMark_corner_case_0() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setFinalExamMark(0);
        String actual2 = boas.toString();

        int expected1 = 1;
        String expected2 = "Valid FinalMark";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_FinalMark_corner_case_60() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setFinalExamMark(60);
        String actual2 = boas.toString();

        int expected1 = 1;
        String expected2 = "Valid FinalMark";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_FinalMark_corner_case_61() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setFinalExamMark(61);
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid FinalMark out of range";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }

    @Test
    public void test_FinalMark_corner_case_minus1() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setFinalExamMark(-1);
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid FinalMark out of range";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_FinalMark_out_of_range() {
        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = st.setFinalExamMark(80);
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid FinalMark out of range";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }

    /////////////////////////////////////////////////
    /////////////////////////////////////////////////
    /////////////////////////////////////////////////

    @Test
    public void test_get_student_Name() {
        String expected = "hassan khaled";
        temp = st.setName(expected);
        String actual = st.getName();
        assertEquals(expected,actual);
        assertEquals(1,temp);
    }

    /////////////////////////////////////////////////
    /////////////////////////////////////////////////
    /////////////////////////////////////////////////

    @Test
    public void test_get_student_Number() {
        String expected = "12345678";
        temp = st.setNumber(expected);
        String actual = st.getNumber();
        assertEquals(expected,actual);
        assertEquals(1,temp);
    }

    /////////////////////////////////////////////////
    /////////////////////////////////////////////////
    /////////////////////////////////////////////////

    @Test
    public void test_get_Activities_Mark() {
        int expected = 10;
        temp = st.setActivitiesMark(expected);
        int actual = st.getActivitiesMark();
        assertEquals(expected,actual);
        assertEquals(1,temp);
    }

    /////////////////////////////////////////////////
    /////////////////////////////////////////////////
    /////////////////////////////////////////////////

    @Test
    public void test_get_Midterm_Mark() {
        int expected = 7;
        temp = st.setMidtermExamMark(expected);
        int actual = st.getMidtermExamMark();
        assertEquals(expected,actual);
        assertEquals(1,temp);
    }

    /////////////////////////////////////////////////
    /////////////////////////////////////////////////
    /////////////////////////////////////////////////

    @Test
    public void test_get_Practical_Mark() {
        int expected = 7;
        temp = st.setPracticalMark(expected);
        int actual = st.getPracticalMark();
        assertEquals(expected,actual);
        assertEquals(1,temp);
    }

    /////////////////////////////////////////////////
    /////////////////////////////////////////////////
    /////////////////////////////////////////////////

    @Test
    public void test_get_Final_Mark() {
        int expected = 50;
        temp = st.setFinalExamMark(expected);
        int actual = st.getFinalExamMark();
        assertEquals(expected,actual);
        assertEquals(1,temp);
    }

    /////////////////////////////////////////////////
    /////////////////////////////////////////////////
    /////////////////////////////////////////////////


}