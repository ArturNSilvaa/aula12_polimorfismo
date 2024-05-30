public class Sylveon extends Eevee{
    
    public Sylveon(String tipo, int altura, int HP, double peso){
        super(tipo, altura, HP, peso);
    }

    @Override
    public String ataque (){
        return "Draining Kiss";
    }
    @Override
    public String defesa(){
        return "Charm";
    }
    @Override
    public String especial(){
        return "Moonblast";
    }

    public void imprimir(){
        System.out.println("Sylveon");
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
