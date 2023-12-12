package Chapter_02;

public class C_Method1 {
    public static void main(String[] args) {
        Student student1= new Student(); // x001
        initStudent(student1, "학생1", 15, 90);
        // 아래 initStudent의 (Student student)에 student1(인스턴스 Student)의 참조값(x001)을 대입

        Student student2= new Student(); // x002
        initStudent(student2, "학생2", 16, 80);

        printStudent(student1); // student1의 참조값을 아래 printStudent메서드에 대입, initStudent메서드로 인해 바뀐 값이 출력됨
        printStudent(student2);
    }

    static void initStudent(Student student, String name, int age, int grade) {
        // 위의 student1(인스턴스 Student)의 참조값(x001)이 student에 대입됨 -> 인스턴스에 접근 가능!
        // x002 (student2)
        student.name = name; // x001.name -> "학생1", "학생2"
        student.age = age; // 15, 16
        student.grade = grade; // 90, 80
    }
    static void printStudent (Student student) { // 메서드
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
