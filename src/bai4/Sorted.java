package bai4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Sorted
{
    public static void main(String[] args)
    {
        // Sap xep chuoi thu tu theo bang chu cai
        List<String> random = Arrays.asList("A","D","G","L","M","N","G","H");

       List<String> sorted = random.stream().sorted().toList();

        System.out.println(sorted);
    }
}
