package Chapter_02;

// 메서드 호출 - 기본형, 참조형
// 기본형: 기본형 값을 전달하면, 해당 값이 복사되어 전달됨 -> 메서드 내에서 매개변수 값을 변경해도 호출자의 변수값에는 영향 X

public class B_MethodChange1 { // 기본형
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a); // 10
        changePrimitive(a); // 10 (a를 호출, a의 값을 복사하여! 아래 메서드의 x에 대입)
        System.out.println("메서드 호출 후: a = " + a); // 10
    }

    static void changePrimitive(int x) { // x는 10
        x = 20; // x는 20으로 변경
    }
}
