public class Aluno{
    private Prova prova1;
    private Prova prova2;
    
    // Setting prova1
    public void setProva1(double nota1, double nota2){
        prova1 = new Prova();
        prova1.setNota1(nota1);
        prova1.setNota2(nota2);
    }
    // Returning prova1
    public Prova getProva1(){return prova1;}


    // Setting prova1
    public void setProva2(double nota1, double nota2){
        prova2 = new Prova();
        prova2.setNota1(nota1);
        prova2.setNota2(nota2);
        
    }
    // Returning prova2
    public Prova getProva2(){return prova2;}


    // Returning Média
    public double calcularMedia(){return (prova1.calcularNotaTotal() + prova2.calcularNotaTotal())/2;}
}