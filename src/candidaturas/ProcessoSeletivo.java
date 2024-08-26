package candidaturas;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		
		analizarCandidato(1900.0);
		analizarCandidato(2200.0);
		analizarCandidato(2000.0);
	}
	
	static void analizarCandidato(double salarioPretendido) {
		
		double salarioBase = 2000.0;
		
		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
			
			
			
		}else if (salarioBase == salarioPretendido) {
			
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		}else {
			
			System.out.println("AGUARDANDO O RESULTADO  DOS DEMAIS CANDIDATOS");
		}
		
		
		
	}
	
}
