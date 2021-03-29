package  edu.umb.cs680.hw02;

public class Calculator {
	
    public static float add(float a, float b)
    {
    	float result = a+b;
        return result;
    }
    public static float subtract(float a, float b)
    {
    	float result = a-b;
        return result;
    }
    public static float multiply(float a, float b)
    {
    	float result = a*b;
        return result;
    }
    public static float divide(float a, float b)
    {	
    	if(b==0)
    	{ 
    		throw new IllegalArgumentException("Num divid by zero");
    	}
    	float result = a/b;
        return result;
    }

}