package Symbol_fuhao;

/**
 * 时间:2018/8/15/16:25
 * 创建人:张鑫
 * 功能:位运算符
 */
public class Demo4 {
    public static void main(String[] args) {
        int a=5,b=3,c;
        c=a<<b;
        /*
        左移变大，右移变小
        左移后面的数是2的次方并乘以前面的数
        右移后面的数是2的次方并被前面的数除以
        例如：
        24<<3   代表24*(2*2*2)也就24*2的3次方
        16>>6   代表16/(2*2*2*2*2*2)也就是16*2的6次方

         */
        System.out.println(3<<2);
        System.out.println(64/(2*2*2*2*2));
        System.out.print("a 移位的结果是"+c);
    }
}
