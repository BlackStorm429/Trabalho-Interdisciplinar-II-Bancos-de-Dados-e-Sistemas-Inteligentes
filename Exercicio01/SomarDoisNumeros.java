import java.util.*;

class SomarDoisNumeros 
{
	public static Scanner sc = new Scanner (System.in);
	
	public static void main (String args [])
	{
		//Declaracao de variaveis
		int num1, num2, soma;
		
		//Leituras
		System.out.print ("\nDigite o primeiro número: ");
		num1 = sc.nextInt ();
		
		System.out.print ("\nDigite o segundo número: ");
		num2 = sc.nextInt ();
		
		//Somar
		soma = num1 + num2;
		
		//Mostrar na tela
		System.out.print ("\nSoma = " + soma);
	}
}
