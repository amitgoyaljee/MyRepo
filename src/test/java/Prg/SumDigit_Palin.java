package Prg;

import org.testng.annotations.Test;

public class
SumDigit_Palin {
    @Test
    public void sumofDigit() {
        int n = 12321;
        int sum = 0;
        int r = 0;
        while (n > 0) {
            r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        System.out.println("sum----" + sum);
    }

    @Test
    public void revofDigitNegative() {
        int n = -1232145;
        String str= Integer.toString(n);
        String sub= str.substring(1);
        String sub1= str.substring(0,1);
        StringBuilder sb=new StringBuilder(sub);
        sb=sb.reverse();
        StringBuilder sb1=new StringBuilder(sub1);
        System.out.println(sb1.append(sb));

    }

    @Test
    public void palin() {
        int n = 12321;
        int palin = 0;
        int r = 0;
        int temp = n;
        while (n > 0) {
            r = n % 10;
            palin = palin * 10 + r;
            n = n / 10;
        }
        System.out.println(palin);
        if (palin == temp) {
            System.out.println("palin----" + palin);
        }
    }
}
