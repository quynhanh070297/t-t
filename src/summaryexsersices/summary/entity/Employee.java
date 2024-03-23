package summaryexsersices.summary.entity;

import summaryexsersices.summary.config.InputMethods;

import java.time.LocalDate;
import java.util.Date;

public class Employee
{
    //  	Nhân viên (Employee):
    //employeeId - String : mã nhân viên , bắt dầu bằng kí tự E , có 5 kí tự
    //employeeName - String : tên nhân viên
    //birthday - LocalDate : ngày sinh (định dạng dd/MM/yyyy)
    //sex - boolean : giới tính
    //salary - Decimal : lương cơ bản
    //manager : Employee : người quản lí , có thể null
    //department: chọn từ danh sách department

    private String employeeId ;
    private String employeeName ;
    private Date birthday;
    private boolean sex;
    private Double salary;
    private Employee manager;
    private Department department;

    public Employee()
    {
    }

    public Employee(String employeeId, String employeeName,Date birthday, boolean sex, Double salary, Employee manager, Department department)
    {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.birthday = birthday;
        this.sex = sex;
        this.salary = salary;
        this.manager = manager;
        this.department = department;
    }

    public String getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId(String employeeId)
    {
        this.employeeId = employeeId;
    }

    public String getEmployeeName()
    {
        return employeeName;
    }

    public void setEmployeeName(String employeeName)
    {
        this.employeeName = employeeName;
    }

    public Date getBirthday()
    {
        return birthday;
    }

    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

    public boolean isSex()
    {
        return sex;
    }

    public void setSex(boolean sex)
    {
        this.sex = sex;
    }

    public Double getSalary()
    {
        return salary;
    }

    public void setSalary(Double salary)
    {
        this.salary = salary;
    }

    public Employee getManager()
    {
        return manager;
    }

    public void setManager(Employee manager)
    {
        this.manager = manager;
    }

    public Department getDepartment()
    {
        return department;
    }

    public void setDepartment(Department department)
    {
        this.department = department;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", salary=" + salary +
                ", manager=" + manager +
                ", department=" + department +
                '}';
    }

}
