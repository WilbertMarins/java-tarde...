package modelo;

public class Engenheiro extends Pessoa {
	private int numCREA;
	
	public Engenheiro( String pNome,String pCpf,int pCREA) {
		super(pNome,pCpf);
		this.numCREA=pCREA;
	}
	
	public void projetar() {
		System.out.println( this.getNome()+ "est� projetando");
	}
	
	public void emitinAvaliacaoTecnica() {
		System.out.println(this.getNome() + "," +this.getNumCREA() + "esta emitindo avalia��o t�cnica");
	}
	
	
	public int getNumCREA() {
		return numCREA;
	}
	public void setNumCREA(int numCREA) {
		this.numCREA = numCREA;
	}



	

}
