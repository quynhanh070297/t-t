package summaryexsersices.run;

import summaryexsersices.summary.emplement.ManageEm;
import summaryexsersices.summary.entity.Employee;

public class Test
{
    public static void main(String[] args)
    {
        Employee newEm = new Employee();
        ManageEm call = new ManageEm();

        System.out.println( call.inputdata());

    }
}
