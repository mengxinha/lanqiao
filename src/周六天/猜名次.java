package 周六天;

public class 猜名次 {
    public static void main(String[] args) {
        char x;//第一名 学生 A，B，C，D
        char y;
        char z;
        char p;
        for(x='A';x<='D';x++){
            for(y='A';y<='D';y++){
                for(z='A';z<='D';z++){
                    for(p='A';p<='D';p++){
                        if(((x=='A'&&z!='B')||(x!='A'&&z=='B'))&&(((x=='C')&&(p!='D'))||((x!='C')&&(p=='D')))&&
                                (((y=='D')&&(z!='A'))||((y!='D')&&(z=='A')))&&(x!=y)&&(x!=z)&&(x!=p)&&(y!=z)&&(y!=p)&&(z!=p)){
                            System.out.println("第一名是: "+ x+"\n第二名是: "+ y+"\n第三名是: "+ z+"\n第四名是: "+ p);
                        }

                    }
                }

            }
        }
    }
}
