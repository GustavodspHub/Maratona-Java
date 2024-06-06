package academy.devdojo.maratonajava.OOP.enumeracao.domain;

public enum PersonCard {
    DEBIT_CARD {
        @Override
        public double discountCalculate(int value) {
            return value * 0.1;
        }
    },
    CREDIT_CARD {
      @Override
      public double discountCalculate(int value) {
          return value * 0.05;
      }
    };

    public abstract double discountCalculate(int value);
}
