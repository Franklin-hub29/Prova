package Prova01;

public class Questao01 {
	public static void main(String[]args) {
		
		int nota01 = 25 , nota02 =25 , nota03= 25, nota04 = 25 ,media ,totalNota;
		
		 totalNota = nota01 + nota02 + nota03 + nota04 /2;
		 
		media = totalNota / 2;
		
	 if(media > 70) {
		 System.out.println("Aluno aprovado");
	 }else if(media < 69) {
		 System.out.println("Aluno em recuperação");
	 }else if(media < 50) {
		 System.out.println("Aluno em dependência");
		 
		 
	 }
	}

}
