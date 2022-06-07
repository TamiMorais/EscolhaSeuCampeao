public class Habilidades {
    
    private float altura;
    private float peso;
    private int forca;
    private int agilidade;
    private int inteligencia;

    public Habilidades(float altura, float peso, int forca, int agilidade, int inteligencia){
        this.altura = altura;
        this.peso = peso;
        this.forca = forca;
        this.agilidade = agilidade;
        this.inteligencia = inteligencia;
    }
    
    public float altura(){
        return this.altura;
    }
    public float peso(){
        return this.peso;
    }
    public int forca(){
        return this.forca;
    }
    public int agilidade(){
        return this.agilidade;
    }
    public int inteligencia(){
        return this.inteligencia;
    }

}
