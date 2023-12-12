package Chapter_02;

public class A_VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data(); // 변수 선언, 객체(dataA) 생성, 참조값을 dataA에 대입
        dataA.value = 10;
        Data dataB = dataA; //변수 선언, 객체(dataB) 생성, dataA의 참조값을 복사해서 dataB에 대입

        System.out.println("dataA 참조값 = " + dataA); // 참조값 같음
        System.out.println("dataB 참조값 = " + dataB); // 참조값 같음

        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        // dataA 변경
        dataA.value = 20; // 클래스 Data에 가서 value를 변경
        System.out.println("변경 dataB.value = 20");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        // dataB 변경
        dataA.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);


    }



}
