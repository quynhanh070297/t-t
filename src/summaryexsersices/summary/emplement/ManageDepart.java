package summaryexsersices.summary.emplement;

import summaryexsersices.summary.config.InputMethods;
import summaryexsersices.summary.design.IDepartment;
import summaryexsersices.summary.entity.Department;
import summaryexsersices.summary.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class ManageDepart implements IDepartment
{

    public static List<Department> departmentList = new ArrayList<>();


    @Override
    public void display()
    {
        departmentList.forEach(System.out::println);
    }

    @Override
    public void create()
    {
        System.out.println("Moi ban nhap Thong tin phong ban");
        departmentList.add(inputdata());

    }

    @Override
    public void update()
    {
        Department newdsf = new Department();

        System.out.println("Moi ban nhap ID muon sua");
        String idUpdate = InputMethods.getString();
        for (Department department : departmentList)
        { if (idUpdate.equals(department.getDepartmentId()))
        {
            System.out.println("Moi ban nhap thong tin ban muon cap nhat");
            System.out.println("Nhap ten phong ban moi");
            String newName = InputMethods.getString();
            department.setDepartmentName(newName);
        }
        }
    }

    @Override
    public void displayById()
    {
        String idDis = InputMethods.getString();
        for (Department department : departmentList)
        { if (idDis.equals(department.getDepartmentId()))
            System.out.println(department);
        }
    }

    @Override
    public void delete()
    {
        String idDel = InputMethods.getString();
        for (Department department : departmentList)
        { if (idDel.equals(department.getDepartmentId()))
           departmentList.remove(department);
        }
    }

    @Override
    public Department inputdata()
    {
        Department newDepartment = new Department();
        System.out.println("Moi ban nhap ID");
        newDepartment.setDepartmentId(InputMethods.getString());

        System.out.println("Moi ban nhap ten phong ban");
        newDepartment.setDepartmentName(InputMethods.getString());
        //  newDepartment.setTotalMembers()
        return newDepartment;
    }
}
