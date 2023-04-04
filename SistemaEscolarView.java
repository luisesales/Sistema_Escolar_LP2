import java.util.Scanner;
public class SistemaEscolarView{
    public static void main(String args[]){
        double[] notas = {0.0,0.0,0.0,0.0};
        Scanner scan = new Scanner(System.in);
        Turma t = new Turma();
        System.out.println("Inserindo dados do primeiro aluno");

        System.out.print("Insira a primeira nota da primeira prova [0-5]: ");
        notas[0] = scan.nextDouble();
        System.out.println();

        System.out.print("Insira a segunda nota da primeira prova  [0-5]: ");
        notas[1] = scan.nextDouble();
        System.out.println();

        System.out.print("Insira a primeira nota da segunda prova  [0-5]: ");
        notas[2] = scan.nextDouble();
        System.out.println();

        System.out.print("Insira a segunda nota da segunda prova   [0-5]: ");
        notas[3] = scan.nextDouble();
        System.out.println();
        System.out.println();

        t.setAluno1(notas[0],notas[1],notas[2],notas[3]);


        System.out.println("Inserindo dados do segundo aluno");

        System.out.print("Insira a primeira nota da primeira prova [0-5]: ");
        notas[0] = scan.nextDouble();
        System.out.println();

        System.out.print("Insira a segunda nota da primeira prova  [0-5]: ");
        notas[1] = scan.nextDouble();
        System.out.println();

        System.out.print("Insira a primeira nota da segunda prova  [0-5]: ");
        notas[2] = scan.nextDouble();
        System.out.println();

        System.out.print("Insira a segunda nota da segunda prova   [0-5]: ");
        notas[3] = scan.nextDouble();
        System.out.println();
        System.out.println();

        t.setAluno2(notas[0],notas[1],notas[2],notas[3]);


        System.out.println("Inserindo dados do terceiro aluno");

        System.out.print("Insira a primeira nota da primeira prova [0-5]: ");
        notas[0] = scan.nextDouble();
        System.out.println();

        System.out.print("Insira a segunda nota da primeira prova  [0-5]: ");
        notas[1] = scan.nextDouble();
        System.out.println();

        System.out.print("Insira a primeira nota da segunda prova  [0-5]: ");
        notas[2] = scan.nextDouble();
        System.out.println();

        System.out.print("Insira a segunda nota da segunda prova   [0-5]: ");
        notas[3] = scan.nextDouble();
        System.out.println();
        System.out.println();

        t.setAluno3(notas[0],notas[1],notas[2],notas[3]);
        
        System.out.print("Aluno 1 - Média : " + t.getAluno1().calcularMedia() + "\n");
        System.out.print("Aluno 2 - Média : " + t.getAluno2().calcularMedia() + "\n");
        System.out.print("Aluno 3 - Média : " + t.getAluno3().calcularMedia() + "\n");
        System.out.print("Turma   - Média : " + String.format("%.1f",t.calcularMedia()) + "\n");
    }
}