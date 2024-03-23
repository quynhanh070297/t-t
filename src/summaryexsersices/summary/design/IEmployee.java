package summaryexsersices.summary.design;

import summaryexsersices.summary.entity.Employee;

public interface IEmployee extends CRUD<Employee>
{
    // Interface kế thừa CRUD và có thêm phương thức riêng của mình thông qua
    //Phương thức truyền tham số Genneric

    void salaryAverage();
    void maxfiveEmApart();
    void manMaxEmployee();
    void maxFiveAge();
    void maxFiveSalary();
}
