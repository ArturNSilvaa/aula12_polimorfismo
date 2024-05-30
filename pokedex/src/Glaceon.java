public class Glaceon extends Eevee{
    
    public Glaceon(String tipo, int altura, int HP, double peso){
        super(tipo, altura, HP, peso);
    }

    @Override
    public String ataque (){
        return "Frost Breath";
    }
    @Override
    public String defesa(){
        return "Ice Shard";
    }
    @Override
    public String especial(){
        return "Ice Beam";
    }

    public void imprimir(){
        System.out.println("Glaceon");
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
