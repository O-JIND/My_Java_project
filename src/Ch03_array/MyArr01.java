package Ch03_array;

public class MyArr01 {
    public static void main(String[] args) {


        int[] arr = {1, 23, 12, 246, 124, 56, 54, 82};
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            arr[i] = (int) (Math.random() * 100);

        }

        for (int i = 0; i < l; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

