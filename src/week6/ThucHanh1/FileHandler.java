package week6.ThucHanh1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandler {
    public boolean writeData(String data, String fileName) throws IOException {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(fileName); // Tạo đối tượng FileOutputStream với tên file
            fos.write(data.getBytes()); // Ghi dữ liệu vào file, chuyển chuỗi thành mảng byte
            return true; // Trả về true nếu ghi dữ liệu thành công
        } catch (IOException e) {
            throw e; // Ném ngoại lệ IOException nếu có lỗi xảy ra
        } finally {
            if (fos != null) {
                try {
                    fos.close(); // Đóng FileOutputStream
                } catch (IOException e) {
                    e.printStackTrace(); // Xử lý lỗi khi đóng FileOutputStream
                }
            }
        }
    }

    public String readData(String fileName) throws IOException {
        FileInputStream fis = null;
        StringBuilder resultData = new StringBuilder();

        try {
            fis = new FileInputStream(fileName); // Tạo đối tượng FileInputStream với tên file
            int i;
            while ((i = fis.read()) != -1) {
                resultData.append((char) i); // Đọc dữ liệu từ file và lưu vào StringBuilder
            }
            return resultData.toString(); // Trả về dữ liệu dưới dạng chuỗi
        } catch (IOException e) {
            throw e; // Ném ngoại lệ IOException nếu có lỗi xảy ra
        } finally {
            if (fis != null) {
                try {
                    fis.close(); // Đóng FileInputStream
                } catch (IOException e) {
                    e.printStackTrace(); // Xử lý lỗi khi đóng FileInputStream
                }
            }
        }
    }


    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi dữ liệu cần ghi vào file: ");
        String data = scanner.nextLine();

        String fileName = "data.dat"; // Tên file đã có sẵn

        System.out.println("Nhập tên file cần đọc: ");
//        String fileName = scanner.nextLine();


        try {
            boolean result = fileHandler.writeData(data, fileName);
            if (result) {
                System.out.println("Ghi dữ liệu thành công vào file " + fileName);
            } else {
                System.out.println("Ghi dữ liệu thất bại.");
            }
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi ghi dữ liệu: " + e.getMessage());
        }

        try {
            String resultData = fileHandler.readData(fileName);
            System.out.println("Dữ liệu trong file " + fileName + " là:");
            System.out.println(resultData);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc dữ liệu: " + e.getMessage());
        }
    }
}
