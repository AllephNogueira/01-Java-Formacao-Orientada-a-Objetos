//Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal. Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o método. Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.

public class Main {
    public static void main(String[] args) {

        Gato anastacia = new Gato();
        anastacia.emitirSom();
        anastacia.arranharMoveis();

        Cachorro Crixus = new Cachorro();
        Crixus.emitirSom();
        Crixus.abanarRabo();


    }
}