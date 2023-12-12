package Chapter_02;

// NullPointerException 해결하기

public class F_NullPointerException3 {
    public static void main(String[] args) {
        BigData bigData = new BigData(); // x001
        bigData.data = new Data(); // x001의 data(bigData.data)에 참조할 객체(x002)를 만들어서 대입 (초기값인 null이 사라짐)
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        System.out.println("bigData.data.value = " + bigData.data.value);
        // bigData.data = x002 -> x002.value


    }
}
