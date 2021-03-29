package  edu.umb.cs680.hw01;

public class Calculator {
	
    public static float add(float a, float b)
    {
    	float result = a + b;
        return result;
    }
    public static float sub(float a, float b)
    {
    	float result = a-b;
        return result;
    }
    public static float mul(float x, float y)
    {
    	float result = a*b;
        return result;
    }
    public static float div(float a, float b)
    {	
    	if(b==0)
    	{ 
    		throw new IllegalArgumentException("Division by zero");
    	}
    	float result = a/b;
        return result;
    }

}