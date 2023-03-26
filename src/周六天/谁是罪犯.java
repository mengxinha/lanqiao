package 周六天;

public class 谁是罪犯 {
    public static int test(char a, int[] num){
        int len = num.length;
        int k=0;
        for(int i=0;i<len;i++){
            if(num[i]==a){
                k=1;
            }
        }
        if(k==0){
            return 1;
        }
        else return 0;

    }

    public static void main(String[] args) {  //1 是案犯
        int a,b,c,d,e,f;
        for(a=0;a<=1;a++){
            for(b=0;b<=1;b++){
                for(c=0;c<=1;c++){
                    for(d=0;d<=1;d++){
                        for(e=0;e<=1;e++){
                            for(f=0;f<=1;f++){
//                                if((a==0||b==0)&&(((a==0)&&(f==0))||((a==0)&&(e==0))||((e==0)&&(f==0)))&&
//                                        (((a==0)&&(d==1))||((a==1)&&(b==0)))&&(((b==0)&&(c==0))||((b==1)&&(c==1)))&&
//                                        (((c==0)&&(d==1))||((c==1)&&(d==0)))){
//                                    System.out.println(a+b+c+d+e+f);
//
//                                }
                                if((a+b>=1)&&(a+e+f>=2)&&(a+d<2)&&(b==c)&&(c+d==1)&&((d==0&&e!=1)||(d==1&&(e==0||e==1)))){
                                    System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
                                }

                            }

                        }

                    }

                }

            }


        }
    }
}
