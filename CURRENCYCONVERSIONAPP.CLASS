// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.HashMap;

class CurrencyConverter {
   private HashMap<String, Double> exchangeRates = new HashMap();

   public CurrencyConverter() {
      this.exchangeRates.put("USD", 1.0);
      this.exchangeRates.put("EUR", 0.85);
      this.exchangeRates.put("INR", 83.0);
      this.exchangeRates.put("JPY", 110.0);
      this.exchangeRates.put("GBP", 0.75);
   }

   public double convert(String var1, String var2, double var3) {
      if (this.exchangeRates.containsKey(var1) && this.exchangeRates.containsKey(var2)) {
         double var5 = (Double)this.exchangeRates.get(var1);
         double var7 = (Double)this.exchangeRates.get(var2);
         return var3 / var5 * var7;
      } else {
         return -1.0;
      }
   }

   public void displayCurrencies() {
      System.out.println("Available currencies: " + String.valueOf(this.exchangeRates.keySet()));
   }
}
