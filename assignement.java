class CurrencyConverter {
    int rupee = 63;
    int dirham = 3; 
    int real = 3;     
    int chilean_peso = 595;
    int mexican_peso = 18;       
    int _yen = 107;
    int $australian = 2;  

    double exchangeRates[] = {rupee, dirham, real, chilean_peso, mexican_peso, _yen, $australian};

    void printCurrencies () {
        System.out.println("rupee: " + exchangeRates[0]);
        System.out.println("dirham: " + exchangeRates[1]);   
        System.out.println("real: " + exchangeRates[2]);   
        System.out.println("chilean_peso: " + exchangeRates[3]);   
        System.out.println("mexican_peso: " + exchangeRates[4]);   
        System.out.println("_yen: " + exchangeRates[5]);   
        System.out.println("$australian: " + exchangeRates[6]);
        System.out.println("Currency's Number: " + exchangeRates.length);

    }

    public static void main (String[] args) {
        CurrencyConverter cc = new CurrencyConverter();
        cc.printCurrencies();
    }
}