package JavaBasicoLacosDeRepeticao;

import java.util.Scanner;

public class lacoForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,pares=0,impares=0,x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=10;x++) {
			System.out.println("\nDigite o "+x+"° número: ");
			num = leia.nextInt();
			if(num%2==0) {
				pares++;
			}else {
				impares++;
			}
		}
		
		System.out.println("\nTotal de número pares: "+pares);
		System.out.println("\nTotal de número ímpares: "+impares);
	}
}
