package uscs;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class TesteJogos {
	
	public static void main(String[] args) {
		DateFormat f = DateFormat.getDateInstance();
			Jogador j1 = new Jogador(10, 10, 8, 0, "Romário", "baixinho", "atacante", 	new Date("12/01/1995"), false);
			Jogador j2 = new Jogador(10, 10, 8, 0, "Caio", "Paulista", "lateral esquerda", 	new Date("12/01/1990"), false);
			Jogador j3 = new Jogador(10, 10, 8, 0, "Walce", "teste", "atacante", 	new Date("12/01/1990"), false);
			Jogador j4 = new Jogador(10, 10, 8, 0, "Felipe", "lateral", "Zagueiro", 	new Date("12/01/1988"), false);
			Jogador j5 = new Jogador(10, 10, 8, 0, "Leandro", "perna de pau", "lateral", 	new Date("12/01/1990"), false);
			Jogador j6 = new Jogador(10, 10, 8, 0, "Rai", "baixinho", "lateral direito", 	new Date("12/01/1989"), false);
			
			System.out.println(j1.getDataNascimento());
			Jogador j7 = new Jogador();
			
			j7.setApelido("baixinho");
			
			
	}

}
