package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //추가
    MemberConstruct(String name, int age) {
        this(name, age, 50); //변경 -> this() 기능 사용하면 생성자 내부에서 자신의 생성자를 호출할 수 있다.(중복제거)
        //첫번째 생성자 내부에서 두번째 생성자를 호출한다.
        //this()는 생성자 코드의 첫줄에서만 작성 가능
    }


    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
