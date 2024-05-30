public class Flareon extends Eevee{
    
    public Flareon(String tipo, int altura, int HP, double peso){
        super(tipo, altura, HP, peso);
    }

    @Override
    public String ataque (){
        return "Ember";
    }
    @Override
    public String defesa(){
        return "Fire Spin";
    }
    @Override
    public String especial(){
        return "Overheat";
    }

    public void imprimir(){
        System.out.println("Flareon");
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
