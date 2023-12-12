package Chapter_02;

public class C$_Method2 {
    public static void main(String[] args) {
        Student student1 = creatStudent("학생1", 15, 90); // 1. 메서드 호출
        // 4. <creatStudent("학생1", 15, 90)>이 아래의 return된 <student(참조값 x001)>로 변경됨 -> 이게 대입 연산자(=)에 의해 student1에 대입됨
        Student student2 = creatStudent("학생2", 16, 80);


        printStudent(student1);
        printStudent(student2);
    }

    static Student creatStudent(String name, int age, int grade) { // 2. 호출 받은 메서드
        Student student = new Student(); // 2-1. 인스턴스 생성, 변수 선언, 참조값 대입 (x001)
        student.name = name; // 2-2. 위에서 넘어온 값들을 대입
        student.age = age;
        student.grade = grade;
        return student; // 3. (변경된) 인스턴스의 참조값을 메서드 밖으로 반환 (x001)
        // 메서드 안에서 객체를 생성했기 때문에 만들어진 객체를 메서드 밖에서 사용할 수 있게 돌려줘야 한다.
        // 메서드 호출 결과는 return을 통해 메서드 밖으로 반환할 수 있다!
    }

    static void printStudent (Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
