package week6.ThucHanh1;

import java.io.*;
import java.util.Scanner;

public class FileStreamExample {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        FileInputStream fis = null;

        try {
            // Bước 3: Tạo đối tượng FileOutputStream để ghi dữ liệu vào file person.dat
            fos = new FileOutputStream("person.dat");

            // Bước 4: Nhập vào một chuỗi bất kỳ
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập một chuỗi bất kỳ: ");
            String data = scanner.nextLine();

            // Bước 5: Ghi chuỗi nhập trên vào file
            fos.write(data.getBytes());

            // Bước 6: Mở file person.dat kiểm tra dữ liệu trong file (thực hiện thủ công)

            // Bước 7: Tạo đối tượng FileInputStream để đọc dữ liệu từ file person.dat
            fis = new FileInputStream("person.dat");

            // Bước 8: Đọc dữ liệu sử dụng phương thức read()
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }

            // Bước 9: Đóng đối tượng FileInputStream/ FileOutputStream sau khi thực hiện đọc dữ liệu xong
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}