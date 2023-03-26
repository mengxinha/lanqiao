package 周六天;

public class 解数字谜 {
    public static void main(String[] args) {

        int[] arr = new int[5];
        int[] arr1 = new int[6];
        int k = 0;
        int j = 0;
        int x = 0;
        int d = 0;
        int judge = 0;
        for (int i = 20000; i < 100000; i++) { // 12312  45645  11223
            k = i;
            j = 0;
            judge = 0;
            while (k / 10 != 0) {
                arr[j] = k % 10;
                j++;
                k /= 10;
            }
            arr[j] = k;
            if ((arr[4] == arr[1]) && (arr[3] == arr[0]) && (arr[2] != arr[0]) && (arr[2] != arr[1])) {
                x = arr[4] * 10000 + arr[3] * 1000 + arr[2] * 100 + arr[1] * 10 + arr[0];
                d = x * arr[4];
                int dd = d;
                j = 0;
                while (dd / 10 != 0) {
                    arr1[j] = dd % 10;
                    j++;
                    dd /= 10;
                }
                arr1[j] = dd;
                for (int o = 0; o < 6; o++) {
                    for (int p = 0; p < 6; p++) {
                        if (arr1[o] != arr1[p]) {
                               judge = 1;
                               break;
                        }
                        if(judge==1) break;
                    }
                    if(judge==1) break;

                }
              if(judge == 0) System.out.println("A="+arr[4] + "  B=" + arr[3] + "  C=" + arr[2] + "  D=" + d/100000);
            }else continue;;
        }
    }


}

