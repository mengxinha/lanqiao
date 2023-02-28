package 历年真题;

//需要制作2020户门牌 从 1-2020
//问总共需要几个字符 2


public class 门牌制作 {
    public static void main(String[] args) {
        int count=1; // 个位数 2
        for(int i=10;i<100;i++)
        {
            int a = i%10;
            int b = i/10;
            if(a==2)
                count++;
            if(b==2)
                count++;
        }
        for(int i=100;i<1000;i++)
        {
            int a = i%10;
            int b = i/10%10;
            int c = i/100;
            if(a==2)
                count++;
            if(b==2)
                count++;
            if(c==2)
               count++;

        }
        for(int i=1000;i<2021;i++)
        {
            int a = i%10;
            int b = i/10%10;
            int c = i/100%10;
            int d = i/1000;
            if(a==2)
                count++;
            if(b==2)
                count++;
            if(c==2)
                count++;
            if(d==2)
                count++;

        }
        System.out.println(count);
    }
}
