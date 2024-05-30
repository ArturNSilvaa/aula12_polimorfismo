public class Umbreon extends Eevee {
    
    public Umbreon(String tipo, int altura, int HP, double peso){
        super(tipo, altura, HP, peso);
    }

    @Override
    public String ataque (){
        return "Feint Attack";
    }
    @Override
    public String defesa(){
        return "Snar";
    }
    @Override
    public String especial(){
        return "Foul Play";
    }

    public void imprimir(){
        System.out.println("Umbreon");
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
