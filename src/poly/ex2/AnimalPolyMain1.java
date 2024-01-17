package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);
    }

    private static void soundAnimal(Animal animal) { //dog, cat, caw 전달 -> 부모는 자식을 담을 수 있음
        //Animal animal animal변수는 자식 dog,cat,caw 인스턴스 모두 참조 o -> 다형적 참조
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); //animal.sound메서드가 안나오는 이유는 오버라이딩 메서드가 우선권을 가지기 때문!
        System.out.println("동물 소리 테스트 종료");
    }
}
