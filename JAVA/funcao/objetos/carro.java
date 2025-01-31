public class carro{

    String nome;
    String marca;
    int ano;

    public carro(String nome, String marca,int ano){
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
    }

    public void acelerar(){
        System.out.println(" acelerando... ");
    }
    public void estacionar(){
        System.out.println(" estacionando... ");
    }
    public void freiar(){
        System.out.println(" freiando... ");
    }
}
    
