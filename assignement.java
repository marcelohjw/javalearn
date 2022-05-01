class CurrencyConverter {

    double[] exchangeRates;

    void setExchangeRates(double[] rates) {
        exchangeRates = rates;
    }

    void updateExchangeRates(int arrayIndex, double newVal) {
        exchangeRates[arrayIndex] = newVal;
    }

    double getExchangeRate(int arrayIndex) {
        return exchangeRates[arrayIndex];
    }

    double computeTransferAmount(int arrayIndex, double amount) {
        return amount * getExchangeRate(arrayIndex);
    }

    double computeTransferFee(int countryIndex, double amount) {
        // For assignement 3
    }

    void printCurrencies () {
        System.out.println("rupee: " + exchangeRates[0]);
        System.out.println("dirham: " + exchangeRates[1]);   
        System.out.println("real: " + exchangeRates[2]);   
        System.out.println("chilean_peso: " + exchangeRates[3]);   
        System.out.println("mexican_peso: " + exchangeRates[4]);   
        System.out.println("_yen: " + exchangeRates[5]);   
        System.out.println("$australian: " + exchangeRates[6]);
        System.out.println("Currency's Number: " + exchangeRates[exchangeRates.length-1]);

    }

    public static void main (String[] args) {
        CurrencyConverter cc = new CurrencyConverter();

        
        double[] ratex = {63.0, 3.0, 3.0, 595.0, 18.0, 107.0, 2.0};
        cc.setExchangeRates(ratex);
        cc.printCurrencies();
        cc.updateExchangeRates(2, 4.5); // Change the real cotation
        System.out.println("\nUpdating real cotation..\n");
        cc.printCurrencies();
        System.out.println("\nGetting chilean peso..\n");
        double get = cc.getExchangeRate(3);
        System.out.println(get);
        double amountx = cc.computeTransferAmount(2, 1000);
        System.out.println("\nComputing transfer amount.. 1000 dollars to real = " + amountx);


    }
}