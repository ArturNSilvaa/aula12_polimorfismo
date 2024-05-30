public class Eevee {
    private String tipo;
    private int altura, HP;
    private double peso;

    
    

    public String ataque (){
        return "Ataque rápido";
    }
    public String defesa(){
        return "Desvio";
    }
    public String especial(){
        return "Tri-ataque";
    }

    //CONSTRUTOR
    public Eevee(String tipo, int altura, int HP, double peso){
        this.tipo = tipo;
        this.altura = altura;
        this.HP = HP;
        this.peso = peso;
   
    }
    
    // Métodos

    
    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getHP() {
        return HP;
    }
    public void setHP(int hP) {
        HP = hP;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }    

    public void imprimir(){
        System.out.println("Eevee");
        System.out.println("Tipo: " + getTipo());
        System.out.println("Altura: " + getAltura());
        System.out.println("HP: " + getHP());
        System.out.println("Peso: " + getPeso());
        System.out.println("Ataque: "+ataque());
        System.out.println("Defesa: "+defesa());
        System.out.println("Especial: "+especial());
        System.out.println("------------------------");
        }
}
