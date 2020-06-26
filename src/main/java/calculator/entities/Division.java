package calculator.entities;
public class Division extends Operacion{

    public Division(String left_equation, String right_equation){
        left = Operacion.buildFromEquation(left_equation);
        right = Operacion.buildFromEquation(right_equation);
    }

    @Override
    public float operate(){
        return left.operate() / right.operate();

    }
}