package bai2;

import java.util.Arrays;
import java.util.Random;

public class EvenNumber
{
    public static void main(String[] args)
    {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = new Random().nextInt(1000);
        }
        int[] newArr = Arrays.stream(arr).filter(number->number%2==0).toArray();

    }
}
