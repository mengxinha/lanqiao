package 历年真题;

// 2020 年 7月1日是d成立 99 周年的纪念日
// d成立于1921年 7月23日
// 请问从 1921年7月23日中午12时到2020年7月1日中午12时一共包含多少分钟
// 我算的答案少了一天


public class 纪念日 {
    public static void main(String[] args) {
        int year = 1921;
        int day=0;
        int []month = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
        for(year =1921;year<2021;year++)
        {
            if(((year%4==0)&&(year%100!=0))||((year%100==0)&&(year%400!=0)))
                month[2]=29;
            else
                month[2]=28;

            int k=1;
            if(year==1921) k=7;
            else k=1;

            for(int m=k;m<13;m++)
            {

                int s=0;
                if(year==1921&&m==7) s=23;
                else s=1;

                if(year==2020&&m==7)
                {
                    System.out.println(day);
                    System.out.println(day*24*60);
                    return;
                }

                for(int d=s;d<=month[m];d++)
                {
                    day++;
                }
            }
        }

    }
}
