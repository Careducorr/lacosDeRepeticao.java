package JavaBasicoLacosDeRepeticao;

import java.util.Scanner;

public class lacoForEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2,x;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro número: ");
		num1 = leia.nextInt();
		System.out.println("\nDigite o segundo número: ");
		num2 = leia.nextInt();
		
		if(num1<num2) {
			for(x=num1-1;x<=num2;x++) {
				//optei em colocar o valor de x menor que o do numero 1.
				if(x%3==0 && x%5==0) {
					System.out.println("\n"+x+" é multiplo de 3 e 5");
				}
			}
		}else {
			System.out.println("\nIntervalo inválido");
		}

	}

}
