
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
		
		
		
		
		
		
//q4
		public static String verificarAluno(Aluno alunos[], Professor professores[]){
		boolean alunoprofessor = false;
		//int cont = 0;
		int professor1 = 0, professor2 = 0, professor3 = 0, professor4 = 0, professor5 = 0;


		for (int i = 0; i < professores.length ; i++) {

			for (int j = 0; j < professores[i].disciplina.length; j++) {
				int cont = 0;
				while( cont < 30 ){
					if(alunos[cont].disciplina == professores[i].disciplina ){
						switch (i) {
						case 0:
							professor1++;
							break;
						case 1:
							professor2++;
							break;
						case 2:
							professor3++;
							break;
						case 3:
							professor4++;
							break;
						case 4:
							professor5++;
							break;

						}
					}
				}
			}
		}
		
		return "O professor 1 possui " +professor1+ " alunos." + "\n" + "O professor 2 possui " + professor2+ " alunos." + "\n" + "O professor 3 possui "
		+ professor3+ " alunos." + "\n" + "O professor 4 possui " + professor4+ " alunos." + "\n" + "O professor 5 possui " + professor5+ " alunos." + "\n";
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
