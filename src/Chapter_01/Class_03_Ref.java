package Chapter_01;

// 클래스에 배열 사용하기

public class Class_03_Ref {
    public static void main(String[] args) {
        Class_01 student1 = new Class_01(); // x001
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Class_01 student2 = new Class_01(); // x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Class_01[] students = new Class_01[2]; // x005
        // 클래스로 배열 사용 <클래스명[] 변수명 = new 클래스명[];>
        // Class_01의 변수를 2개 보관할 수 있는 사이즈의 배열을 생성, students는 Class_01 타입의 참조값을 보관한다.
        // 아직 참조값을 대입하지 않아서 null로 초기화됨
        students[0] = student1; // 변수 student1의 참조값!!!을 복사해서 배열 students[0]에 보관 (인스턴스가 있는게 아니라 참조값이 있음)
        students[1] = student2; // x002를 x005의 [1](두 번째 인덱스)에 저장

        System.out.println("이름:" + students[0].name + ", 나이: " + students[0].age + ", 성적: " + students[0].grade);
        // 객체 값 출력도 <변수명.데이터명>
        // 배열 students에 접근(x005) -> [0]인덱스에 접근 -> [0]에는 student1의 참조값이 있다(x001) -> student1의 name에 접근
        System.out.println("이름:" + students[1].name + ", 나이: " + students[1].age + ", 성적: " + students[1].grade);
    }
}
