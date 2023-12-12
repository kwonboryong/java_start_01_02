package Chapter_02;

// NullPointerException : 참조값이 없는 곳을 찾아갈 때 발생하는 예외 (주소 없이 택배 보냄)
// 객체를 참조할 때 .(dot)을 사용한다. (.(dot)을 통해 해당 객체를 찾아갈 수 있음)
// 그런데 참조값이 null이라면(값이 없다), 찾아갈 수 있는 객체가 없다.
// Null Pointer Exception는 null에 .(dot)을 찍었을 때 발생한다.

// 지역변수가 null인 경우 (찾기 쉬움)
public class F_NullPointerException {
    public static void main(String[] args) {
        Data data = null; // 참조값이 없음
        data.value = 10; // NullPointerException 예외 발생 (data가 null임)
        System.out.println("data = " + data.value);

    }
}
