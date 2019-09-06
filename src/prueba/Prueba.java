package prueba;

import java.util.List;

public class Prueba {

    public static void main(String[] args) {
        BillToPay billtopay = new BillToPay();
        List<Double> bills = billtopay.getBillAll(52.9, 7);
        System.out.println("\n");
        for (Double bill : bills) {
            System.out.println(bill);
        }

    }

}
