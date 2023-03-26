package 周六天;

public class 求xx2 {
    public static int test(int i, int j) {
        if (i != j) return 0;
        else return 1;
    }

    public static void main(String[] args) {
        int k = 0;
        int b = 0;
        int sum=0;
        int count=0;
        int[] arr = new int[9];
        for (int i = 10000; i < 100000; i++) {
            b = i * i;
            if (b > 100000000) {
                sum=0;
                k = b;
                int j = 0;
                while (k >= 10) {   // 123456789
                    arr[j] = k % 10;
                    j++;
                    k /= 10;
                }
                arr[j] = k;
                for (int o = 1; o < 9; o++) {
                    for (int p = 0; p < o; p++) {
                        sum += test(arr[o], arr[p]);
                        if (sum > 0) break;
                    }
                    if (sum > 0) break;
                }
                if (sum == 0) {
                    System.out.print(i + " ");
                    System.out.println(b);
                    count++;
                }
            }
        }
        System.out.println("数量" + count);
    }

}

