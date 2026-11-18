package ch13.sec03.exam01;

public class GenericExample
{ // 제네릭 메서드
    public static <T> Box<T> boxing(T t)
    {
        Box<T> box  = new Box<T>(); // 상자 하나 가져와서
        box.set(t); // 받은 물건 넣고
        return box; // 상자를 건네줌
    }

    public static void main(String[] args)
    {
        // 제네릭 메서드 호출
        Box<Integer> box1 = boxing(100);
        int intValue = box1.get();
        System.out.println(intValue);

        // 제네릭 메서드 호출
        Box<String> box2 = boxing("홍길동");
        String strValue = box2.get();
        System.out.println(strValue);
    }
}
