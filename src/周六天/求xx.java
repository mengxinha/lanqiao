package 周六天;

// 123456789
public class 求xx {
    public static int test(int i, int j){
        if(i!=j) return 0;
        else return 1;
    }
    public static void main(String[] args) {
        int k=0;
        int count=0;
        int a,b,c,d,e,f,g,h,j;
        for(int i=10000;i<100000;i++){
            k=i*i;
            if(k>100000000){
                a=k%10;
                b=k/10%10;
                c=k/100%10;
                d=k/1000%10;
                e=k/10000%10;
                f=k/100000%10;
                g=k/1000000%10;
                h=k/10000000%10;
                j=k/100000000;
                if(test(a,b)+test(a,c)+test(a,d)+test(a,e)+test(a,f)+test(a,g)+test(a,h)+test(a,j)+
                        test(b,c)+ test(b,d)+ test(b,e)+ test(b,f)+ test(b,g)+ test(b,h)+ test(b,j)+test(c,d)+
                        test(c,e)+test(c,f)+test(c,g)+test(c,f)+test(c,j)+test(d,e)+test(d,f)+test(d,g)+test(d,h)+
                        test(d,j)+test(e,f)+test(e,g)+test(e,h)+test(e,j)+test(f,g)+test(f,h)+test(f,j)+test(g,h)+
                        test(g,j)+test(h,j)==0){
                    System.out.println(i);
                    count++;
                }

            }

        }
        System.out.println(count);
    }
}
