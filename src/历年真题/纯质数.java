package 历年真题;

//如果一个正整数只有1和它本身两个约数，则称为一个质数（又称素数）。
//前几个质数是：2,3,5,7,11,13,17,19,23,29,31,37…。
//如果一个质数的所有十进制数位都是质数，我们称它为纯质数。例如：2,3,5,7,23,37都是纯质数，而11,13,17,19,29,31不是纯质数。当然1,4,35也不是纯质数。
//请问，在1到20210605中，有多少个纯质数？

//答案：1903

public class 纯质数 {

    static boolean pandaun(int i){   //i=133
        int p=0;
        int k=0;
        while(i!=0){
            if(i<10)  p=i;
            else{
                p=i%10;
            }
            for(int j=2;j<p;j++){
                if(p%j==0) {
                    k=1;
                    break;
                }
            }
            if(k==1) return false;
            else i/=10;
        }
        return true;
    }


    public static void main(String[] args) {
        int count = 1;  //纯质数的个数 把2一开始就算入
        for(int i=3;i<20210605;i+=2){
            int k=0;
            for(int j=2;j<i;j++){   //i =1230
                if(i%j==0) {
                    k = 1;
                    break;
                }
                else {
                    if((k==0)&&(j==i-1)){
                        if(pandaun(i)) count++;
                    }
                }
            }
        }
        System.out.println(count);

    }

}
