package Practice_myself;

public interface TestInner {
    int data = 10000;
    public void printData();
}

class AnnoyInner{
    public void test(){
    new TestInner(){
        public void printData(){
            System.out.println("data :"+data);
        }


    }.printData();
}

public static void main(String[] args) {
    AnnoyInner ai = new AnnoyInner();
    ai.test();
}
}