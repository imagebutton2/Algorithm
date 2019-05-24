package com.java.myAlgorithm;

import java.util.Scanner;
//计算糖果

/**

 * A,B,C三个人是好朋友,每个人手里都有一些糖果,我们不知道他们每个人手上具体有多少个糖果,但是我们知道以下的信息：
 * A - B, B - C, A + B, B + C. 这四个数值.每个字母代表每个人所拥有的糖果数.
 * 现在需要通过这四个数值计算出每个人手里有多少个糖果,即A,B,C。这里保证最多只有一组整数A,B,C满足所有题设条件。
 */
public class Candy_calculation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y1, y2, y3, y4;
        int a, b, c;
        while (in.hasNextInt()) {
            y1 = in.nextInt();
            y2 = in.nextInt();
            y3 = in.nextInt();
            y4 = in.nextInt();
            a=(y1+y3)/2;
            b=(y2+y4)/2;
            c=(y4-y2)/2;
            if(a-b==y1&&b-c==y2&&a+b==y3&&b+c==y4){
                System.out.println(a+""+b+""+c);
            }else {
                System.out.println("No");
            }



        }
    }
}
