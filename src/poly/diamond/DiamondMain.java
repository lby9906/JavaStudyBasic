package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        //부모는 자식을 담을 수 있음
        InterfaceA a = new Child(); //인스턴스는 Child의 인스턴스
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();
    }
}
