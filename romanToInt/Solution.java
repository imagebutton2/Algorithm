/*�������ְ������������ַ�: I�� V�� X�� L��C��D �� M��
        �ַ�          ��ֵ
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
*/
//I ���Է��� V (5) �� X (10) ����ߣ�����ʾ 4 �� 9��
//X ���Է��� L (50) �� C (100) ����ߣ�����ʾ 40 �� 90��
//C ���Է��� D (500) �� M (1000) ����ߣ�����ʾ 400 �� 900��

public class Solution {

    public int romanToInt(String s) {
        int i=s.length()-1;
        int result=0;
        for(;i>=0;i--){
            if(s.charAt(i)=='V'&&s.charAt(i-1)=='I'){
                result+=4;
                i--;
            }
            if(s.charAt(i)=='X'&&s.charAt(i-1)=='I'){
                result+=9;
                i--;
            }
            if(s.charAt(i)=='L'&&s.charAt(i-1)=='X'){
                result+=40;
                i--;
            }
            if(s.charAt(i)=='C'&&s.charAt(i-1)=='X'){
                result+=90;
                i--;
            }
            if(s.charAt(i)=='D'&&s.charAt(i-1)=='C'){
                result+=400;
                i--;
            }
            if(s.charAt(i)=='M'&&s.charAt(i-1)=='C'){
                result+=900;
                i--;
            }
            if(s.charAt(i)=='I'){
                result+=1;
            }
            if(s.charAt(i)=='V'){
                result+=5;
            }
            if(s.charAt(i)=='X'){
                result+=10;
            }
            if(s.charAt(i)=='L'){
                result+=50;
            }
            if(s.charAt(i)=='C'){
                result+=100;
            }
            if(s.charAt(i)=='D'){
                result+=500;
            }
            if(s.charAt(i)=='M'){
                result+=1000;
            }

        }
        return result;
    }
}
