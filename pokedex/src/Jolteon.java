public class Jolteon extends Eevee {
    
    public Jolteon(String tipo, int altura, int HP, double peso){
        super(tipo, altura, HP, peso);
    }
    
    @Override
    public String ataque (){
        return "Trovoada - Thunder-Shock";
    }
    @Override
    public String defesa(){
        return "Carga - Wid Charge";
    }
    @Override
    public String especial(){
        return "Raio - Thunder";
    }

    public void imprimir(){
        System.out.println("Jolteon");
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
