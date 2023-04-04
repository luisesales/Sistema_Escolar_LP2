import java.util.Scanner;
public class Prova{
    private Scanner scan = new Scanner(System.in);
    private double notaParte1;
    private double notaParte2;

    // Setting notaParte1 value
    public void setNota1(double nota){
        while(nota < 0 || nota > 5){
            System.out.print("Insira uma nota válida! : ");
            nota = scan.nextDouble();
            System.out.println();
        }
        notaParte1 = nota;            
    }
    // Returning notaParte1 value
    public double getNota1(){return notaParte1;}


    // Setting notaParte2 value
    public void setNota2(double nota){
        while(nota < 0 || nota > 5){
            System.out.print("Insira uma nota válida! : ");
            nota = scan.nextDouble();
            System.out.println();
        }
        notaParte2 = nota;            
    }
    // Returning notaParte2 value
    public double getNota2(){return notaParte2;}


    // Returning the total value 
    public double calcularNotaTotal(){
        if((notaParte1 + notaParte2) <= 10){
            return notaParte1 + notaParte2;
        }
        else return -1;
    }
}