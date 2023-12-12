package Chapter_02;

// null: 값이 없다
// 참조형 변수에 가리키는 객체가 없거나 가리키는 객체를 나중에 입력하고 싶으면(참조값이 없으면) null을 넣어둔다.
// GC (Garbage Collection): 아무도 참조하지 않는 인스턴스는 GC로, 메모리에서 제거된다.

public class E_NullMain {
    public static void main(String[] args) {
        Data data = null; // 참조값이 없다는 뜻
        System.out.println("1. data = " + data);

        data = new Data(); // 객체 생성 -> 참조값 생김 (값은 0으로 초기화됨)
        System.out.println("2. data = " + data);

        data = null; // 의도적으로 null 넣음 -> 참조할 대상이 없어짐 (Data인스턴스를 더 이상 참조하지 않음)
        System.out.println("3. data = " + data);
    }
}
