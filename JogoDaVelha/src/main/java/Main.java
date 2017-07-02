import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Jogo jogo = new Jogo ();
        String posicao;
        int valida = 0 , Jogadas = 0;
        
        while(true){
            System.out.println("### Jogo da Velha ###");
            
            jogo.Mostrar();
            
            do{ // iniiar jogador 1
                System.out.print("Jogador 1 informe uma posição:");
                posicao = ler.next();
                while(!jogo.Validarposicao(posicao)){
                    System.out.println("Jogada Inválida, tente novamente");
                    System.out.print("Jogador 1 informe uma posição:");
                posicao = ler.next();
                valida = 0;  
                }
                jogo.Jogada(posicao, "X");
                valida = 1;
                
            } while (valida == 0); // finalizar jogador 1
            
             do{ // iniiar jogador 2
                System.out.print("Jogador 2 informe uma posição:");
                posicao = ler.next();
                while(!jogo.Validarposicao(posicao)){
                    System.out.println("Jogada Inválida, tente novamente");
                    System.out.print("Jogador 2 informe uma posição:");
                posicao = ler.next();
                valida = 0;  
                }
                jogo.Jogada(posicao, "O");
                valida = 1;
                
            } while (valida == 0); // finalizar jogador 2
           
            Jogadas++;
            jogo.Mostrar();
            valida = 0;
            if(!jogo.GanharJogo(Jogadas).equals("null")){
                break;
            }
   
        }
        
        System.out.println("O "+jogo.GanharJogo(Jogadas)+ "VENCEU!!!!" );
       
    }
}
