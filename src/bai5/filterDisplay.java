package bai5;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class filterDisplay
{
    public static void main(String[] args)
    {
        //Loc va hien thi ra mot so lon hon so xac dinh tu mang so nguyen
        // 1. Tao 1 mang so nguyen random tu 1-100
        List<Integer> random = Stream.generate(()->new Random().nextInt(100))
                .distinct()
                .limit(100)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(random);

        // 2.Cho nguoi dung nhap vao ban phim so can so sanh
        System.out.println("Nhap so ban muon so sanh ");
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        // Loc mang da chon bang filter roi in ra nhung phan tu da duoc loc bang foeach
        random.stream().filter(number->number>num).forEach(System.out::println);
    }
}
