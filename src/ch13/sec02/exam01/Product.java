package ch13.sec02.exam01;

// 제네릭 타입
public class Product<K, M>
{ // 필드
    private K kind;
    private M model;
    // 메서드
    public K getKind()
    {
        return this.kind;  // getter는 필드값을 꺼내주는 메서드입니다
    }
    public M getModel()
    {
        return this.model; // 리턴 타입이 K, M이므로, 사용할 때 정한 타입(Tv, String 등)이 그대로 반환됩니다
    }
    public void setKind(K kind){this.kind = kind; }
    public void setModel(M model){this.model = model; }
    // setter는 필드에 값을 넣는 메서드입니다
    // 매개변수 타입도 K, M이라서 정해진 타입의 값만 넣을 수 있습니다.
    // this.kind = kind;에서 this.kind는 필드이고, 오른쪽 kind는 매개변수입니다.
}
