package 历年真题;

//【问题描述】
//        这天小明正在学数数。他突然发现有些正整数的形状像一座“山”，比如 123565321、145541，
//        它们左右对称（回文）且数位上的数字先单调不减，后单调不增。
//        小明数了很久也没有数完，他想让你告诉他在区间 [2022, 2022222022] 中有多少个数的形状像一座“山”。

//最终结果：3138 。
public class 山 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 2022; i <= 2022222022; i++) {
            if (isMirror(i)) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    public static boolean isMirror(int num) {
        StringBuffer str = new StringBuffer(num + "");
        if ((str.toString()).equals(str.reverse().toString()))
            return true;
        return false;
    }

    public static boolean isUp(int num) {
        String st = num + "";
        int len = (st.length() % 2 == 0 )? (st.length() / 2 ): (st.length() / 2 + 1);
        for (int i = 1; i < len; i++) {
            if (st.charAt(i) < st.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
//        int count=0;
//        long i;
//        for(i=2022;i<=2022222022;i++){
//            String a = ""+i;
//            char []b = a.toCharArray();
//            int k= b.length;
//            boolean j=true;
//            int index=0;
//            while(j){
//                if(b[index]==b[k-1]){
//                    index++;
//                    k--;
//                    if(index>=k) count++;
//                }
//                else break;
//            }
//
//        }
//        System.out.println(count);
//    }

