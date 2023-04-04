public class Turma{
    private Aluno aluno1;
    private Aluno aluno2;
    private Aluno aluno3;

    
    // Setting aluno1
    public void setAluno1(double p1n1, double p1n2, double p2n1, double p2n2){
        aluno1 = new Aluno();
        aluno1.setProva1(p1n1,p1n2);
        aluno1.setProva2(p2n1,p2n2);
    }
    // Returning aluno1
    public Aluno getAluno1(){return aluno1;}


    // Setting aluno2
    public void setAluno2(double p1n1, double p1n2, double p2n1, double p2n2){
         aluno2 = new Aluno();
         aluno2.setProva1(p1n1,p1n2);
         aluno2.setProva2(p2n1,p2n2);
    }
    // Returning aluno2
    public Aluno getAluno2(){return aluno2;}


    // Setting aluno3
    public void setAluno3(double p1n1, double p1n2, double p2n1, double p2n2){
         aluno3 = new Aluno();
         aluno3.setProva1(p1n1,p1n2);
         aluno3.setProva2(p2n1,p2n2);
    }
    // Returning aluno3
    public Aluno getAluno3(){return aluno3;}


    public double calcularMedia(){
        return (aluno1.calcularMedia() +
                aluno2.calcularMedia() +
                aluno3.calcularMedia())/3;
    }
}