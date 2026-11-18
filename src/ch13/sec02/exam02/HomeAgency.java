package ch13.sec02.exam02;

public class HomeAgency implements Rentable<Home> // P rent()가 Home rent()로 바뀝니다.
{
    @Override
    public Home rent()
    {
        return new Home(); // 새 Home 객체를 만들어 돌려줍니다. 즉, 집 한 채를 빌려줍니다.
    }
}

// 주택 대여 업체
