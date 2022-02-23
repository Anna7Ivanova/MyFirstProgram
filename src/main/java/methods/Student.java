package methods;

public class Student {
    private String faculty;
    private int facultyNumber;
    private static String university;

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(int facultyNumber) {
        this.facultyNumber = facultyNumber;
    }
    //napravih constructor za klas student
    public Student(int facultyNumber){
        this.facultyNumber = facultyNumber;
    }
    public Student(String faculty){
        this.faculty = faculty;
    }
    public Student (String faculty, int facultyNumber){
        this.faculty = faculty;
        this.facultyNumber = facultyNumber;
    }

    public String takeExam(boolean successCriteria) {
        String result;
        if (successCriteria) {
            result = "Successfully taken the exam.";
        } else {
            result = "I am sad!";
        }
        return result;
    }

    public int getNumberOfSubjects(int numberOfMandatorySubjects) {
        return numberOfMandatorySubjects + 2; //sip,zip
    }

    public static String getUniversity() {
        return university;
    }

    public static void setUniversity(String university) {
        Student.university = university;
    }
    public void setLectureDay(WeekDays dayOfTheWeek){
        switch(dayOfTheWeek){
            case MON -> System.out.println("You have selected Monday.");
            case FRI -> System.out.println("You have selected Friday.");

        }
    }
}