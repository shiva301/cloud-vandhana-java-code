import java.util.*;
public class shuffleArray
{
    public static void main(String args[])
    {
        Integer arr[]={1,2,3,4,5,6};
        List<Integer> list=Arrays.asList(arr);
        Collections.shuffle(list);
        list.toArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}