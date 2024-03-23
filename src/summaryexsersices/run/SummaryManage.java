package summaryexsersices.run;

import com.sun.tools.javac.Main;
import summaryexsersices.summary.config.InputMethods;
import summaryexsersices.summary.emplement.ManageDepart;
import summaryexsersices.summary.emplement.ManageEm;
import summaryexsersices.summary.entity.Department;
import summaryexsersices.summary.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class SummaryManage

{
    public static List<Department> departmentList = new ArrayList<>();
    public static List <Employee> employeeList = new ArrayList<>();
    static {
     }
    //Xây dựng khung chức năng sau :
    public static void main(String[] args)
    {
        int choice;
        do {
            System.out.println("**********************MENU ************************");
            System.out.println("1. QUẢN LÝ PHÒNG BAN");
            System.out.println("2. QUẢN LÝ NHÂN VIÊN");
            System.out.println("0. Thoát");
            choice = InputMethods.getInteger();
            switch (choice) {
                case 1:
                    SummaryManage.menuDepartment();
                    break;
                case 2:
                    SummaryManage.menuEmployee();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (true);
    }

    public static void menuDepartment(){
        ManageDepart newDe = new ManageDepart();
        int choice;
        do {
            //Quản trị phòng ban :
            //Hiển thị danh sách phòng ban
            //Thêm mới phòng ban
            //Chỉnh sửa tên phòng ban
            //Hiển thị danh sách nhân viên của phòng ban theo mã phòng
            //Xóa phòng ban (chỉ xóa khi ko có nhân viên nào)
            System.out.println("**********************QUẢN LÝ PHONG BAN************************");
            System.out.println("1. Hiển thị danh sách phòng ban ");
            System.out.println("2. Thêm mới phòng ban");
            System.out.println("3. Chỉnh sửa tên phòng ban");
            System.out.println("4. Hiển thị danh sách nhân viên của phòng ban theo mã phòng");
            System.out.println("5. Xóa phòng ban (chỉ xóa khi ko có nhân viên nào");
            System.out.println("0. Quay lai");
            choice = InputMethods.getInteger();
            switch (choice) {
                case 1:
                    newDe.display();
                    break;
                case 2:
//                    Department department = newDe.create();
//                    System.out.println(department);
                    break;
                case 3:
                    newDe.update();
                    break;
                case 4:
                    newDe.displayById();
                    break;
                case 5:
                    newDe.delete();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (true);
    }

    public static void menuEmployee(){
        int choice;
        ManageEm newEm = new ManageEm();
        do {
            //Quản trị nhân viên
            //HIển thị danh sách thông tin tất cả nhân viên(mã nhân viên và tên)
            //Xem chi tiết thông tin nhân viên theo mã nhân viên (toàn bộ thông tin)
            //Thêm mới nhân viên
            //Chỉnh sửa thông tin nhân viên
            //Xóa nhân viên
            //Thống kê số lượng nhân viên trung bình của mỗi phòng
            //Tìm ra 5 phòng có số lượng nhân viên đông nhất
            //Tìm ra người quản lý nhiều  nhân viên nhất
            //Tìm ra 5 nhân viên có tuổi cao nhất công ty
            //Tìm ra 5 nhân viên hưởng lương cao nhất

            System.out.println("**********************QUẢN TRI NHAN VIEN************************");
            System.out.println("1. HIển thị danh sách thông tin tất cả nhân viên(mã nhân viên và tên)");
            System.out.println("2. Xem chi tiết thông tin nhân viên theo mã nhân viên (toàn bộ thông tin)");
            System.out.println("3. Thêm mới nhân viên");
            System.out.println("4. Chỉnh sửa thông tin nhân viên");
            System.out.println("5. Xóa nhân viên");
            System.out.println("6. Thống kê số lượng nhân viên trung bình của mỗi phòng");
            System.out.println("7. Tìm ra 5 phòng có số lượng nhân viên đông nhất");
            System.out.println("8. Tìm ra người quản lý nhiều  nhân viên nhất");
            System.out.println("9. Tìm ra 5 nhân viên có tuổi cao nhất công ty");
            System.out.println("10. Tìm ra 5 nhân viên hưởng lương cao nhất ");
            System.out.println("0. Quay lai");
            choice = InputMethods.getInteger();
            switch (choice) {
                case 1:
                    newEm.display();
                    break;
                case 2:
                    newEm.displayById();
                    break;
                case 3:
                    newEm.create();
                    break;
                case 4:
                    newEm.update();
                    break;
                case 5:
                    newEm.delete();
                    break;
                case 6:
                    newEm.salaryAverage();
                    break;
                case 7:
                    newEm.manMaxEmployee();
                    break;
                case 8:
                    newEm.maxfiveEmApart();
                    break;
                case 9:
                    newEm.maxFiveAge();
                    break;
                case 10:
                    newEm.maxFiveSalary();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (true);
    }
}
