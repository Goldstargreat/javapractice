package ch08.sec04;

public interface RemoteControl
{   // 상수필드
    public static final int MAX_VOLUME = 10;
    public static final int MIN_VOLUME = 0;

    // 추상 메서드
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
