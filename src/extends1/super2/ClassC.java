package extends1.super2;

public class ClassC extends ClassB{
    public ClassC() {
        //super(); -> ClassB에 기본 생성자가 없으면 직접 super로 호출해줘야함
        super(10, 20);
        System.out.println("ClassC 생성자");
    }
}
