package ch13.sec02.exam02;

public class CarAgency implements Rentable<Car> // P 자리에 Car를 넣었다
{
    @Override
    public Car rent()
    {
        return new Car();
    }
}
