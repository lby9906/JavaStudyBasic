package poly.ex3;

//abstract(추상)을 통해서 AbstractAnimal생성이 안되게 막음
public abstract class AbstractAnimal {

    //추상메서드가 있으면 클래스도 반드시 추상클래스이여야함
    //추상메서드는 바디가 x
    //추상메서드는 상속 받는 자식 클래스가 반드시 오버라이딩 해서 사용해야함
    public abstract void sound();

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
