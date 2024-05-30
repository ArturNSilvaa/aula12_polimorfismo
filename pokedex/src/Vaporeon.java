public class Vaporeon extends Eevee{
    
    public Vaporeon(String tipo, int altura, int HP, double peso){
        super(tipo, altura, HP, peso);
    }
    
    @Override
    public String ataque (){
        return "Water pulse";
    }
    @Override
    public String defesa(){
        return "Water Gun";
    }
    @Override
    public String especial(){
        return "Hydro Pump";
    }

    public void imprimir(){
        System.out.println("Vaporeon");
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
