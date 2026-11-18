package ch13.sec02.exam01;

public class GenericExample
{
    public static void main(String[] args)
    { // K는 Tv로 대체, M은 String으로 대체
        Product<Tv, String> product1 = new Product<>(); // K는 Tv, M은 String으로 정해서 객체를 만듭니다.

        // Setter 매개값은 반드시 Tv와 String을 제공
        product1.setKind(new Tv());
        product1.setModel("스마트 Tv");
        // 이제 setKind()는 Tv 객체만, setModel()은 String만 받습니다.
        // Getter 리턴값은 Tv와 String이 됨
        Tv tv = product1.getKind();
        String tvModel = product1.getModel();
        // getKind()가 바로 Tv 타입을 돌려주므로, 형변환 (Tv) 없이 변수에 담을 수 있습니다.

        // 출력 추가
        System.out.println("종류: " + tv);
        System.out.println("모델: " + tvModel);

        // ----------------------------------------------------
        // K는 Car로 대체, M은 String으로 대체
        Product<Car, String> product2 = new Product<>();
        // Setter 매개값은 반드시 Car와 String을 제공
        product2.setKind(new Car());
        product2.setModel("SUV자동차");
        // Getter 리턴값은 Car와 String이 됨
        Car car = product2.getKind();
        String carModel = product2.getModel();

        // 출력 추가
        System.out.println("종류: " + car);
        System.out.println("모델: " + carModel);
    }
}