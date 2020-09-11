/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecoo13r1p2.theluhnalgorithm;

import java.util.Scanner;

/**
 *
 * @author The_PIG
 */
public class ECOO13R1P2TheLuhnAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(int i5=0;i5<5;i5++){
            int ans = 0;
            for(int j5=0;j5<5;j5++){
                String num = in.next();
                int sum = 0;
                int t = 0;
                for(int i=num.length()-1;i>=0;i--){
                    if(t==0){
                        int temp = (num.charAt(i)-'0') * 2;
                        sum += temp%10 + temp/10;
                        t++;
                    }
                    else{
                        sum += (int)num.charAt(i)-'0';
                        t--;
                    }
                }
                if(sum%10!=0){
                    ans += 10-sum%10;
                    ans = ans * 10;
                }
                else
                    ans = ans * 10;
            }
            ans = ans/10;
            System.out.println(ans);
        }
    }
    
}
