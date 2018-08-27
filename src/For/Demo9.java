package For;

/**
 * 时间:2018/8/20/17:38
 * 创建人:张鑫
 * 功能:for嵌套 *打印，九九乘法表
 * 语句嵌套形式，其实就是语句中还有语句
    循环嵌套
 */
public class Demo9 {
    public static void main(String[] args) {
//        int count = 0;
//            for (int z=0;z<3;z++){
//                for (int x=0;x<4;x++){
//                    count++;
//                }
//            }
//        System.out.println(count);

        //对于打印长方形：外循环控制的行数，内循环控制的是每一行的个数，也就是一行中元素的个数
//        for (int z=0;z<3;z++){
//            for (int x=0;x<4;x++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
            *****
            ****
            ***
            **
            *
        要使用嵌套循环：原理，形象说法；大圈套小圈
         */
//        int y = 5;
//        for (int z=0;z<5;z++){
//            for (int x=0;x<y;x++){
//                System.out.print("*");
//            }
//           System.out.println();
//            y--;
//        }
 //        int x = 5;
//        for (int z=0;z<5;z++){
//            for (int y=x;y<5;x++){
//                System.out.print("*");
//            }
//           System.out.println();
//            x++;
//        }
        //int x = 5;
//        for (int z=0;z<5;z++){
//            for (int y=z;y<5;y++){
//                System.out.print("*");
//            }
//           System.out.println();
//            //x++;
//        }
         /*
            *
            **
            ***
            ****
            *****
         */
//        int a = 1;
//        for (int z=0;z<6;z++){
//            for (int x=0;x<a;x++){
//                System.out.print("*");
//            }
//            System.out.println();
//            a++;
//        }
        /*
        1
        12
        123
        1234
        12345
         */
//        for (int a = 1;a<=5;a++){
//            for (int b = 1; b<=a;b++){
//                System.out.print(b);
//            }
//            System.out.println();
//        }

         /*
         九九乘法表
        1*1=1
        1*2=2
        */
//         w:for (int a =1;a<=9;a++){//标号，给循环起名称的方式
//             q:for (int b = 1;b<=a;b++){
//                 System.out.print(b+"*"+a+"="+a*b+"\t");
//             }
//             System.out.println();
//         }
        /*
        break  continue:只能用作于循环结构，继续循环
         */
//        w:for (int a =1;a<=9;a++){
//            q:for (int b = 1;b<=a;b++){
//                System.out.print(b+"*"+a+"="+a*b+"\t");
//                break;
//            }
//            System.out.println();
//        }
//        for (int a =1;a<=9;a++){
//            if(a%2==1){
//                continue;
//                System.out.println(a);
//            }
//        }
        /*
        记住：break和continue语句作用的范围
             break和continue单独存在时，下面可以有任何语句，因为都执行不到
         */
        /*
        ----*
        ---* *
        --* * *
        -* * * *
        * * * * *
         */
        for (int a = 0;a<5;a++){
            for (int b = a;b<5; b++){
                System.out.print("-");
            }
            for (int c=0;c<=a;c++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
