import java.util.ArrayList;

public class Campeoes {
    
    private Habilidades habilidadesCampeao1 = new Habilidades((float) 1.80 , 90 , 8, 6, 7);
    private Personagem campeao1 = new Personagem("Gulian" , "Masculino" , habilidadesCampeao1 );

    private Habilidades habilidadesCampeao2 = new Habilidades((float) 1.70 , 75 , 9, 8, 7);
    private Personagem campeao2 = new Personagem("Reenya" , "Feminino" , habilidadesCampeao2 );

    private Habilidades habilidadesCampeao3 = new Habilidades((float) 1.53 , 60 , 10, 4, 6);
    private Personagem campeao3 = new Personagem("Jullye" , "Feminino" , habilidadesCampeao3 );

    private Habilidades habilidadesCampeao4 = new Habilidades((float) 1.95 , 110 , 10, 4, 3);
    private Personagem campeao4 = new Personagem("Kann" , "Masculino" , habilidadesCampeao4 );

    private ArrayList<Personagem> listaCampeoes = new ArrayList<Personagem>();

    public Campeoes(){
        this.listaCampeoes.add(campeao1);
        this.listaCampeoes.add(campeao2);
        this.listaCampeoes.add(campeao3);
        this.listaCampeoes.add(campeao4);
    }

    public ArrayList<Personagem> retornarCampeoes(){
        return this.listaCampeoes;
    }
}
