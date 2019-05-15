package My.NowCoder.java;
//牛牛与妞妞闲来无聊，便拿出扑克牌来进行游戏。游戏的规则很简单，两个人随机抽取四张牌，四张牌的数字和最大的取胜（该扑克牌总张数为52张，没有大小王，A=1，J=11，Q=12，K=13，每种数字有四张牌），
// 现在两人已经分别亮出了自己的前三张牌，牛牛想要知道自己要赢得游戏的概率有多大。
//
//输入描述:
//
//输入包含两行，第一行输入三个整数a1，b1，c1(1≤a1，b1，c1≤13)，表示牛牛亮出的扑克牌。第二行输入三个整数a2，b2，c2(1≤a2，b2，c2≤13)，表示妞妞所亮出的扑克牌。
//
//输出描述:
//
//输出一个数字x（保留4位小数），表示牛牛获胜的概率。
//
//示例：
//
//输入
//
//3 5 7
//2 6 8
//
//输出
//
//0.3995
//

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {

                HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

                for(int i=1;i<=13;i++){

                    map.put(i,4);

                }

                int sum1=0;

                int sum2=0;

                Scanner sc=new Scanner(System.in);

                for(int i=0;i<6;i++){

                    Integer key=sc.nextInt();

                    if(i<3)

                        sum1+=key;

                    else

                        sum2+=key;

                    map.put(key,map.get(key)-1);
                }
                int num=0;

                for(Map.Entry<Integer,Integer> M:map.entrySet()){

                    if(M.getValue()==0)

                        continue;

                    map.put(M.getKey(),M.getValue()-1);//这里的M.getValue() 会取到跟新后的值

                    for(Map.Entry<Integer,Integer> m:map.entrySet()){

                        if(m.getValue()==0)

                            continue;

                        if(m.getKey()+sum2<M.getKey()+sum1)

                            num+=m.getValue()*(M.getValue()+1);//千万注意这里 刚拿走一 这里要加上
                    }

                    map.put(M.getKey(),M.getValue()+1);//拿走后 这里要加上

                }

                System.out.printf("%.4f\n", num*1.0/(46*45));

            }
        }
