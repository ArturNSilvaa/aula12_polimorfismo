public class Leafeon extends Eevee {
    
    public Leafeon(String tipo, int altura, int HP, double peso){
        super(tipo, altura, HP, peso);
    }

    @Override
    public String ataque (){
        return "Leaf Blade";
    }
    @Override
    public String defesa(){
        return "WBullet Seed";
    }
    @Override
    public String especial(){
        return "Solar Beam";
    }

    public void imprimir(){
        System.out.println("Leafeon");
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
