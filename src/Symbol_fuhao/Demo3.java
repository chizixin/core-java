package Symbol_fuhao;

/**
 * 时间:2018/8/15/14:24
 * 创建人:张鑫
 * 功能:算数运算符，转义字符，赋值运算符，比较运算符，逻辑运算符
 */
public class Demo3 {
    public static void main(String[] args) {
        /*
        int x = 5814;
        //x是int类型的变量，是整数，x/1000是小数(自动取整数)
        x=x/1000*100;
        System.out.println(x);
        //取模%，取得是余数；规律：左边小于右边结果是左边，左边等于右边结果是0，右边是1结果是0，含有负数取左边
        //System.out.println(3%-8);
        int a=3,b;
        //变量a中的值+1并把操作后的值赋给变量b
        //a先把值赋给b,在自己进行++
        b = a++;
        System.out.println(a);
        System.out.println(b);
        //现在a是4；a先进行++，把所得结果在赋值给b
        b = ++a;
        System.out.println(a);
        System.out.println(b);
        //字符串连接符,字符串数据和任何数据使用+都是相连接，最终都会变成字符串
        System.out.println("he"+"llo");
        System.out.println("5+5="+5+5);
        */

        /*
        转义字符：通过\来转变后面字母或者符号含义
        \n:换行
        \b:退格，相当于backspace
        \r:回车键，win回车符室友两个字符表示\r\n
        \t:制表符，相当于tab
        在被转以前面加转义符
         */
        //System.out.println("hello\nworld");
        //System.out.println("\"hello\"");

        /*
         赋值运算符：+=，-=，*=，/=，%=
        */
        //short x = 5;
        //x=x+6;    编译失败，因为后者x会被提升为int类型，运算后的结果还是int类型，无法赋值给short类型的x
        //左右两边和赋值给左边，自动完成了强转操作
        // x+=8;
        //System.out.println(x);

        /*
        比较运算符 == ！=  < > <= >=
        instanceof 左边对象是否为instanceof 右边类的实例，返回一个boolean类型值。还可以用来判断子父类的所属关系。
        内存中实际对象A是不是B类型
         */
        //class Dog extends Animal
        //譬如dog定义了自己的方法wangwang
        //Animal anAnimal = new Dog();
        //此时不能直接调用anAnimal.wangwang方法
        //        但是可以
        /*if( anAnimal instanceof Dog){
            Dog dog = (Dog)anAnimal;
            dog.wangwang就可以调用了
        }*/

        /*
       逻辑运算符& | ^ ! && ||
         */
        //逻辑运算符用于连接boolean类型的表达式
        //和&:只要两边的boolean表达式结果，有一个是false，那么结果就是false;只有两边都是true,结果为true
        //System.out.println(true&true);
        //System.out.println(false&true);
        //或|：有一个是true，那么结果就是true;只有两边都是false,结果为false
        //System.out.println(true|false);
        //System.out.println(false|false);
        //异或^:和|有点不一样，当true^true=false;两边相同是false,两边不同true
        //System.out.println(false^true);
        //System.out.println(false^false);
        //非！
        //System.out.println(!!true);
        //&和&&的特点:&无论左边是true还是false,都执行.&&当左边为false时,右边不进行运算
        //|和||的特点:|无论左边是true还是false,都执行.||当左边为false时,右边不进行运算
    }
}
