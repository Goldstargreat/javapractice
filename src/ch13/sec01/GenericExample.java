package ch13.sec01;

public class GenericExample
{
    public static void main(String[] args)
    {
        Box<String> box1 = new Box<>();
        // T를 String으로 정해서 Box 객체를 만듭니다.
        //오른쪽의 new Box<>()에서 <>를 다이아몬드 연산자라고 합니다.
        // 왼쪽에 이미 <String>을 썼기 때문에 오른쪽은 비워 둬도 컴파일러가 알아서 String으로 채웁니다.
        // 원래는 new Box<String>()이라고 써야 합니다.
        box1.content = "안녕하세요";
        // content는 이제 String 타입이므로 문자열을 넣을 수 있습니다.
        // 여기에 box1.content = 100;처럼 숫자를 넣으면 컴파일 에러가 납니다.
        // 잘못된 타입을 넣는 실수를 미리 막아 주는 것이 제네릭의 장점입니다.
        String str = box1.content;
        // content를 꺼내서 String 변수에 바로 저장합니다. 형변환(캐스팅)이 필요 없습니다.
        System.out.println(str);

        Box<Integer> box2 = new Box<>();
        box2.content = 100;
        int value = box2.content;
        System.out.println(value);
    }
}
