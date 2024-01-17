package poly.diamond;

//인터페이스는 다중구현이 가능! 따라서 InterfaceA, InterfaceB 두개의 다중구현
public class Child implements InterfaceA, InterfaceB{
    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }
}
