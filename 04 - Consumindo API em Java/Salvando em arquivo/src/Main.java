import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // Ficha cadastral salvando em arquivos txt
        Dados usuario1 = new Dados("Alleph", 30, "allephn@hotmail.com.br", "São Gonçalo", 21.975575694);
        //Agora vamos ler os dados para verificar se tudo está correto.


        FileWriter escrita = new FileWriter("Dados.txt");
        escrita.write(usuario1.toString());
        escrita.write("\n");


        Dados usuario2 = new Dados("Fernanda", 28, "ferr.ferreiraoliveira@gmail.com", "São Gonçalo", 21.980301853);
        escrita.write(usuario2.toString());
        escrita.write("\n");


        Dados usuario3 = new Dados("Larissa", 16, "larissabundasuja@hotmail.com", "São Gonçalo", 21.99999999);
        escrita.write(usuario3.toString());
        escrita.write("\n");
        escrita.close();



    }
}