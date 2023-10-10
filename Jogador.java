package uscs;

import java.util.Date;

public class Jogador {

	private int id;
	private int numero;
	private int qualidade;
	private int cartoes;
	private String nome;
	private String apelido;
	private String posicao;
	private Date dataNascimento;
	private boolean suspenso;
	
	

	public Jogador() {
	}
	
	public Jogador(int id) {
		this.id = id;
	}
	
	public Jogador(int id, int numero,String nome, boolean suspenso) {
		this.id = id;
		this.numero = numero;
		this.nome = nome;
		this.suspenso = suspenso;
	}

	public Jogador(int id, int numero,String nome,String posicao, boolean suspenso) {
		this.id = id;
		this.numero = numero;
		this.nome = nome;
		this.posicao = posicao;
		this.suspenso = suspenso;
	}

	public Jogador(int id, int numero, int qualidade, int cartoes, String nome, String apelido,
			String posicao, Date dataNascimento, boolean suspenso) {
		this.id = id;
		this.numero = numero;
		this.qualidade = qualidade;
		this.cartoes = cartoes;
		this.nome = nome;
		this.apelido = apelido;
		this.posicao = posicao;
		this.dataNascimento = dataNascimento;
		this.suspenso = suspenso;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getQualidade() {
		return qualidade;
	}

	public void setQualidade(int qualidade) {
		this.qualidade = qualidade;
	}

	public int getCartoes() {
		return cartoes;
	}

	public void setCartoes(int cartoes) {
		this.cartoes = cartoes;
	}

	public String getString() {
		return nome;
	}

	public void setString(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public boolean isSuspenso() {
		return suspenso;
	}

	public void setSuspenso(boolean suspenso) {
		this.suspenso = suspenso;
	}

}
