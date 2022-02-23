package methods;

public class Test {
    public static void main(String[] args) {
        Student ivo = new Student("KST", 12345);

        System.out.println(ivo.getFaculty());
        System.out.println(ivo.getFacultyNumber());

        System.out.println(ivo.takeExam(true));
        String ivoTakingExam = ivo.takeExam(true);

        int numberOfSubjectsForIvo = ivo.getNumberOfSubjects(12);
        int doubleTheWork = ivo.getNumberOfSubjects(12)*2;

        System.out.println(numberOfSubjectsForIvo);
        System.out.println(doubleTheWork);

        Student.setUniversity("Sofia University");
        System.out.println(Student.getUniversity());

        Student facultyOnly = new Student ("Engineer");
        Student facultyNumberOnly = new Student(12345);

        ivo.setLectureDay(WeekDays.FRI);

        //method reference Todo
        //Student::setUniversity("Sofia University");
    }
}
