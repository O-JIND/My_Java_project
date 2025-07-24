package Practice;

public class Student {
    String name;

    // 생성자 (객체가 생성될 때 자동 호출됨)
    public Student(String name) {
        this.name = name;
        System.out.println("생성자 호출됨! 이름: " + name);
    }

    // 일반 메서드
    public void hello() {
        System.out.println("안녕하세요, " + name + "입니다.");
    }

    // main 메서드 (JVM이 제일 먼저 호출함)
    public static void main(String[] args) {
        Student s = new Student("지민");  // 생성자 호출됨
        s.hello();                        // 일반 메서드 호출됨
    }
}

