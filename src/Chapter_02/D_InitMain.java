package Chapter_02;

public class D_InitMain {
    public static void main(String[] args) {
        D_InitData data = new D_InitData();
        System.out.println("value1 = " + data.value1); // 기본값 0으로 초기화됨, 0 출력
        System.out.println("value2 = " + data.value2);
    }
}

// 단축키 ctrl + B = 해당 코드로 바로 이동