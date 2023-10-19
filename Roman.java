import java.util.Map;
import java.util.HashMap;
public class Roman{
     
private static final Map<Character,
        Integer> roman = new HashMap<Character, 
                                     Integer>() 
{{
    put('I', 1);
    put('V', 5);
    put('X', 10);
    put('L', 50);
    put('C', 100);
    put('D', 500);
    put('M', 1000);
}};
 

private static int romanToInt(String s)
{
    int output = 0;
    int n = s.length();
     
    for(int i = 0; i < n; i++) 
    {        
         if (i != n - 1 && 
            roman.get(s.charAt(i)) < 
            roman.get(s.charAt(i + 1)))
        {
            output += roman.get(s.charAt(i + 1)) -
                   roman.get(s.charAt(i));
            i++;
        } 
        else
        {
            output += roman.get(s.charAt(i));
        }
    }
    return output;
}
 

public static void main(String[] args) 
{    
    
    String input = "X";
     
    System.out.print(
    "Integer form of Roman Numeral is " +
     romanToInt(input));
}
}
