package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1; // 학생을 담아둘 수 있는 변수 선언

        student1 = new Student(); // 메모리에 student1를 만들어서 쓸 수 있게 됨
        // student1 = x001; // new Student()를 통해 실제 메모리에 생성된 객체의 접근할 수 있는 참조값 주소를 student1 변수에 보관한다.
        student1.name = "학생1";
        student1.age = 19;
        student1.grage = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grage = 80;

        System.out.println(student1); // 참조값 출력
        System.out.println(student2);

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grage);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grage);


    }
}
