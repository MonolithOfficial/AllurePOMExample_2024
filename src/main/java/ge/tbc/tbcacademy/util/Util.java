package ge.tbc.tbcacademy.util;

public class Util {
    public static double currencyToDouble(String currency) {
        return Double.parseDouble(currency.replace("₾", ""));
    }
}
