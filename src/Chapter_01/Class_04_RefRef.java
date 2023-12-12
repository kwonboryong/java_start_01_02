package Chapter_01;

// 클래스에 배열 사용하기

public class Class_04_RefRef {
    public static void main(String[] args) {
        Class_01 student1 = new Class_01();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Class_01 student2 = new Class_01();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Class_01[] students = new Class_01[]{student1, student2};

        for (int i = 0; i < students.length; i++) { // 1번째 방법
            System.out.println("이름:" + students[i].name + ", 나이: " + students[i].age + ", 성적: " + students[i].grade);
        }

        for (int i = 0; i < students.length; i++) { // 2번째 방법
            Class_01 s = students[i]; // 반복되는 요소를 변수에 담아서 처리
            System.out.println("이름:" + s.name + ", 나이: " + s.age + ", 성적: " + s.grade);
        }

        for (Class_01 s : students) { // 3번째 방법 (for-each문), 단축키 <iter>
            System.out.println("이름:" + s.name + ", 나이: " + s.age + ", 성적: " + s.grade);
        }

    }
}