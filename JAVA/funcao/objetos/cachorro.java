public class cachorro{

    String nome;
    String raca;
    float peso;
    int idade;

    public cachorro(String nome, String raca, float peso, int idade){
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
        this.idade = idade;
    }

    public void latir(){
        System.out.println("Ruff Ruff");
    }
    public void comer(){
        System.out.println("yummy yummy");
    }
    public void dormir(){
        System.out.println("Zzz...");
    }
}