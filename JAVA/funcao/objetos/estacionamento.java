public class estacionamento {

    public static void main(String[] args) {
        
        carro carro1 = new carro ("versa","nissan",2015);
        carro carro2 = new carro("corola","toyotta",2020);

        System.out.println(carro1.nome);
        carro1.acelerar();
        carro1.freiar();
        carro1.estacionar();

        System.out.println(carro2.nome);
        carro2.acelerar();
        carro2.freiar();
        carro2.estacionar();
    }
}