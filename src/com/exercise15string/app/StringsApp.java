package com.exercise15string.app;

import com.exercise15string.model.Tuneador;
class StringsApp {

	public static void main(String[] args) {
		String cad1 = "La saptura y después liberación de ovidio guzmán, hijo de joaquín el chapo guzmán, "
				+ "provocó diversas reacciones entre senadores de oposición, morena y sociedad civil. ";
		String cad2 = "La saptura y después liberación de ovidia guzmán, hijo de joaquín el chapo guzmán, "
				+ "provocó diversas reacciones entre senadores de oposición, morena y sociedad civil. ";
		// Returns the char of the index
		System.out.println(cad1.charAt(3));
		// Returns the char IN ASCII of the index
		System.out.println(cad1.codePointAt(3));
		// Sum the ASCII values form beging to end
		System.out.println(cad1.codePointBefore(3));
		// cantidad de puntos de codigo de la cadena
		System.out.println(cad1.codePointCount(3,4));
		//
		System.out.println(cad1.compareTo(cad2));
		System.out.println(cad1.equals(cad2));
		System.out.println(cad1.concat(cad2));
		System.out.println(cad1.contains("hijo"));
		// Buscar un caracter con su valor ASCII
		//System.out.println(cad1.copyValueOf(115));
		System.out.println(cad2.trim()+cad2.trim());
		System.out.println(cad1.indexOf('l'));
		// La primera ocurrencia de numeros
		System.out.println(cad1.indexOf('l')); // Non greedy
		System.out.println(cad1.lastIndexOf('l')); // Greddy
		
		// Split the string each '.'
		String cads[] = cad1.split(",");
		for(String c:cads) {
			System.out.println(c);
		}
			
		/*
		for(int i=0; i< cads.length; i++) {
			System.out.println(cads[i]);
		}*/
		
		System.out.println(cad1.split(","));
		String cad3 = " ";
		cad3 = cad1.replace('a', 'e');
		System.out.println(cad3);
		// Avoid High case
		System.out.println(cad3.toLowerCase());
		System.out.println(cad3.toUpperCase());
		
		// R E V E R S E
		String reverseString = "";
		for(int i = cad1.length()-1; i >= 0; i--) {
			reverseString = reverseString + cad1.charAt(i);
		}
		System.out.println(reverseString);
		
		
		// Another solution
		StringBuilder sb = new StringBuilder();
		String cad = "banana";
		
		sb.append(cad);
		System.out.println(sb.reverse());
		/*
		 * boolean checkPalindrome(String inputString){
    String s = "";
    for(int i = inputString.length()-1; i>=0; i--){
        s = s + inputString.charAt(i);
    }
     return inputString.equals(s);
}

		 */
		String[] misCadenas = {cad1,cad2,cad3};
		String[] misNuevasCadenas = Tuneador.tunea(misCadenas);
		for(int i=0; i<misNuevasCadenas.length; i++) {
			System.out.println(misNuevasCadenas[i]);
		}
		
		int[] Vector = new int[] {1,2,3,4,5,6,7,8,9,0};
		System.out.println(Tuneador.mediaVector(Vector));
	}

}
