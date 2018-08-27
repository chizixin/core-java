package If_switch;

/**
 * 时间:2018/8/16/11:06
 * 创建人:张鑫
 * 功能:语句if
 */
public class Demo5 {
    public static void main(String[] args) {
//        int a=1;
//        //判断如果
//        if (a>0){
//            System.out.println(true);
//            //否则
//        }else{
//            System.out.println(false);
//        }
        //三元运算符?500:200类死于if else
        //if slse 结构 简写格式：变量=(条件表达式)?表达式1:表达式2
        //三元运算符： 好处，可以简化if else代码；弊端，因为是一个运算符，所以运算完必须要有一个结果

        //定义的是int类型不能使用布尔
//        int z=9,b;
//        b=(z<1)?300:200;
//        System.out.println(b);

        //根据用户定义的数值不同，打印对印的星期
        int x = 2;
//        if (x==1){
//            System.out.println("星期一");
//        } else if (x==2){
//            System.out.println("星期二");
//        }else if (x==3){
//            System.out.println("星期三");
//        }else if (x==4){
//            System.out.println("星期四");
//        }else if (x==5){
//            System.out.println("星期五");
//        }else if (x==6){
//            System.out.println("星期六");
//        }else if(x==7){
//            System.out.println("星期七");
//        }else {
//            System.out.println("no");
//        }
        //根据用于指定月份，打印该月份所属的季节。
        //3 4 5春，6 7 8夏，9 10 11 秋，12 1 2冬
//        if (x==3||x==4||x==5){
//            System.out.println(x+"月份是春");
//        }else if(x==6||x==7||x==8){
//            System.out.println(x+"月份是夏");
//        }else if(x==9||x==10||x==11){
//            System.out.println(x+"月份是秋");
//        }else if(x==12||x==1||x==2){
//            System.out.println(x+"月份是冬");
//        }else{
//            System.out.println("月份不存在 ");
//        }
        if (x>12||x<1){
            System.out.println("月份不存在");
        }else if(x>=3 && x<=5){
            System.out.println(x+"月份是春");
        }else if(x>=6 && x<=8){
            System.out.println(x+"月份是夏");
        }else if(x>=9 && x<=11){
            System.out.println(x+"月份是秋");
        }else{
            System.out.println(x+"月份是冬");
        }
    }
}
