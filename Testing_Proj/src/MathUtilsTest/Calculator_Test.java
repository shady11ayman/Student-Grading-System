import static org.assertj.core.api.Assertions.*;
import static program.Calculator.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class Calculator_Test
{

    /////////////////////////////////////////////////
    ///////// Compute total mark TEST ///////////////
    /////////////////////////////////////////////////
    @Test
    void Test_compute_total_mark_positiveTesting()
    {
        int activitiesMark = 8;
        int oralPracticalMark = 0;
        int midtermMark = 20;
        int finalMark = 59;

        int expectedValue = 87;

        int actualValue = compute_total_mark(activitiesMark,oralPracticalMark,midtermMark,finalMark);

        assertThat(actualValue).isEqualTo(expectedValue);
    }

    /////////////////////////////////////////////////
    ////////////// compute grade TEST ///////////////
    /////////////////////////////////////////////////
    @Test
    void Test_compute_Grade_valuesBetween97And100_gradeAPlus()
    {
        int grade1 = 100;
        String expectedValue1 = "A+";
        String actualValue1 = compute_Grade(grade1);

        int grade2 = 97;
        String expectedValue2 = "A+";
        String actualValue2 = compute_Grade(grade2);

        assertThat(actualValue1).isEqualTo(expectedValue1);
        assertThat(actualValue2).isEqualTo(expectedValue2);
    }

    @Test
    void Test_compute_Grade_valuesBetween93And96_gradeA(int grade)
    {
        int grade1 = 96;
        String expectedValue1 = "A";
        String actualValue1 = compute_Grade(grade1);

        int grade2 = 93;
        String expectedValue2 = "A";
        String actualValue2 = compute_Grade(grade2);

        assertThat(actualValue1).isEqualTo(expectedValue1);
        assertThat(actualValue2).isEqualTo(expectedValue2);
    }

    @Test
    void Test_compute_Grade_valuesBetween89And92_gradeAMinus()
    {
        int grade1 = 92;
        String expectedValue1 = "A-";
        String actualValue1 = compute_Grade(grade1);

        int grade2 = 89;
        String expectedValue2 = "A-";
        String actualValue2 = compute_Grade(grade2);

        assertThat(actualValue1).isEqualTo(expectedValue1);
        assertThat(actualValue2).isEqualTo(expectedValue2);
    }

    @Test
    void Test_compute_Grade_valuesBetween84And88_gradeBPlus()
    {
        int grade1 = 88;
        String expectedValue1 = "B+";
        String actualValue1 = compute_Grade(grade1);

        int grade2 = 84;
        String expectedValue2 = "B+";
        String actualValue2 = compute_Grade(grade2);

        assertThat(actualValue1).isEqualTo(expectedValue1);
        assertThat(actualValue2).isEqualTo(expectedValue2);
    }

    @Test
    void Test_compute_Grade_valuesBetween80And83_gradeB()
    {
        int grade1 = 83;
        String expectedValue1 = "B";
        String actualValue1 = compute_Grade(grade1);

        int grade2 = 80;
        String expectedValue2 = "B";
        String actualValue2 = compute_Grade(grade2);

        assertThat(actualValue1).isEqualTo(expectedValue1);
        assertThat(actualValue2).isEqualTo(expectedValue2);
    }

    @Test
    void Test_compute_Grade_valuesBetween76And79_gradeBMinus()
    {
        int grade1 = 79;
        String expectedValue1 = "B-";
        String actualValue1 = compute_Grade(grade1);

        int grade2 = 76;
        String expectedValue2 = "B-";
        String actualValue2 = compute_Grade(grade2);

        assertThat(actualValue1).isEqualTo(expectedValue1);
        assertThat(actualValue2).isEqualTo(expectedValue2);
    }

    @Test
    void Test_compute_Grade_valuesBetween73And75_gradeCPlus()
    {
        int grade1 = 75;
        String expectedValue1 = "C+";
        String actualValue1 = compute_Grade(grade1);

        int grade2 = 73;
        String expectedValue2 = "C+";
        String actualValue2 = compute_Grade(grade2);

        assertThat(actualValue1).isEqualTo(expectedValue1);
        assertThat(actualValue2).isEqualTo(expectedValue2);
    }

    @Test
    void Test_compute_Grade_valuesBetween70And72_gradeC()
    {
        int grade1 = 72;
        String expectedValue1 = "C";
        String actualValue1 = compute_Grade(grade1);

        int grade2 = 70;
        String expectedValue2 = "C";
        String actualValue2 = compute_Grade(grade2);

        assertThat(actualValue1).isEqualTo(expectedValue1);
        assertThat(actualValue2).isEqualTo(expectedValue2);
    }

    @Test
    void Test_compute_Grade_valuesBetween67And69_gradeCMinus(int grade)
    {
        int grade1 = 69;
        String expectedValue1 = "C-";
        String actualValue1 = compute_Grade(grade1);

        int grade2 = 67;
        String expectedValue2 = "C-";
        String actualValue2 = compute_Grade(grade2);

        assertThat(actualValue1).isEqualTo(expectedValue1);
        assertThat(actualValue2).isEqualTo(expectedValue2);
    }

    @Test
    void Test_compute_Grade_valuesBetween64And66_gradeDPlus(int grade)
    {
        int grade1 = 66;
        String expectedValue1 = "D+";
        String actualValue1 = compute_Grade(grade1);

        int grade2 = 64;
        String expectedValue2 = "D+";
        String actualValue2 = compute_Grade(grade2);

        assertThat(actualValue1).isEqualTo(expectedValue1);
        assertThat(actualValue2).isEqualTo(expectedValue2);
    }

    @Test
    void Test_compute_Grade_valuesBetween60And63_gradeD(int grade)
    {
        int grade1 = 63;
        String expectedValue1 = "D";
        String actualValue1 = compute_Grade(grade1);

        int grade2 = 60;
        String expectedValue2 = "D";
        String actualValue2 = compute_Grade(grade2);

        assertThat(actualValue1).isEqualTo(expectedValue1);
        assertThat(actualValue2).isEqualTo(expectedValue2);
    }

    @Test
    void Test_compute_Grade_valuesBetween0And59_gradeF(int grade)
    {
        int grade1 = 59;
        String expectedValue1 = "F";
        String actualValue1 = compute_Grade(grade1);

        int grade2 = 0;
        String expectedValue2 = "F";
        String actualValue2 = compute_Grade(grade2);

        assertThat(actualValue1).isEqualTo(expectedValue1);
        assertThat(actualValue2).isEqualTo(expectedValue2);
    }

    /////////////////////////////////////////////////
    ////////////// compute Gpa TEST ///////////////
    /////////////////////////////////////////////////

    @Test
    void Test_compute_GPA_gradeAPlus_Gpa4()
    {
        String grade = "A+";

        String expectedValue = "4";

        String actualValue = compute_GPA(grade);

        assertThat(actualValue).isEqualTo(expectedValue);
    }

    @Test
    void Test_compute_GPA_gradeA_Gpa4()
    {
        String grade = "A";

        String expectedValue = "4";

        String actualValue = compute_GPA(grade);

        assertThat(actualValue).isEqualTo(expectedValue);
    }

    @Test
    void Test_compute_GPA_gradeAMinus_Gpa3_7()
    {
        String grade = "A-";

        String expectedValue = "3.7";

        String actualValue = compute_GPA(grade);

        assertThat(actualValue).isEqualTo(expectedValue);
    }

    @Test
    void Test_compute_GPA_gradeBPlus_Gpa3_3()
    {
        String grade = "B+";

        String expectedValue = "3.3";

        String actualValue = compute_GPA(grade);

        assertThat(actualValue).isEqualTo(expectedValue);
    }

    @Test
    void Test_compute_GPA_gradeB_Gpa3()
    {
        String grade = "B";

        String expectedValue = "3";

        String actualValue = compute_GPA(grade);

        assertThat(actualValue).isEqualTo(expectedValue);
    }

    @Test
    void Test_compute_GPA_gradeBMinus_Gpa2_7()
    {
        String grade = "B-";

        String expectedValue = "2.7";

        String actualValue = compute_GPA(grade);

        assertThat(actualValue).isEqualTo(expectedValue);
    }

    @Test
    void Test_compute_GPA_gradeCPlus_Gpa2_3()
    {
        String grade = "C+";

        String expectedValue = "2.3";

        String actualValue = compute_GPA(grade);

        assertThat(actualValue).isEqualTo(expectedValue);
    }

    @Test
    void Test_compute_GPA_gradeC_Gpa2()
    {
        String grade = "C";

        String expectedValue = "2";

        String actualValue = compute_GPA(grade);

        assertThat(actualValue).isEqualTo(expectedValue);
    }

    @Test
    @Tag("unit")
    @Tag("blackbox")
    void Test_compute_GPA_gradeCMinus_Gpa1_7()
    {
        String grade = "C-";

        String expectedValue = "1.7";

        String actualValue = compute_GPA(grade);

        assertThat(actualValue).isEqualTo(expectedValue);
    }

    @Test
    void Test_compute_GPA_gradeDPlus_Gpa1_3()
    {
        String grade = "D+";

        String expectedValue = "1.3";

        String actualValue = compute_GPA(grade);

        assertThat(actualValue).isEqualTo(expectedValue);
    }

    @Test
    void Test_compute_GPA_gradeD_Gpa1()
    {
        String grade = "D";

        String expectedValue = "1";

        String actualValue = compute_GPA(grade);

        assertThat(actualValue).isEqualTo(expectedValue);
    }

    @Test
    void Test_compute_GPA_gradeF_Gpa0()
    {
        String grade = "F";

        String expectedValue = "0";

        String actualValue = compute_GPA(grade);

        assertThat(actualValue).isEqualTo(expectedValue);
    }
}