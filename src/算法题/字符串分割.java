package 算法题;

// s = "leetcode"
// dict = [ "leet" ," code"]
//所以可以被分割，返回true

//状态：F（i）字符串前 i 个字符是否可以被分割
//状态转移方程：F（i）：j<i && F（j）&& [j+1,i] 是否可以在词典中找到
//初始状态：F（0）：true
//返回结果：F（字符串的长度）：F（s.length（））

import java.util.Set;

public class 字符串分割 {

    static boolean wordBreak(String s, Set<String> dict){
        boolean[] canBreak = new boolean[s.length()+1];

        canBreak[0]=true;

        for(int i=1;i<s.length();i++){
            for(int j=0;j<i;j++){
                if(canBreak[j] && dict.contains((s.substring(j,i))))  //左闭右开
                {
                    canBreak[i]=true;
                    break;
                }
            }
        }
        return canBreak[s.length()];
    }

    public static void main(String[] args) {
//        boolean ret = wordBreak("leetcode","klk","bk");
//        System.out.println(ret);

    }


}
