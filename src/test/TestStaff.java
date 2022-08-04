package test;

import main.ListOfEmployee;
import main.Staff;

import java.io.File;
import java.util.Scanner;

public class TestStaff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListOfEmployee listOfEmployee = new ListOfEmployee();
        int Option = 0;
        do {
            System.out.println("-----MENU----");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println(
                            "1.\tThêm nhân viên vào danh sách.\n" +
                            "2.\tIn ra danh sách nhân viên ra màn hình\n" +
                            "3.\tKiểm tra danh sách có rỗng hay không.\n" +
                            "4.\tLấy ra số lượng nhân viên trong danh sách.\n" +
                            "5.\tLàm rỗng danh sách nhân viên.\n" +
                            "6.\tXoá một nhân viên ra khỏi danh sách dựa trên mã nhân viên.\n" +
                            "7.\tKiểm tra nhân viên có tồn tại trong danh sách hay không, dựa trên mã nhân viên.\n" +
                            "8.\tTìm kiếm một nhân viên dựa trên tên được nhập từ bàn phím.\n" +
                            "9.\tXuất ra danh sách nhân có mức lương từ cao xuống thấp.\n"+
                            "10.Thoát khỏi chương trình" );
            Option = scanner.nextInt();
            scanner.nextLine();
            // Thêm nhân viên vào danh sách
            switch (Option){
                case 1:
                    System.out.println("Nhập vào id: ");
                    scanner.nextLine();
                    System.out.println("Nhập vào tên: ");
                    scanner.nextLine();
                    System.out.println("Nhập vào tuổi: ");
                    scanner.nextLine();
                    System.out.println("Nhập vào giới tính: ");
                    scanner.nextLine();
                    System.out.println("Nhập vào số điện thoại ");
                    scanner.nextLine();
                    System.out.println("Nhập vào email: ");
                    scanner.nextLine();
                    System.out.println("Nhập vào trạng thái làm việc: ");
                    scanner.nextLine();
                    System.out.println("Nhập vào số tiền lương: ");
                    scanner.nextLine();
                    System.out.println("Nhập vào tổng số tiền lương: ");
                    scanner.nextLine();
                case 2:

            }
        }while (Option==10);
        }

    }

