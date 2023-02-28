package 历年真题;

//请问 78120 有多少个约数
//96

public class 约数问题 {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=78120;i++)
        {
            if(78120%i==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
