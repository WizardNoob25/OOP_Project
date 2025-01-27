import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    public int numero(){
        Scanner sc = new Scanner(System.in);
        int numero = 8;
        boolean flag = true;
        do{
            try{
                System.out.print("Digite um numero: ");
                numero = sc.nextInt();
                flag = false;
            }catch(InputMismatchException e){
                System.out.println("Apeans numeros inteiros são permitidos!");
            }finally{
                sc.nextLine();
            }
        }while (flag);
        return numero;
    }
}
