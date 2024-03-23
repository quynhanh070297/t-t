package bai8;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

public class anyMatch
{
    public static void main(String[] args)
    {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = new Random().nextInt(100);
        }

        System.out.println(Arrays.toString(arr));
        boolean check = Arrays.stream(arr).anyMatch(value -> value%2==0);
        OptionalInt optionalInt = Arrays.stream(arr).filter(value -> value%2==0).findAny();
    }
}
