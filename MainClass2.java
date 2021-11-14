package Domashna3zad2;

import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) {
		int brojnafrlanja;
		
		Brojach brPismo = new Brojach();
		Brojach brGlava = new Brojach ();
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Vnesete broj na frlanje na parichkata");
		brojnafrlanja = sc.nextInt();
		
		while (brojnafrlanja > 0) {
			brPismo.reset ();
			brGlava.reset();

            for(int i=0; i<brojnafrlanja; i++)
           {
             if(Math.random () < 0.5)
                 brPismo.zgolemi();
               else
                 brGlava.zgolemi();
		   }
       System.out.println("Vo " + brojnafrlanja + " frlanja");
       System.out.println("Padnaa: " + brPismo.brojach + " pisma");
       System.out.println("Padnaa: " + brGlava.brojach + " glavi");
       
       System.out.println("Dokolku sakate povtorno frlanje,vnesete broj na frlanja: ");
       brojnafrlanja = sc.nextInt();
	}
    sc.close();
}
}	