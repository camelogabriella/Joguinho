
public class Jogo {

	//criando o tabuleiro
	protected String  matriz [][] = {{"1" , "2" , "3"}, 
			{ "4" , "5" , "6"}, 
			{ "7" , "8" , "9"}};

	public String Mostrar(){
		//percorrer o tabuleiro
		//i linha 
		//o coluna
		for( int i= 0; i<3; i++){
			for(int o = 0; o < 3; o++){
				System.out.printf("     "+ matriz[i][o]);

			}
			System.out.println("\n");
		}
		return null;

	}
	public boolean Validarposicao ( String t ){
		//Verificar se a posição que o jogador escolheu é válida
		// String t de posição
		for( int i= 0; i<3; i++){
			for(int o = 0; o < 3; o++){
				if(matriz[i][o].equals(t)){
					return true;  
				}
			}
		}
		return false;  
	}

	public String Jogada ( String p , String j){
		String l = null;
		//Jogar
		//String p de posição
		//String j de jogador
		if(p.equals("1")){
			matriz [0][0] = j;
		}  
		else if  (p.equals("2")){
			matriz [0][1] = j;
		}
		else if(p.equals("3")){
			matriz [0][2] = j;
		}
		else if(p.equals("4")){
			matriz [1][0] = j;
		}
		else if(p.equals("5")){
			matriz [1][1] = j;
		}
		else if(p.equals("6")){
			matriz [1][2] = j;
		}
		else if(p.equals("7")){
			matriz [2][0] = j;
		}
		else if(p.equals("8")){
			matriz [2][1] = j;
		}
		else if(p.equals("9")){
			matriz [2][2] = j;
		}
		 else if(!p.equals("9") && !p.equals("8") && !p.equals("7") && !p.equals("6") 
	                && !p.equals("5") && !p.equals("4") && !p.equals("3") && !p.equals("2")
	                && !p.equals("1")){
	            l = "jogada inválida";
	        }     
	        return l;
	}
	public String GanharJogo (int jogadas){
		String T [] = new String [8];
		String vencedor = "null";
		if(jogadas == 9){
			vencedor = "VELHA";
		}
		//linhas
		T [0] = matriz [0][0] + matriz [0][1] + matriz [0][2];
		T [1] = matriz [1][0] + matriz [1][1] + matriz [1][2];
		T [2] = matriz [2][0] + matriz [2][1] + matriz [2][2];
		//colunas
		T [3] = matriz [0][0] + matriz [1][0] + matriz [2][0];
		T [4] = matriz [0][1] + matriz [1][1] + matriz [2][1];
		T [5] = matriz [0][2] + matriz [1][2] + matriz [2][2];
		//diagonais
		T [6] = matriz [0][0] + matriz [1][1] + matriz [2][2];
		T [7] = matriz [0][2] + matriz [1][1] + matriz [2][0];
		int a;

		for( a = 0; a < T.length; a++){
			if(T[a].equals("XXX")){
				vencedor = "Jogador 1";
			}
			else if (T[a] .equals("OOO")){
				vencedor = "Jogador 2";
			}
		}
		return vencedor;

	}
}




