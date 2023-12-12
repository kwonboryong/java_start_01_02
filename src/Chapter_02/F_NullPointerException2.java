package Chapter_02;

public class F_NullPointerException2 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count); // 0
        System.out.println("bigData.data = " + bigData.data); // null (클래스 BigData의 data는 참조형, 참조형의 초기값은 null)

        // NullPointerException 발생
        System.out.println("bigData.data.value = " + bigData.data.value);
        // bigdata(=x001).data(=초기값 null).value => null에 .(dot)을 찍음 => NullPointerException


    }
}
