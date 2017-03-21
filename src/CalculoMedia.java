import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //double nota1, nota2, media;
        double nota1;
        double nota2;
        double media;
        final double FATOR= 0.5; // constante
       int idade;
       String nome;

       //Scanner
       Scanner leitor= new Scanner(System.in);
       
       System.out.println("Olá informe o nome do aluno: "); // Aparece na Tela
       nome= leitor.next(); // next() para ler texto
       System.out.println("informe a primeira nota do aluno " + nome);
       nota1 = leitor.nextDouble();
       System.out.println("informe a segunda nota do aluno "+ nome);
       nota2 = leitor.nextDouble();
       media= ((nota1 + nota2)/2)+ FATOR;
       
       if (media>=7)
    	   System.out.println("O Aluno " + nome + " Esta Aprovado, media: "+ media );
       else
    	   System.out.println("O Aluno " + nome + " Esta Reprovado, media: "+ media);
       
       
       
	
	
	
	}

}
 