package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Dados;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter product data");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("price: ");
		double price = sc.nextDouble();
		Dados dados = new Dados (name, price);
		
		System.out.println ();
		System.out.println("Product data: " + dados);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int addquantity = sc.nextInt();
		dados.AddProducts(addquantity);
	
		System.out.println ();
		System.out.println("Product data: " + dados);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int removequantity = sc.nextInt();
		dados.RemoveProducts(removequantity);
		
		System.out.println ();
		System.out.println("Product data: " + dados);
			
		sc.close();
	}

}
