public class Pokedex {
    public static void main(String[] args) throws Exception {
       
        
        Eevee e = new Eevee("Normal", 30, 55, 6.5);
        Jolteon j = new Jolteon("Elétrico", 80, 65, 24.5);
        Vaporeon v = new Vaporeon("Aguá", 1, 130, 29);
        Flareon f = new Flareon("Fogo", 90, 65, 25);
        Espeon es = new Espeon("Psiquico", 90, 65, 26.5);
        Umbreon u = new Umbreon("Sombrio", 100, 95, 27);
        Leafeon l = new Leafeon("Grama", 100, 65, 25.5);
        Glaceon g = new Glaceon("Gelo", 80, 65, 25.9);
        Sylveon s = new Sylveon("Fada", 100, 95, 23.5);

        //imprimir
        //Eevee
        e.imprimir();

        //Jolteon
        j.imprimir();

        //Vaporeon
        v.imprimir();

        //Flareon
        f.imprimir();

        //Espeon
        es.imprimir();

        //Umbreon
        u.imprimir();

        //Leafeon
        l.imprimir();

        //Glaceon
        g.imprimir();

        //Sylveon
        s.imprimir();
    }
}

