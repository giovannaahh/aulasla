import java.util.Scanner;

public class slaaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] nome = new String[5];
        int[] idade = new int [5];

        for (int x=0; x<5; x++){

            System.out.println("----Cadastro de Usúario-----");
            System.out.println("digite o seu nome:");
            nome[x] = scanner.nextLine();

            System.out.println("Digite sua idade: ");
            idade[x] = Integer.parseInt(scanner.nextLIne());

            System.out.println("Digite seu sexo ");
            sexo[x] = scanner.nextLine();

            System.out.println("lista de Usùario");
            for (int x=0; x<5; x++){
            System.out.println("nome + "+nome[x]+ " - idade:  "+idade[x]+ " - sexo: ");
        }
    }
        }


    }











