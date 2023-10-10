package uscs;

import java.util.Date;

public class Titular  extends Jogador{
	private double salarioFixo;

	
	
	
	public Titular(int id) {
		super(id);
	}

	public Titular(int id, int numero, int qualidade, int cartoes, String nome, String apelido, String posicao,
			Date dataNascimento, boolean suspenso, double salarioFixo) {
		super(id, numero, qualidade, cartoes, nome, apelido, posicao, dataNascimento, suspenso);
		this.salarioFixo =salarioFixo;
		// TODO Auto-generated constructor stub
	}

	public Titular(int id, int numero, String nome, boolean suspenso) {
		super(id, numero, nome, suspenso);
		// TODO Auto-generated constructor stub
	}

	public Titular(int id, int numero, String nome, String posicao, boolean suspenso) {
		super(id, numero, nome, posicao, suspenso);
		// TODO Auto-generated constructor stub
	}

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}
	
}
