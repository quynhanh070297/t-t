package bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxInteger
{
    public static void main(String[] args)
    {
        // Tạo ngẫu nhiên danh sách 100 phần tử ko trùng lặp có khoảng giá tri từ 1 - 1000;
        List<Integer> random = Stream.generate(()->new Random().nextInt(1000))
                .limit(100)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(random);
        System.out.println(random.get(random.size()-1));
        // Lay o1- o2 de so sanh
        Integer max2 = random.stream().max((o1, o2) -> o1-o2).orElse(0);
        Integer max = random.stream().max(Integer::compareTo).orElse(0);
        System.out.println(max);
        System.out.println(max2);

    }
}
