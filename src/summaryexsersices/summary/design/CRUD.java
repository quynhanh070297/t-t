package summaryexsersices.summary.design;

public interface CRUD<E>
{
    // Tao interface chung cho cả hai đối tượng EM và PART
    // Dung GENNERRIC để chuyền tham số E
  void display ();
   void create();
   void update();
   void displayById();
   void delete();
   E inputdata();


    //Xây dựng khung chức năng sau :
    //Quản trị phòng ban :
    //Hiển thị danh sách phòng ban
    //Thêm mới phòng ban
    //Chỉnh sửa tên phòng ban
    //Hiển thị danh sách nhân viên của phòng ban theo mã phòng
    //Xóa phòng ban (chỉ xóa khi ko có nhân viên nào)
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
}
