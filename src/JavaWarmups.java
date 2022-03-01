import java.util.Arrays;

public class JavaWarmups {

    public static void main(String[] args) {
        int [] warmup = {3 ,1, 7, 2, 8, 3, 5}; // [19, 10]
        int [] oddEven = new int[2];
        int odd = 0;
        int even = 0;

        for(int num: warmup) {
            if (num % 2 == 0) {
                even += num;
            } else {
                odd += num;
            }
        }
        oddEven[0] = odd;
        oddEven[1] = even;
        System.out.print("should be: ");
        System.out.println(Arrays.toString(oddEven));

        String[] languages = {"French", "Portuguese", "Dutch"};
        System.out.println(Arrays.toString(languages));
        Arrays.fill(languages, "French");
        System.out.println(Arrays.toString(languages));
        // changing the existing/original array
    }
}
