package thinkingInJava;

class Student {
    String studentName;
    String course;
    static String school;

    public static void main(String[] args) {
        Student student1 = new Student();

        student1.studentName = "Ihechikara";
        student1.course = "Data Visualization";
        student1.school = "freeCodeCamp";

        System.out.println(student1.studentName + " " + student1.course
                + " " + student1.school + "\n");

    }
}