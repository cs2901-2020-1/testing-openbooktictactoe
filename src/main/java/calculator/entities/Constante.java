package calculator.entities;

public class Constante extends Operacion{

    int value;

    public Constante(String equation){
        value = Integer.parseInt(equation);
        left = null;
        right = null;
    }

    @Override
    public float operate(){
        return (float)value;
    }
}