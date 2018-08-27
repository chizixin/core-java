package For;

/**
 * 时间:2018/8/16/16:44
 * 创建人:张鑫
 * 功能:while,do while,for循环结构(特点,区别)
 */
public class Demo7 {

    public static void main(String[] args) {
//        int z =2;
        //定义初始化表达式；
        //while(条件表达式)｛
        //      循环体（执行语句）
        // ｝
//        while (z<4){
//            System.out.println("zhang");
//            z++;
//        }
        //z++，++z
//        int a,b;
//        z=z++;
//        System.out.println(z);
//        a=z++;
//        b=++z;
//        System.out.println(a);
//        System.out.println(b);
        //do{}while

        /*
        while:先判断条件是否成立，只有条件满足成立就执行循环体
        do while:先执行循环体，在进行条件判断，条件满足，再继续执行循环体
        简单概括：无论条件是否满足，循环体都会执行一次
         */
        //do while
//        int z =2;
//        do{
//            System.out.println("zhang");
//            z++;
//        }while (z<0);
//        //while
//        int x =2;
//        while (x<0){
//            System.out.println("xin");
//            x++;
//        }
        /*
        for(初始化表达式；循环条件表达式；循环后的操作表达式){
            执行语句
        }
         */
        //第一次a<5,条件满足执行循环体(a=2);a++,在进行第二次a<5,条件满足执行循环体(a=3)
        //a++,进行第二次a<5，条件满足执行循环体(a=4);a++,进行第三次a<5，条件无法满足不执行循环体，执行完毕(a=5)
//        for (int a=2;a<5;a++){
//            System.out.println(a);
//        }
//        //变量在内存中驻留的时间不一样
//        int r=2;
//        while (r<5){
//            System.out.println(r);
//            r++;
//        }
        //变量有自己的作用域，对于for来讲：如果将用于控制循环的增量定义在for语句中，那么该变量只在for语句内有效
        //for语句执行完毕该变量在内存中被释放

        //for和whilw可以进行互换，如果需要定义循环增量，用for更为合适

        //总结:什么时候用循环结构?当要对某些语句执行很多次时，就是用循环结构

        /*
        练习：for
         */
        int s=1;
                                        //条件表达式不成立无法进行
//        for (System.out.println("a");System.out.println("a");System.out.println("a")){
//            System.out.println("a");
//        }
                                                            //表达式多的话，逗号隔开
        for (System.out.println("a");s<3;System.out.println("b"),s++){
            System.out.println("v");

        }
        /*
            for(int t=0 ;t<5;t++){
            }
            上下同理，都是可以执行的，下着不推荐
            int t=0;
            for(;t<5;){
            }
            无限循环最简单表达式:
            for(;;){}  默认就为true
            while(true){}
        */

    }

}
