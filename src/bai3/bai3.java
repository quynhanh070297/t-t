package bai3;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bai3
{
    public static void main(String[] args)
    {
        //Tinh tong danh sach
        List<Integer> random = Stream.generate(()->new Random().nextInt(1000))
                .distinct()
                .limit(100)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(random);

        //Bieu thuc lambda
        int result = random.stream().reduce(0,(num,num2)->num+num2);

        // Tham chieu den phuong thuc SUM bawng Method Reference
        int result2 = random.stream().reduce(0, Integer::sum);

        // Chuyen tu Stream sang Mapint - va truyen tham so cho no
        int redult3= random.stream().mapToInt(Integer::intValue).sum();

        System.out.println(result);


    }
}
