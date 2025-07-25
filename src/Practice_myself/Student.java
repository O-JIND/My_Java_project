package Practice_myself;
/*
클래스 이름: Student

필드: name, grade, score

생성자 3종 오버로딩

기본 생성자 (모든 값 기본 설정)

이름만 받는 생성자

이름 + 학년 + 점수 다 받는 생성자

printInfo() 메서드로 정보 출력

*/

public class Student {

    String name, grade;
    double score;

    public Student() {
        this("NO ONE IN HERE", "Author", 0);
    }

    public Student(String name) {
        this(name, "없음", 0);
    }

    private void Print() {

        System.out.println(name + "   " + grade + "   " + score);
    }


    public Student(String name, String grade, double score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    public static void main(String[] args) {



    Student s1 = new Student();
    Student s2 = new Student("김진성");
    Student s3 = new Student("김진성", "B0", 80);

            s1.Print();
            s2.Print();
            s3.Print();
}
}




