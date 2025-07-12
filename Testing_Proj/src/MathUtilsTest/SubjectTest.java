package MathUtilsTest;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import javax.security.auth.Subject;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;

public class SubjectTest {

   Subject sub ;
   int temp;

    @Before
    public void setup(){
        sub = new Subject(null, null , 0 );
    }

    @AfterEach
    public void cleanup(){
        temp = 0;
    }

    /////////////////////////////////////////////////
    /////////////// SUBJECT NAME TEST ///////////////
    /////////////////////////////////////////////////

    @Test
    public void test_subjecttName_alphWithSpace() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setName("Intro to Electronics");
        String actual2 = boas.toString();

        int expected1 = 1;
        String expected2 = "correct subject name info" ;

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }

    @Test
    public void test_subjecttName_numbersonly() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setName("1234");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject name containing numbers" ;

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }

    @Test
    public void test_subjecttName_numbers_with_alphabetic() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setName("electronics1234");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject name containing numbers" ;

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }

    @Test
    public void test_subjecttName_alphabetic_only() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setName("electronics");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid name containing Alphabetic only" ;

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_subjecttName_Start_with_spaces() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setName(" testing");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject name start with space";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_subjecttName_Empty_name() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setName("");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject name empty";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }



    @Test
    public void test_subjecttName_with_special_symbol_name() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setName("testing@");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject name contains special symbol";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    /////////////////////////////////////////////////
    /////////////// SUBJECT CODE TEST ///////////////
    /////////////////////////////////////////////////

    @Test
    public void test_subject_CODE_with_6_RIGHT_CHAR() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setCode("ABC123");
        String actual2 = boas.toString();

        int expected1 = 1;
        String expected2 = "Valid Subject Code";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }



    @Test
    public void test_subject_CODE_with_7_RIGHT_CHAR() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setCode("ABC123s");
        String actual2 = boas.toString();

        int expected1 = 1;
        String expected2 = "Valid Subject Code";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_subject_CODE_with_All_alphabetic() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setCode("ABCDEF");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject code";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }



    @Test
    public void test_subject_CODE_with_All_Digits() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setCode("123456");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject code";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }



    @Test
    public void test_subject_CODE_with_All_alphabetic_7() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setCode("ABCDEFG");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject code";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_subject_CODE_with_All_Digits_7() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setCode("ABCDEFG");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject code";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }



    @Test
    public void test_subject_CODE_with_alphabetic_in_last3() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setCode("ABC1D3");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject code";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_subject_CODE_with_Digit_in_first3 () {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setCode("A5C123");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject code";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_subject_CODE_with_special_character () {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setCode("ABC@23");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject code";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_subject_CODE_with_space() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setCode("ABC 23");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject code";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }

    @Test
    public void test_subject_CODE_with_wrong_lenth() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setCode("ABC12");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject code Length";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_subject_CODE_Empty() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setCode("");
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "invalid subject code empty";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    /////////////////////////////////////////////////
    ////////////////FULL MARK TESTING ///////////////
    /////////////////////////////////////////////////

    @Test
    public void test_fullmark_right_in() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setFullMark(80);
        String actual2 = boas.toString();

        int expected1 = 1;
        String expected2 = "full mark valid input";
        assertEquals(expected2,actual2);
        assertEquals(expected1,actual1);

    }


    @Test
    public void test_fullmark_out_of_range() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setFullMark(150);
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "full mark out of range";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_fullmark_cornercase_99() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setFullMark(99);
        String actual2 = boas.toString();

        int expected1 = 1;
        String expected2 = "full mark valid input";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_fullmark_cornercase_101() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setFullMark(101);
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "full mark out of range";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_fullmark_cornercase_minus1() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setFullMark(-1);
        String actual2 = boas.toString();

        int expected1 = 0;
        String expected2 = "full mark out of range";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    @Test
    public void test_fullmark_cornercase_1() {

        ByteArrayOutputStream boas = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(boas);
        System.setOut(printStream);

        int actual1 = sub.setFullMark(1);
        String actual2 = boas.toString();

        int expected1 = 1;
        String expected2 = "full mark valid input";

        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }


    /////////////////////////////////////////////////
    /////////////////////////////////////////////////
    /////////////////////////////////////////////////



    @Test
    public void getName() {
        String expected = "electronic cse";
        temp = sub.setName(expected);
        String actual = sub.getName();
        assertEquals(expected,actual);
        assertEquals(1,temp);
    }


    @Test
    public void getCode() {
        String expected = "ABC123";
        temp = sub.setCode(expected);
        String actual = sub.getCode();
        assertEquals(expected,actual);
        assertEquals(1,temp);
    }


    @Test
    public void getFullMark() {
        int expected = 80;
        temp = sub.setFullMark(expected);
        int actual = sub.getFullMark();
        assertEquals(expected,actual);
        assertEquals(1,temp);
    }


//
//    @Test
//    public void getEnrolledStudents() {
//    }
//
//    @Test
//    public void setEnrolledStudents() {
//    }
}