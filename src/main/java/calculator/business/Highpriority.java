package calculator.business;

import calculator.entities.Operacion;
import java.util.ArrayList;

public class Highpriority {
    //private int pos;
    public static int pos;
    //private static ArrayList<String> operation = new ArrayList<String>();
    private static String operation = "+-*/";

    public void Highpriority(){}

    public void set_pos(int x){
        pos = x;
    }

    public int get_pos(){
        return pos;
    }

    public static int Highpriority(String equation){

        int size_op = operation.length();
        for(int i = 0; i < size_op; i++){
            int c = 0;
            for(int j = 0; j < equation.length(); j++){
                if( c == 0 ){
                    if(equation.substring(j,j+1).equals(operation.substring(i,i+1))){
                        pos = j;
                        return i+1;
                    }
                }
            }
        }
        return -1;
    }
}
