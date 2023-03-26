package 周六天;

//公鸡  5块
//母鸡  3块
//小鸡  1/
//一共有100快钱
//一共10只🐔

public class 百钱百鸡 {
    public static void main(String[] args) {
        int g=5;
        int m=3;
        for(int i=0;i<=20;i++){
            for(int j=0;j<34;j++){
                for(int k=0;k<300;k+=3){
                    if((((i*g)+(j*m)+(k/3))==100)&&(i+j+k==100)){
                        System.out.println("公鸡有: "+i+" 母鸡有: "+j+" 小鸡有: "+k);
                    }
                }
            }
        }


    }
}
