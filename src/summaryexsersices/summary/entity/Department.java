package summaryexsersices.summary.entity;

import summaryexsersices.summary.config.InputMethods;
import summaryexsersices.summary.design.CRUD;


public class Department
{
    //Xây dựng ứng dụng quản trị nhân sự gồm các đối tượng sau :
    // 	Phòng ban (Department) :
    //departmentId - String : mã phòng ban , không trùng lặp , bắt đầu bằng kí tự D và có
    //đúng 4 kí tự.
    //departmentName - String - không trùng lặp, không rỗng
    //totalMembers - int - tổng số nhân viên của phòng đó
    private String departmentId;
    private String departmentName;
    private int totalMembers;

    public Department()
    {
    }

    public Department(String departmentId, String departmentName, int totalMembers)
    {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.totalMembers = totalMembers;
    }

    public String getDepartmentId()
    {
        return departmentId;
    }

    public void setDepartmentId(String departmentId)
    {
        this.departmentId = departmentId;
    }

    public String getDepartmentName()
    {
        return departmentName;
    }

    public void setDepartmentName(String departmentName)
    {
        this.departmentName = departmentName;
    }

    public int getTotalMembers()
    {
        return totalMembers;
    }

    public void setTotalMembers(int totalMembers)
    {
        this.totalMembers = totalMembers;
    }

    @Override
    public String toString()
    {
        return "Department{" +
                "departmentId='" + departmentId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", totalMembers=" + totalMembers +
                '}';
    }
}
