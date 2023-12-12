package Chapter_02;

public class A_VarChange1 {

    public static void main(String[] args) {
        int a = 10;
        int b = a; // 현재의! 값을 복사, 대입
        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 10

        // 변수 a의 값 변경
        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 10
        // 위의 int b = a;는 당시의 값을 복사해서 대입한 것임.
        // b가 a와 연결되어 그때그때 변경되는 것이 아님!

        // 변수 b의 값 변경
        b = 30;
        System.out.println("변경 b = 30");
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 30


    }
}
