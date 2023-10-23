package org.example.ejercicios;

import java.util.List;

public class Billing4 {
	record invoice(String customer, String invoiceDate, List<Double> productPrice) {
	}

	public static void main(String[] args) {

		/*
		The record is filled as a list in order to have a larger size without being defined
		new customers were added to test functionality
		*/
        List<invoice> invoiceList=
				List.of(
						new invoice("Maria Sanabria", "Junio 1, 1999", List.of(4500D, 5000D, 2500D)),
						new invoice("Juan Perez", "Agosto 15, 2000", List.of(3500D, 6000D, 2800D)),
						new invoice("Daniel Mesa", "Junio 1, 1999", List.of(100D, 200D, 200D)),
						new invoice("Vanessa Monsalve", "Junio 1, 1999", List.of(5000D, 5000D, 10000D))
				);
		/*
		A nested for is used to be able to scroll through the list to show different customers and at the same time in the internal
		for more the internal price list is scrolled through.
		everything can be done in a smaller block of code to avoid unnecessary lines and to be able to reuse the code with different clients.
		*/
        int invoiceposition=0;
		for (invoice Invoice : invoiceList) {
			double totalValueFact = 0;
			invoiceposition++;
			for(Double price: Invoice.productPrice) {
                totalValueFact += price;
            }

			System.out.println("The invoice N°"+invoiceposition);
			System.out.println("Customer: " + Invoice.customer());
			System.out.println("Total: " + totalValueFact);
		}
	}
}
