/* Money, MOney, Money - From Codewars */

package com.web.codechallenges.testcases;
public class MoneyControl {
    public static int findYears(double principal, double interest,  double tax, double desired) {
        double money = principal;
        int c = 0;
        while(desired > money){
            c++;
            money = money + (money * interest - (money * interest * tax));
        }
        return c;
    }
}
