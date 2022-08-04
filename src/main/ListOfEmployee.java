package main;
import java.util.ArrayList;
public class ListOfEmployee {

    private ArrayList<Staff> arrayList;
    private int Staff;

    public ListOfEmployee(){
        this.arrayList = new ArrayList<Staff>();
    }
    public ListOfEmployee(ArrayList<Staff>arrayList){
        this.arrayList = arrayList;
    }
    // Thêm nhân viên vào danh sách
    public void addStaff(Staff St){
        this.arrayList.add(St);
    }
    //In danh sách nhân viên ra màn hình
    public void printEmployeeList(){
        for (Staff staff : arrayList){

            System.out.println(Staff);
              }
    }
    // Kiểm tra danh sách có rỗng hay không
    public boolean checkEmptyList(){
         return this.arrayList.isEmpty();
    }
        // Lấy ra số lượng nhân viên có trong danh sách
        public  int takeTheQuantity(){
        return this.arrayList.size();
    }
    // Làm rỗng danh sách nhân viên
    public void emptyTheList(){
        this.arrayList.removeAll(arrayList);
    }
}