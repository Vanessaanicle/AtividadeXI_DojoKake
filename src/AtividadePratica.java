
public class AtividadePratica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub








//Q3
	public static Professor registrarProfessor(){
			Scanner scanner = new Scanner(System.in);
			Professor professor = new Professor();
			System.out.println("Informe o nome do professor: ");
			professor.nome = scanner.nextLine();
			System.out.println("Informe a disciplina que o professor leciona: ");
			professor.disciplinas = scanner.nextLine();
			
			return professor; 
		}
		
		
		//Q6
	public static void ordenacao(double[] notas){
			
	    	   for(int i = 1; i < notas.length; i++) { 
	    		   for(int j=0;j<notas.length -i;j++){
	    		   if(notas[j] > notas[j+1]) { 
	    			   double aux = notas[j];
	    			   notas[j] = notas[j+1];
	    			   notas[j+1] = aux; 
	    			   }



	}

}
