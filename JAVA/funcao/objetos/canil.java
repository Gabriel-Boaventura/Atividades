public class canil {

    public static void main(String[] args) {
        
        cachorro cachorro1 = new cachorro("bobi","viralata",5,7);
        cachorro cachorro2 = new cachorro("belinha","salsicha",5,12);

        System.out.println(cachorro1.nome);
        cachorro1.latir();
        cachorro1.dormir();
        cachorro1.comer();

        System.out.println(cachorro2.nome);
        cachorro2.latir();
        cachorro2.dormir();
        cachorro2.comer();
    }
}