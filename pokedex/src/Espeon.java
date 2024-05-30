public class Espeon extends Eevee{

//CONSTRUTOR
    public Espeon(String tipo, int altura, int HP, double peso){
        super(tipo, altura, HP, peso);
    }

    @Override
    public String ataque (){
        return "WPsybeam";
    }
    @Override
    public String defesa(){
        return "Psychic";
    }
    @Override
    public String especial(){
        return "Future Sight";
    }
    @Override
    public String getTipo(){
        return "Psychic";
    }



    public void imprimir(){
        System.out.println("Espeon");
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
