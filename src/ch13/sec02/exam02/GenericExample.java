package ch13.sec02.exam02;

public class GenericExample
{
    public static void main(String[] args)
    {
        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        // 집을 빌립니다. rent()가 Home 타입을 그대로 리턴하기 때문에 (Home) 같은 형변환(캐스팅)이 필요 없습니다.
        home.turnOnLight();

        CarAgency carAgency = new CarAgency();
        Car car = carAgency.rent();
        car.run();
    }
}
