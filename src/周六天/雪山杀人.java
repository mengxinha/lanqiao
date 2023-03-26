package 周六天;



public class 雪山杀人 {

    public static int test1(char i, char j)
    {
        if(i!=j) return 0;
        else return 1;
    }
    public static int test2(char i, char j)
    {
        if(i==j) return 0;
        else return 1;
    }
    public static void main(String[] args) {
        char x;
        for(x='A';x<='D';x++){
//            if((x!='A')+(x=='C')+(x=='D')+(x!='D')==3)
//
//            {
//                System.out.println(x);
//            }
            if(test2(x,'A')+test1(x,'C')+test1(x,'D')+test2(x,'D')==3){
                System.out.println(x);
            }
        }


    }
}
