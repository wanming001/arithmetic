import com.wan.binarySearch.BinarySearch;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] a = new int[]{1,2,5,7,9,23};
        int i = BinarySearch.binarySort(a, 23);
        System.out.println(i);
    }
}
