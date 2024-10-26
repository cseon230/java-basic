package class1;

public class ClassStart5 {

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

        Student[] students = {student1, student2}; // 이런식으로 배열 선언과 동시에 초기화를 할 수 있다

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grage);
        }

        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grage);
        }

        for (Student s : students) { // 향상된 for문
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grage);
        }



    }
}
