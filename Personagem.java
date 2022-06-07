public class Personagem {
    
    private String nome;
    private String sexo;
    private int vida;
    private Habilidades habilidades;

    
    public Personagem(String nome, String sexo, Habilidades habilidades){
        this.nome = nome;
        this.sexo = sexo;
        this.vida = 10;
        this.habilidades = habilidades;
    }
    public String nome(){
        return this.nome;
    }
    public String sexo (){
        return this.sexo;
    }
    public int vida (){
        return this.vida;
    }
    public void vida(int vida){
        this.vida = vida;
    }
    public Habilidades habilidades(){
        return this.habilidades;
    }

}
