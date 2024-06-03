import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        DadosUsuarios user1 = new DadosUsuarios("Livia", "Oliveira");
        DadosUsuarios user2 = new DadosUsuarios("Fernanda", "Ferreira");
        DadosUsuarios user3 = new DadosUsuarios("Larissa", "Nogueira");
        DadosUsuarios user4 = new DadosUsuarios("Alleph", "Nogueira");
        DadosUsuarios user5 = new DadosUsuarios("Alesandro", "Martins");


        List<DadosUsuarios> usuarios;

        usuarios = new LinkedList<>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);
        usuarios.add(user4);
        usuarios.add(user5);

        // Imprimir a lista

        System.out.println("Minha lista de usuarios cadastrados é: " + usuarios);
        System.out.println("Quantidade de usuarios cadastrados é: " + usuarios.size());


        Collections.sort(usuarios);
        System.out.println("Minha lista em ordem é:");
        System.out.println(usuarios);
    }
}