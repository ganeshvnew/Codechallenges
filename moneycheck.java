public class Money {
    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        double money = principal;
        int count = 0;
        while(desired > money){
            count++;
            money = money + (money * interest - (money * interest * tax));
        }
        return count;
    }
}
