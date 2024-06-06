package JavaBasicoLacosDeRepeticao;

import java.util.Scanner;

public class doWhileEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
       Scanner leia = new Scanner(System.in);
        
        int soma = 0;
        int num;
        System.out.println("\nIrei somar todos os números positivos digitados, até que digite 0!");
        
        do {
            System.out.println("\nDigite um número : ");
            num = leia.nextInt();
            if (num > 0) {
                soma += num;
            	}
        	} while (num != 0);

        System.out.println("A soma dos números positivos digitados é: " + soma);
        
    	}
	}


