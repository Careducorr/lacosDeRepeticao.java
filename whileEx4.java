package JavaBasicoLacosDeRepeticao;

import java.util.Scanner;

public class whileEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pessoasBack=0,mulheresFront=0,homensMobileMaiores40=0,
			nBinariosFullMenores30=0,totalPessoas=0,mediaIdade=0;
			char continuar = 'S';
		Scanner leia = new Scanner(System.in);
		
		while(continuar == 'S') {
			System.out.println("\nDigite a idade: ");
			int idade = leia.nextInt();
			leia.nextLine();
			
			System.out.println("\n1 – Mulher Cis\r\n"
					+ "2 – Homem Cis\r\n"
					+ "3 – Não Binário\r\n"
					+ "4 – Mulher Trans\r\n"
					+ "5 – Homem Trans\r\n"
					+ "6 – Outros\r\n"
					+ "Digite a identidade de gênero");
			int genero = leia.nextInt();
			leia.nextLine();
			
			System.out.println("\n1 – Backend\r\n"
					+ "2 – Frontend\r\n"
					+ "3 – Mobile\r\n"
					+ "4 – FullStack\r\n"
					+ "Digite a especialização");
			int especializacao = leia.nextInt();
			leia.nextLine();
			
			totalPessoas++;
			mediaIdade+=idade;
			
			if(especializacao == 1) {
				pessoasBack++;
			}
			
			if((genero==1 || genero==4) && especializacao==2) {
				mulheresFront++;
			}
			
			if((genero==2 || genero==5) && especializacao==3 && idade>40) {
				homensMobileMaiores40++;
			}
			
			if(genero==3 && especializacao==4 && idade<30) {
				nBinariosFullMenores30++;
			}
			
			System.out.println("\nDeseja continuar? (S/N)");
			continuar = leia.nextLine().toUpperCase().charAt(0);
		}
		
		mediaIdade = mediaIdade/totalPessoas;
		System.out.printf("Total de pessoas desenvolvedoras Backend: "+totalPessoas
				+ "\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend: "+mulheresFront
				+ "\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: "+homensMobileMaiores40
				+ "\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: "+nBinariosFullMenores30
				+ "\nO número total de pessoas que responderam à pesquisa: "+totalPessoas
				+ "\nA média de idade das pessoas que responderam à pesquisa: %.2f",(float)mediaIdade);

	}

}
