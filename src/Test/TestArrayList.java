package Test;

import Main.ArrayListStaff;

import java.util.Arrays;
import java.util.Scanner;

public class TestArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayListStaff arrayListStaff = new ArrayListStaff();
        int Option = 0;
        do {
            System.out.println("MENU----------");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println(
                         "1.\tThêm nhân viên vào danh sách.\n"
                         +"2.\tIn ra danh sách nhân viên ra màn hình\n"
                         +"3.\tKiểm tra danh sách có rỗng hay không.\n"
                         +"4.\tLấy ra số lượng nhân viên trong danh sách.\n"
                         +"5.\tLàm rỗng danh sách nhân viên.\n"
                         +"6.\tXoá một nhân viên ra khỏi danh sách dựa trên mã nhân viên.\n"
                         +"7.\tKiểm tra nhân viên có tồn tại trong danh sách hay không, dựa trên mã nhân viên.\n"
                         +"8.\tTìm kiếm một nhân viên dựa trên tên được nhập từ bàn phím.\n"
                         +"9.\tXuất ra danh sách nhân có mức lương từ cao xuống thấp.\n"
                         +"0.Thoát khỏi chương trình." );
            Option = scanner.nextInt();
            if(Option==1){

            }else if(Option==2){
                System.out.println("Nhân viên cần in ra màn hình là: ");
            }else if(Option==3){
                System.out.println("Danh sách nhân viên ");
            }
        }while();
    }
}
