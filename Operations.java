package calc;

public class Operations {

    private  double valor;

    public int getValor() {
        return (int) valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    public void Numero(){
        this.valor = 0;
    }
    public void info(){
        System.out.println("Welcome to the basic calculator");
        System.out.println("type 1 for addition");
        System.out.println("type 2 for subtraction");
        System.out.println("type 3 for multiplication");
        System.out.println("type 4 for division");
        System.out.println("type 5 to end");
        System.out.println("-----> ");
    }
    public void info2(){
        System.out.println("type 1 for addition");
        System.out.println("type 2 for subtraction");
        System.out.println("type 3 for multiplication");
        System.out.println("type 4 for division");
        System.out.println("type 5 to end");
        System.out.println("-----> ");
    }
    public double soma(double a, double b){
        return a + b;
    }
    public double meno(double a, double b){
        return a - b;
    }
    public double div(double a, double b){
        return a  / b;
    }
    public double mult(double a, double b){
        return a * b;
    }

}
