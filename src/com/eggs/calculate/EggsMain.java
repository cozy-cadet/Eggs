package com.eggs.calculate;

import java.util.Scanner;

public class EggsMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eggs = sc.nextInt();
		sc.close();
		CalculateEgg ceobj = new CalculateEgg(eggs);
		ceobj.calculate();
		ceobj.Display();
	}

}
