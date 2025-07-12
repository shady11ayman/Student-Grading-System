package MathUtils;

public class Student {


    private String name;
    private String number;

    private int activitiesMark ;
    private int practicalMark ;
    private int midtermExamMark ;
    private int finalExamMark ;

    private float gpa;
    private String grade;


    // constructor
    public Student(String name, String number, int activitiesMark, int practicalMark, int midtermExamMark, int finalExamMark) {
        this.name = name;
        this.number = number;
        this.activitiesMark = activitiesMark;
        this.practicalMark = practicalMark;
        this.midtermExamMark = midtermExamMark;
        this.finalExamMark = finalExamMark;
    }


    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
       // return true ;
        System.out.print("OK");
    }


    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getName() {
        return name;
    }

    public int setName(String name) {
        if(name.isEmpty()){
            System.out.print("invalid student name empty");
            return 0 ;
        }

        else if (Character.isWhitespace(name.charAt(0))) {
            System.out.print("invalid student name start with space");
            return 0 ;
        }

        else if (name.matches("^[a-zA-Z]+$")) {
            System.out.print("invalid name containing Alphabetic only");
            return 0;
        }


        else {
            for(char c:name.toCharArray()){
                if(Character.isDigit(c)){
                    System.out.print("invalid student name containing numbers");
                    return 0;
                }
                else if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)){
                    System.out.print("invalid student name contains special symbol");
                    return 0;
                }
            }
            this.name = name ;
             System.out.print("correct student name info");
             return 1;
        }
    }


    public String getNumber() {
        return number;
    }

    public int setNumber(String number) {
        if(number.length() != 8) {
            System.out.print("invalid width number");
            return 0 ;
        }

        else if (!Character.isLetterOrDigit(number.charAt(7)) && !Character.isWhitespace(number.charAt(7)))
        {
            System.out.print("invalid number contains special symbol");
            return 0 ;
        }

        else if (Character.isWhitespace(number.charAt(7)))
        {
            System.out.print("invalid number contains Space");
            return 0 ;
        }

        else{
            for (int i = 0; i < 7; i++) {
                if (Character.isLetter(number.charAt(i))) {
                    System.out.print("invalid number contains alphabetic");
                    return 0 ;
                }

                else if (!Character.isLetterOrDigit(number.charAt(i)) && !Character.isWhitespace(number.charAt(i)) )
                {
                    System.out.print("invalid number contains special symbol");
                    return 0 ;
                }

                else if (Character.isWhitespace(number.charAt(i))) {
                    System.out.print("invalid number contains space");
                    return 0 ;
                }
            }
            this.number = number;
            System.out.print("Valid Number");
            return 1;
        }
    }

    public int getActivitiesMark() {
        return activitiesMark;
    }

    public int setActivitiesMark(int activitiesMark) {
        if(activitiesMark < 0 || activitiesMark > 10)
        {
           System.out.print("invalid ActivityMark out of range");
           return 0 ;
        }

        else {
            this.activitiesMark = activitiesMark;
            System.out.print("Valid ActivityMark");
            return 1 ;
        }
    }

    public int getPracticalMark() {
        return practicalMark;
    }

    public int setPracticalMark(int practicalMark) {
        if(practicalMark < 0 || practicalMark > 10)
        {
            System.out.print("invalid PracticalMark out of range");
            return 0 ;
        }

        else {
            this.practicalMark = practicalMark;
            System.out.print("Valid PracticalMark");
            return 1 ;
        }
    }


    public int getMidtermExamMark() {
        return midtermExamMark;
    }

    public int setMidtermExamMark(int midtermExamMark) {
        if(midtermExamMark < 0 || midtermExamMark > 20)
        {
            System.out.print("invalid MidtermMark out of range");
            return 0 ;
        }

        else {
            this.midtermExamMark = midtermExamMark;
            System.out.print("Valid MidtermMark");
            return 1 ;
        }
    }


    public int getFinalExamMark() {
        return finalExamMark;
    }

    public int setFinalExamMark(int finalExamMark) {
        if(finalExamMark < 0 || finalExamMark > 60)
        {
            System.out.print("invalid FinalMark out of range");
            return 0 ;
        }

        else {
            this.finalExamMark = finalExamMark;
            System.out.print("Valid FinalMark");
            return 1 ;
        }
    }

}