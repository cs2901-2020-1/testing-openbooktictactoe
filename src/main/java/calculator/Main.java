package calculator;
import calculator.entities.Operacion;
import java. util. Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expresion = input.next();
        Operacion op = Operacion.buildFromEquation(expresion);
        float n = op.operate();
        System.out.println(n);
    }
}