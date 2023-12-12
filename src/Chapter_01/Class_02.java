package Chapter_01;

// 클래스: int, String과 같은 사용자가 직접 만든 타입 (붕어빵 기계)
// 객체(인스턴스): 클래스를 통해 실제 메모리에 만들어진 실체 (붕어빵)

public class Class_02 {
    public static void main(String[] args) {
        Class_01 student1;
        // 1. 'Class_01' 타입의 객체를 받을 수 있는 변수(student1) 선언
        student1 = new Class_01();
        // 2. 클래스 'Class_01'의 정보를 기반으로 한 새로운 객체 생성, <new 클래스명();>
        // 클래스 'Class_01'의 참조값(주소)이 반환되고, 변수 student1에 저장된다.
        student1.name = "학생1";
        // 3. 변수 student1이 갖고 있는 참조값을 통해 객체 'Class_01'에 접근하여 값 대입, <변수명.데이터명>
        // student1(=Class_01)의 변수 name에 접근, 값 대입
        student1.age = 15;
        student1.grade = 90;
        // 인스턴스는 출처를 강조할 때 보통 사용 : student1은 Class_01의 인스턴스이다. (객체이다 (X))

        Class_01 student2 = new Class_01(); // 변수 선언 & 또 다른 새로운 객체 생성 (student1과는 서로 다른 참조값을 갖는다!!!)
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1); // 참조값 보기
        System.out.println(student2);

        System.out.println("이름:" + student1.name + ", 나이: " + student1.age + ", 성적: " + student1.grade);
        // 객체 값 출력도 <변수명.데이터명>
        System.out.println("이름:" + student2.name + ", 나이: " + student2.age + ", 성적: " + student2.grade);
    }
}
