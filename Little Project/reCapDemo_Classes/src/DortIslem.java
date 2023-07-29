import java.beans.PropertyEditorSupport;
import java.sql.PreparedStatement;

public class DortIslem {
    public int addition(int num1 , int num2){
        return num1 + num2;
    }
    public int subtraction(int num1 , int num2){
        int result = num1 - num2;
        if (result < 0){
            return result * (-1);
        }
        return result;
    }
    public int multiplication(int num1 , int num2){
        int result = num1 * num2;
        return result;
    }
    public float division(float num1 , float num2){
        float result = num1 / num2;
        return result;
    }
}
