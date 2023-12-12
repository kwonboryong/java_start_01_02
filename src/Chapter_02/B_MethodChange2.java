package Chapter_02;

// 메서드 호출 - 기본형, 참조형
// 기본형: 기본형 값을 전달하면, 해당 값이 복사되어 전달됨 -> 메서드 내에서 매개변수 값을 변경해도 호출자의 변수값에는 영향 X
// 참조형: 참조형 값으로 전달하면, 참조값!(주소)이 복사되어 전달됨 -> 매개변수로 전달된 객체의 멤버 변수를 변경하면 호출자의 변수도 변경됨

public class B_MethodChange2 { // 참조형
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value =" + dataA.value); // 10
        System.out.println("dataA = " + dataA);
        changeReference(dataA); // 인스턴스 Data의 참조값을 복사, 밑의 메서드 dataX에 대입
        System.out.println("메서드 호출 후: dataA.value =" + dataA.value); // 20
    }

    static void changeReference(Data dataX) { // dataA에 있는 참조값을 복사해서 가져옴 (dataX = Data의 참조값)
        System.out.println("dataX = " + dataX);
        dataX.value = 20;
    }
} // dataA와 dataX는 같은 인스턴스를 참조함
