package calculator.entities;
import calculator.business.Highpriority;
public abstract class Operacion {

    public String equation;
    //public HighpriorityClass h = new HighpriorityClass();
    public Operacion left;
    public Operacion right;

    public static Operacion buildFromEquation(String equation){
        //switch (h.Highpriority(equation)){
        Operacion tmp=null;
        int tmp2 = Highpriority.Highpriority(equation.trim());
        switch (tmp2){
            case 1:
                String left = equation.substring(0, Highpriority.pos);
                String right = equation.substring(Highpriority.pos+1, equation.length());

                tmp = new Suma(left, right);
                break;

            case -1:
                tmp = new Constante(equation);
                break;
            case 2:
                tmp = new Resta(
                        equation.substring(0,Highpriority.pos),
                        equation.substring(Highpriority.pos+1, equation.length()));
                break;
            case 3:
                tmp = new Multiplicacion(
                        equation.substring(0,Highpriority.pos),
                        equation.substring(Highpriority.pos+1, equation.length()));
                break;
            case 4:
                tmp = new Division(
                        equation.substring(0,Highpriority.pos),
                        equation.substring(Highpriority.pos+1, equation.length()));
                break;
        }

        return tmp;
    }

    abstract public float operate();

}












