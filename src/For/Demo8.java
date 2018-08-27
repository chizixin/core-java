package For;

/**
 * 时间:2018/8/20/15:43
 * 创建人:张鑫
 * 功能:for循环练习
 */
public class Demo8 {
    public static void main(String[] args) {

        //1、获取1和10之间的和，并打印
        //定义变量用于存储不断变化的和
//        int sum =0;
        //定义变量，记录住不断变化的被加数

        //定义循环，重复加法过程
        //for
//        for (int a=1;a<11;a++){
//            sum += a;
//        }
//        System.out.println(sum);
        /*
         这就是累加思想
         原理：通过变量记录住每次变化的结果，通过循环的形式，进行累加动作
         */

//        //while
//        int a=1;
//        while(a<=10){
//            sum = sum + a;
//            a++;
//        }
//        System.out.println(sum);



        /*2、1~100之间7的倍数的个数，并打印
            思路：1、先对1-00进行循环遍历
                 2、在遍历的过程中，定义条件并指对7的倍数进行操作
                 3、因为7的倍数不确定，只要符合条件，就通过一个变量进行记录这个变化的此时
            步骤：1、定义循环语句选择使用for
                 2、再循环中定义判断，只要是7的倍数即可，使用if进行判断7的倍数(x%7==0)
                 3、定义变量，该变量随着7的倍数自增
        */
//        int count = 0;
//        for (int x=1;x<=100;x++){
//            if(x%7==0){
//                count ++;
//            }
//        }
//        System.out.println(count);
        /*
        计数器思想
        通过一个变量记录住数据的状态变化
        也许通过循环完成
         */

    }
}