package calculator.entities;

public class Resta extends Operacion{

    public Resta(String left_equation, String right_equation ){
        left = Operacion.buildFromEquation(left_equation);
        right = Operacion.buildFromEquation(right_equation);
    }

    @Override
    public float operate(){
        return left.operate() - right.operate();

    }

}