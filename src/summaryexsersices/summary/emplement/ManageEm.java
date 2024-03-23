package summaryexsersices.summary.emplement;

import summaryexsersices.summary.config.InputMethods;
import summaryexsersices.summary.design.IEmployee;
import summaryexsersices.summary.entity.Department;
import summaryexsersices.summary.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class ManageEm implements IEmployee
{
    public static List <Employee> employeeList = new ArrayList<>();

//      Thống kê số lượng nhân viên trung bình của mỗi phòng
//      Tìm ra 5 phòng có số lượng nhân viên đông nhất
//      Tìm ra người quản lý nhiều  nhân viên nhất
//      Tìm ra 5 nhân viên có tuổi cao nhất công ty
//      Tìm ra 5 nhân viên hưởng lương cao nhất

    @Override
    public void salaryAverage()
    {
        System.out.println("So nhan vien trung binh cua moi phong la :"+ employeeList.size()/ ManageDepart.departmentList.size());
    }

    @Override
    public void maxfiveEmApart()
    {
        ManageDepart.departmentList.sort((o1, o2) -> o1.getTotalMembers()-o2.getTotalMembers());
    }

    @Override
    public void manMaxEmployee()
    {

    }

    @Override
    public void maxFiveAge()
    {

    }

    @Override
    public void maxFiveSalary()
    {

    }
    public static void totalMembers(){
        for (Department department : ManageDepart.departmentList)
        {
            int cout = 0;
            for (Employee employee : employeeList)
            {
                if (department.getDepartmentId().equals(employee.getDepartment().getDepartmentId()))
                {
                    cout++;
                }
            }
            department.setTotalMembers(cout);
        }


    }

    @Override
    public void display()
    {
        employeeList.forEach(System.out::println);
    }

    @Override
    public void create()
    {
        System.out.println("Moi ban nhap thong  tin");
        inputdata();
    }

    @Override
    public void update()
    {
        String updateId = InputMethods.getString();
        for (Employee employee : employeeList)
        {
            if (updateId.equals(employee.getEmployeeId())){

            }
        }
    }

    @Override
    public void displayById()
    {
        String idDis = InputMethods.getString();

        for (Employee Employee : employeeList)
        {
            System.out.println(Employee.toString());
        }
    }

    @Override
    public void delete()
    {
        String idDis = InputMethods.getString();

        for (Employee Employee : employeeList)
        {
            if (idDis.equals(Employee.getEmployeeId()))
            {
                employeeList.remove(Employee);
            }
        }
    }

    @Override
    public Employee inputdata()
    {
        Employee employee = new Employee();

        System.out.println("Moi ban nhap ID");
        employee.setEmployeeId(InputMethods.getString());
        System.out.println("Moi ban nhap Ten");
        employee.setEmployeeName(InputMethods.getString());
        System.out.println("Moi ban nhap ngay sinh");
        employee.setBirthday(InputMethods.getDate());
        System.out.println("Moi ban nhap Gioi Tinh");
        employee.setSex(InputMethods.getBoolean());
        System.out.println("Moi ban nhap Salary");
        employee.setSalary(InputMethods.getDouble());
        System.out.println("Moi ban chon quan ly");
        if (employeeList.isEmpty())
        {
            System.out.println("Ban dang khong co nguoi quan ly nao");
            System.out.println("Them quan ly");
        }else {
            employeeList.forEach(System.out::println);
            System.out.println("Moi ban nhap ID nguoi quan ly");
            String idManager = InputMethods.getString();
            for (Employee employee1 : employeeList)
            {
                if (idManager.equals(employee1.getEmployeeId())){
                    employee.setManager(employee1);
                }
            }
        }
        System.out.println();
        if (ManageDepart.departmentList.isEmpty()){
            System.out.println("Moi ban them phong ban");
            ManageDepart callDepart = new ManageDepart();
            callDepart.inputdata();
        }else {
            ManageDepart.departmentList.forEach(System.out::println);
            System.out.println("Moi ban nhap ID phong ban");
            String idDepart = InputMethods.getString();
            for (Department department : ManageDepart.departmentList)
            {
                if (idDepart.equals(department.getDepartmentId())){
                    employee.setDepartment(department);
                }
            }
            return null;
        }
        employeeList.add(employee);
        return employee;
    }
}
