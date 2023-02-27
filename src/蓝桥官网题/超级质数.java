package 蓝桥官网题;

import java.util.Scanner;

//Integer.parseInt()  可以将数字字符串转换为数字
//substring(i, j + 1)  截取下标i到j+1的字符串
//String s = "";s += sqln;  自动类型转换 把int型的sqln转换为String型

public class 超级质数 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int max = 0;
        for(int i = 53;i < 900000;i++){
            if(sqrtNum(i) && everyNumsqrt(i)){
                max = i;
            }
        }
        System.out.println(max);
        scan.close();
    }
    public static boolean sqrtNum(int sqln){
        for(int j = 2;j <= Math.sqrt(sqln);j++){
            if((sqln % j) == 0)return false;
        }
        return true;
    }
    public static boolean everyNumsqrt(int sqln){
        String s = "";
        s += sqln;
        for(int i = 0;i < s.length();i++){
            for(int j = i;j < s.length();j++){
                String substring = s.substring(i, j + 1);
                if(substring.equals("1"))return false;
                if(!sqrtNum(Integer.parseInt(substring)))return false;  //可以将数字字符串转换为数字
            }
        }
        return true;
    }
}

