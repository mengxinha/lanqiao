package oj;

import java.math.BigInteger;
import java.util.*;

public class 十六进制转八进制 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] nums = new String[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextLine();
        }
        char [] h= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        char [] o= {'0','1','2','3','4','5','6','7'};
        char [] d= {'0','1','2','3','4','5','6','7','8','9'};
        int x=0;
        for(int i=0;i<n;i++){
            int len = nums[i].length();
            for(int j=len-1;j>=0;j--) {
                 char a = nums[i].charAt(j);
                 x += a;
                System.out.println(x+"\n");


            }
        }
    }

//        public static void main(String[] args) {
////       创建扫描器
//            Scanner sc = new Scanner(System.in);
//            //获得输入16进制数的个数
//            int count = sc.nextInt();
////      判断输入的范围
//            if (count >= 1 && count <= 10) {
//                //创建一个数组
//                int[] arr = new int[count];
//                //对每一个数进行操作
//                for (int i = 0; i < count; i++) {
//                    //获得输入的16进制数字符串
//                    String H = sc.next();
//                    //转换为10进制
//                    Integer D = Integer.valueOf(H, 16);
//
//                    //转换为8进制字符串
//                    String num = Integer.toOctalString(D);
//                    //转换为Int类型
//                    int int1 = Integer.parseInt(num);
//                    //存入数组
//                    arr[i] = int1;
//                }
//                //遍历数组输出
//                for (int i = 0; i < arr.length; i++) {
//                    System.out.println(arr[i]);
//                }
//            }
//
//        }

}
