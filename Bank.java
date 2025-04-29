// Base class BankBase
class BankBase {
    double getRateOfInterest() {
        return 0.0;
    }
}

class SBI extends BankBase {
    double getRateOfInterest() {
        return 8.0;
    }
}

class ICICI extends BankBase {
    double getRateOfInterest() {
        return 7.0;
    }
}

class AXIS extends BankBase {
    double getRateOfInterest() {
        return 9.0;
    }
}

// Public class must match file name Bank.java
public class Bank {
    public static void main(String[] args) {
        BankBase sbi = new SBI();
        BankBase icici = new ICICI();
        BankBase axis = new AXIS();

        System.out.println("SBI Rate of Interest: " + sbi.getRateOfInterest() + "%");
        System.out.println("ICICI Rate of Interest: " + icici.getRateOfInterest() + "%");
        System.out.println("AXIS Rate of Interest: " + axis.getRateOfInterest() + "%");
    }
}
