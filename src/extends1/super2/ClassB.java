package extends1.super2;

public class ClassB extends ClassA{

    public ClassB(int a) {
        //super(); //기본 생성자 생략 가능 (ClassA 기본생성자)
        this(a, 0); //-> ClassB생성자 자기 자신 선택 -> 하나는 this, 다른 하나는 꼭 super();가 있어야함
        System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a, int b) {
        super(); //기본 생성자 생략 가능 (ClassA 기본생성자)
        System.out.println("ClassB 생성자 a=" + a + " b=" + b);
    }
}
