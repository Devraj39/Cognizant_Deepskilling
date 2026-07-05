package Excersize7;

class FinancialForecast {

    
    public static double futureValue(double presentValue, double rate, int years) {
        
        
        if (years == 0) {
            return presentValue;
        }

        
        return futureValue(presentValue, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double pv = 1000;   
        double rate = 0.1;  
        int years = 5;

        double result = futureValue(pv, rate, years);
        System.out.println("Future Value: " + result);
    }
}
