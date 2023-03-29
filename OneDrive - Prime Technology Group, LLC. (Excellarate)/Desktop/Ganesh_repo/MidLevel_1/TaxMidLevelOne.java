package MidLevelAssignment;

public class TaxMidLevelOne {
    public static void main(String[] args) {
        salary = 3;
        income = 1000000;
        System.out.println("The Salary is Rs." + income);
        TaxMidLevelOne tax = new TaxMidLevelOne();
        tax.incomeTax();
    }

    static int salary = 0;
    static int income = 0;

    public void incomeTax() {
        int tax = 0;
        double taxAmount = 0;
        switch (salary) {
            case 1:
                if (income < 700000) {
                    tax = 0;
                    taxAmount = income;
                }
                break;
            case 2:
                if (income >= 700000 && income < 1000000) {
                    tax = 15;
                    taxAmount = (0.1 * 200000) + (0.15 * (income - 700000));
                }
                break;
            case 3:
                if (income >= 1000000 && income < 1500000) {
                    tax = 20;
                    taxAmount = (0.1 * 200000) + (0.15 * 300000) + 0.2 * (income - 1000000);
                }
                break;
            case 4:
                if (income >= 1500000) {
                    tax = 30;
                    taxAmount = (0.1 * 200000) + (0.15 * 300000) + (0.2 * 500000) + 0.3 * (income - 1500000);
                }
                break;
            default:
                System.out.println("Invalid input");
        }
        System.out.println("Tax amount to be deducted from the salary is Rs." + taxAmount);
        System.out.println("Salary after tax has been deducted is Rs." + (income - taxAmount));
    }
}
