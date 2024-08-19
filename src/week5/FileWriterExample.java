package week5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterExample {

    public boolean writeToFile(String filePath, String data) {
        try {
            // Tạo đối tượng FileWriter để ghi dữ liệu vào file
            FileWriter writer = new FileWriter(filePath);
            // Ghi dữ liệu vào file
            writer.write(data);
            // Đóng FileWriter
            writer.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }


    public String readFromFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try {
            // Tạo đối tượng FileReader để đọc dữ liệu từ file
            FileReader reader = new FileReader(filePath);
            // Sử dụng BufferedReader để đọc dữ liệu từ FileReader
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            // Đọc từng dòng dữ liệu từ file
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append("\n");
            }

            // Đóng BufferedReader và FileReader
            bufferedReader.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Trả về chuỗi chứa dữ liệu đã đọc
        return content.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriterExample example = new FileWriterExample();

        // Nhập đường dẫn file và dữ liệu từ người dùng
        System.out.println("Nhập đường dẫn file: ");
        String filePath = scanner.nextLine();

        System.out.println("Nhập dữ liệu bạn muốn ghi vào file: ");
        String data = scanner.nextLine();

        // Ghi dữ liệu vào file
        example.writeToFile(filePath, data);

        // Đọc dữ liệu từ file và hiển thị ra màn hình
        System.out.println("Dữ liệu trong file là:");
        example.readFromFile(filePath);
    }


}