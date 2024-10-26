package class1;

public class ClassStart4 {

    public static void main(String[] args) {

        Student student1 = new Student(); // 메모리에 student1를 만들어서 쓸 수 있게 됨
        // student1 = x001; // new Student()를 통해 실제 메모리에 생성된 객체의 접근할 수 있는 참조값 주소를 student1 변수에 보관한다.
        student1.name = "학생1";
        student1.age = 19;
        student1.grage = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grage = 80;

        Student[] students = new Student[2]; // student 변수를 2개 보관할 수 있는 변수 생성

        students[0] = student1; // 변수에는 인스턴스 자체가 들어가는게 아니라 인스턴스 메모리 주소의 참조값만 들어있을 뿐이다.
        students[1] = student2; // = 시에는 인스턴스가 복사되는 것이 아니라 참조값만 복사된다.

        System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].grage);
        System.out.println("이름:" + students[1].name + " 나이:" + students[1].age + " 성적:" + students[1].grage);


    }
}
