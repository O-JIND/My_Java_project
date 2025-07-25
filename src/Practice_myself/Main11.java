package Practice_myself;

public class Main11 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.speak(); // "동물이 소리를 냅니다."

        Dog dog = new Dog();
        dog.speak();    // "멍멍!"

        Animal polyDog = new Dog();
        polyDog.speak(); // "멍멍!" ← 다형성에 의한 오버라이딩된 메서드 호출
    }
}