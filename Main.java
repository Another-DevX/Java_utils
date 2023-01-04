import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int response = 0;
        do {
            System.out.println("Ingresa alguna de las siguientes opciones \n" +
                    "1 __ funcMatriz");
            Scanner sc = new Scanner(System.in);
            response = sc.nextInt();
        }while(response != 1);

        if(response == 1){
            Matriz.runMatriz();
        }
    }
}