/**
 * 时间:2018/8/14/9:43
 * 创建人:张鑫
 * 功能:java基本数据类型
 */
public class Demo1 {

    public static void main(String[] args){
    //java的数据类型，分为基本数据类型和引用数据类型
    //基本数据类型分为三种
    //1.整数型
    //整型（byte,short,int,long）
        byte a = 1;//byte类型的任何变量占用字节长度是1个
        short b = 1;//short类型的任何变量占用字节长度是2个
        int c =1;//int类型的任何变量占用字节长度是4个
        long d= 1L;//long类型的任何变量占用字节长度是8个（L标识）
    //浮点型（float,duble）
        float e= 1.3f;//float类型的任何变量占用字节长度是4个（f标识）
        double f=1.23;//double类型的任何变量占用字节长度是8个
    //2.字符型（char）
        char g='1';//char类型的任何变量占用字节长度是2个（单引号）
    //3.布尔型(boolean)
        boolean h=true;//boolean类型的任何变量占用字节长度是1个
        boolean j = false;
    //整数默认int 小数默认double
        byte z = 3;
        //大转小要强转
        z = (byte) (z + 2);
        System.out.println(z);
        //小转大自动转
        System.out.println('a'+2);
        //大转小要强转
        System.out.println((char)('a'+2));


    }

}
