import java.util.ArrayList;
import java.util.Scanner;

public class Batalha {

    private Campeoes campeoes = new Campeoes();
    private ArrayList<Personagem> personagensNaBatalha = new ArrayList<Personagem>();

    // public Batalha(){
    // this.personagensJogador1();
    // }

    public void incluirPersonagem(Personagem personagem) {
        this.personagensNaBatalha.add(personagem);
    }

    public void personagensJogador1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Aqui estão os Campeões");
        System.out.println(" ");
        for (int index = 0; index < this.campeoes.retornarCampeoes().size(); index++) {
            System.out.print("Campeão #" + (index + 1) + " ");
            System.out.println(this.campeoes.retornarCampeoes().get(index).nome());
        }
        System.out.println(" ");

        System.out.println("Jogador 1,");
        System.out.println("Escolha seu primeiro campeão");

        int campeaoEscolhido = sc.nextInt();
        this.incluirPersonagem(this.campeoes.retornarCampeoes().get(campeaoEscolhido - 1));

        System.out.println("Agora escolha seu segundo Campeão");
        campeaoEscolhido = sc.nextInt();
        this.incluirPersonagem(this.campeoes.retornarCampeoes().get(campeaoEscolhido - 1));
        this.retornarPersonagensJogador(1);

    }

    public void personagensJogador2() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        // for (int index = 0; index < this.campeoes.retornarCampeoes().size(); index++) {
        //     System.out.print("Campeão #" + (index + 1) + " ");
        //     System.out.println(this.campeoes.retornarCampeoes().get(index).nome());
        // }
        // System.out.println(" ");

        System.out.println("Jogador 2,");
        System.out.println("Escolha seu primeiro campeão");

        int campeaoEscolhido = sc.nextInt();
        this.incluirPersonagem(this.campeoes.retornarCampeoes().get(campeaoEscolhido - 1));

        System.out.println("Agora escolha seu segundo Campeão");
        campeaoEscolhido = sc.nextInt();
        this.incluirPersonagem(this.campeoes.retornarCampeoes().get(campeaoEscolhido - 1));
        this.retornarPersonagensJogador(2);

    }

    public void retornarPersonagensJogador(int jogador){
        System.out.println(" ");
        System.out.println("╔══════════════════════════════╗ ");
        System.out.println("║ Jogador "+ jogador +" seus Campeões são: ║ ");
        int campeao1 = jogador == 1 ? 0 :2;
        int campeao2 = jogador == 1 ? 1 :3;

        System.out.print("  Campeão #1 ");
        System.out.println(this.personagensNaBatalha.get(campeao1).nome());
        System.out.print("  Campeão #2 ");
        System.out.println(this.personagensNaBatalha.get(campeao2).nome());
        System.out.println("╚══════════════════════════════╝ ");
        System.out.println(" ");
    }


    public void retornarPersonagensBatalha() {
        System.out.println(" ");
        System.out.println("╔══════════════════════════════╗ ");
        for (int index = 0; index < this.personagensNaBatalha.size(); index++) {
            if (index == 0) {
                System.out.println("║ Jogador 1 seus Campeões são: ║ ");
            } else if (index == 2) {
                System.out.println("╠══════════════════════════════╣ ");
                System.out.println("║ Jogador 2 seus Campeões são: ║ ");
            }
            System.out.println(" ");
            System.out.print("  Campeão #" + (index + 1) + " ");
            System.out.println(this.personagensNaBatalha.get(index).nome());
        }
        System.out.println("╚══════════════════════════════╝ ");
        System.out.println(" ");
    }
    public void iniciarBatalha(){
        this.compararCampeaoAgilidade(0, 2);
        this.compararCampeaoAgilidade(1, 3);

        this.compararCampeaoForca(0, 2);
        this.compararCampeaoForca(1, 3);

        this.compararCampeaoInteligencia(0, 2);
        this.compararCampeaoInteligencia(1, 3);

        this.exibirResultadoBatalha();
    }

    public void compararCampeaoAgilidade(int personagemJogador1 , int personagemJogador2) {

        if (this.personagensNaBatalha.get(personagemJogador1).habilidades().agilidade() > this.personagensNaBatalha.get(personagemJogador2)
                .habilidades().agilidade()) {
            int vidadoPersonagem = this.personagensNaBatalha.get(personagemJogador2).vida();
            vidadoPersonagem = vidadoPersonagem - 2;
            this.personagensNaBatalha.get(personagemJogador2).vida(vidadoPersonagem);

        } else if (this.personagensNaBatalha.get(personagemJogador1).habilidades().agilidade() < this.personagensNaBatalha.get(personagemJogador2)
                .habilidades().agilidade()) {
            int vidadoPersonagem = this.personagensNaBatalha.get(personagemJogador1).vida();
            vidadoPersonagem = vidadoPersonagem - 2;
            this.personagensNaBatalha.get(personagemJogador1).vida(vidadoPersonagem);

        } else {
            int vidadoPersonagem = this.personagensNaBatalha.get(personagemJogador1).vida();
            vidadoPersonagem = vidadoPersonagem - 1;
            this.personagensNaBatalha.get(personagemJogador1).vida(vidadoPersonagem);

            int vidadoPersonagem2 = this.personagensNaBatalha.get(personagemJogador2).vida();
            vidadoPersonagem2 = vidadoPersonagem2 - 1;
            this.personagensNaBatalha.get(personagemJogador2).vida(vidadoPersonagem2);
        }
    }

    public void compararCampeaoInteligencia(int personagemJogador1 , int personagemJogador2) {

        if (this.personagensNaBatalha.get(personagemJogador1).habilidades().inteligencia() > this.personagensNaBatalha.get(personagemJogador2)
                .habilidades().inteligencia()) {
            int vidadoPersonagem = this.personagensNaBatalha.get(personagemJogador2).vida();
            vidadoPersonagem = vidadoPersonagem - 2;
            this.personagensNaBatalha.get(personagemJogador2).vida(vidadoPersonagem);

        } else if (this.personagensNaBatalha.get(personagemJogador1).habilidades().inteligencia() < this.personagensNaBatalha.get(personagemJogador2)
                .habilidades().inteligencia()) {
            int vidadoPersonagem = this.personagensNaBatalha.get(personagemJogador1).vida();
            vidadoPersonagem = vidadoPersonagem - 2;
            this.personagensNaBatalha.get(personagemJogador1).vida(vidadoPersonagem);

        } else {
            int vidadoPersonagem = this.personagensNaBatalha.get(personagemJogador1).vida();
            vidadoPersonagem = vidadoPersonagem - 1;
            this.personagensNaBatalha.get(personagemJogador1).vida(vidadoPersonagem);

            int vidadoPersonagem2 = this.personagensNaBatalha.get(personagemJogador2).vida();
            vidadoPersonagem2 = vidadoPersonagem2 - 1;
            this.personagensNaBatalha.get(personagemJogador2).vida(vidadoPersonagem2);
        }
    }

    public void compararCampeaoForca(int personagemJogador1 , int personagemJogador2) {

        if (this.personagensNaBatalha.get(personagemJogador1).habilidades().forca() > this.personagensNaBatalha.get(2).habilidades()
                .forca()) {
            int vidadoPersonagem = this.personagensNaBatalha.get(2).vida();
            vidadoPersonagem = vidadoPersonagem - 2;
            this.personagensNaBatalha.get(2).vida(vidadoPersonagem);

        } else if (this.personagensNaBatalha.get(personagemJogador1).habilidades().forca() < this.personagensNaBatalha.get(0)
                .habilidades().forca()) {
            int vidadoPersonagem = this.personagensNaBatalha.get(personagemJogador1).vida();
            vidadoPersonagem = vidadoPersonagem - 2;
            this.personagensNaBatalha.get(personagemJogador1).vida(vidadoPersonagem);

        } else {
            int vidadoPersonagem = this.personagensNaBatalha.get(personagemJogador1).vida();
            vidadoPersonagem = vidadoPersonagem - 1;
            this.personagensNaBatalha.get(personagemJogador1).vida(vidadoPersonagem);

            int vidadoPersonagem2 = this.personagensNaBatalha.get(2).vida();
            vidadoPersonagem2 = vidadoPersonagem2 - 1;
            this.personagensNaBatalha.get(2).vida(vidadoPersonagem2);
        }
    }

    public void exibirResultadoBatalha(){
        int vidaJogador1 = 0;
        int vidaJogador2 = 0;
        System.out.println(" ");
        for (int index = 0; index < this.personagensNaBatalha.size(); index++) {
            if (index == 0) {
                System.out.println("Jogador 1 seus Campeões são:  ");
            } else if (index == 2) {
                System.out.println("Jogador 2 seus Campeões são:  ");
            }
            System.out.print("Campeão #" + (index + 1) + " ");
            System.out.println(this.personagensNaBatalha.get(index).nome());
            System.out.print("Agilidade: ");
            System.out.println(this.personagensNaBatalha.get(index).habilidades().agilidade());
            System.out.print("Força: ");
            System.out.println(this.personagensNaBatalha.get(index).habilidades().forca());
            System.out.print("Inteligência: ");
            System.out.println(this.personagensNaBatalha.get(index).habilidades().inteligencia());
            System.out.print("Vida: ");
            System.out.println(this.personagensNaBatalha.get(index).vida());
            System.out.println(" ");

            vidaJogador1 += (index == 0 || index == 1 ? this.personagensNaBatalha.get(index).vida() : 0);
            vidaJogador2 += (index == 2 || index == 3 ? this.personagensNaBatalha.get(index).vida() : 0);
        }
        System.out.println(" ");
        if( vidaJogador1 > vidaJogador2){
            System.out.println("Jogador 1 venceu com o seu CAMPEÃO");
        } else  if( vidaJogador1 < vidaJogador2){
            System.out.println("Jogador 2 venceu com o seu CAMPEÃO");
        } else {
            System.out.println("Deu Empate, treinem mais e voltem");
        }
    }
}
