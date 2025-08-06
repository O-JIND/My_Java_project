package Practice_Thread.PC;

public class PCMain {
    public static void main(String[] args) {
        Box box = new Box();
        Producer producer = new Producer(box);
        Consumer consumer = new Consumer(box);


        producer.start();
        consumer.start();


    }
}
