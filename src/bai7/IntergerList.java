package bai7;

import org.w3c.dom.ranges.Range;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class IntergerList
{
    public static void main(String[] args)
    {
        // Tao danh sach so nguyen mot day so tu x-y
        // Su dung API va phuong thuc range()

        // Nhap so x va y tu ban phim
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Moi ban nhap so bat dau day");
        int numberStart = Integer.parseInt(scanner.nextLine());
        System.out.println("Moi ban nhap so ket thuc day");
        int numberEnd = Integer.parseInt(scanner.nextLine());
        //
        IntStream listNum = IntStream.range(numberStart,numberEnd);
        listNum.forEach(System.out::println);
        //
        List<Integer> listNum2 = new ArrayList<>();
        IntStream.range(numberStart,numberEnd + 1).forEach(listNum2::add);

        listNum2.forEach(System.out::println);




    }
}
