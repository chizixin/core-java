package If_switch;

/**
 * 时间:2018/8/16/15:11
 * 创建人:张鑫
 * 功能:switch语句
 */
public class Demo6 {
    public static void main(String[] args) {

//        String s = "test";
//        switch(s){
//            case "test1":
//                System.out.println("test1");
//                break;
//            case "test":
//                System.out.println("test");
//                break;
//        }

//        int a = 11;
//        int b=2,c=5,d=10;
//        //先执行第一个case,case和之间没有顺序,都会先执行第一个case，没有匹配到case执行default
//        switch (a){//switch 语句类型只有四种类：byte,short,int,char(1.7版本之后支持String)

//            case 2:
//                System.out.println("a=b");
//                break;//结束switch语句的两种情况，遇到break,执行到switch语句结束
//            case 5:
//                System.out.println("a=c");
//                break;
//            case 10:
//                System.out.println("a=d");
//                break;
//            default:
//                System.out.println("无法匹配");
                //入货匹配的case或者default没有对应的break,那么程序会继续向下执行，运行可以执行的语句，
                //直到遇到break或者switch结尾结束
//        }
        //根据用于指定月份，打印该月份所属的季节。
        //3 4 5春，6 7 8夏，9 10 11 秋，12 1 2冬
        int b=12;
        switch (b){

            case 3:
            case 4:
            case 5:
                System.out.println(b+"月份是春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(b+"月份是夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(b+"月份是秋天");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println(b+"月份是冬天");
                break;
            default:
                System.out.println("没有这个月份");

        }
        /*
        if和switch语句很像。具体什么场景下，应该那个语句呢？
        如果判断的具体数值不多，而是符合byte short int char这四种类型
        虽然两个语句都可以使用，建议使用swtich语句，因为效率稍高

        其他情况：对区间判断，对结果为boolean类型判断，使用if,if的使用范围更广

    switch
    基本数据类型：byte, short, char, int
    包装数据类型：Byte, Short, Character, Integer
    枚举类型：Enum
    字符串类型：String（Jdk 7+ 开始支持）
         */
    }

}
