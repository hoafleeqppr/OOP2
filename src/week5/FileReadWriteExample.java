package week5;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWriteExample {
    public String readFromFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try {
            // Tạo đối tượng FileReader để đọc dữ liệu từ file
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            // Đọc từng dòng dữ liệu từ file và thêm vào StringBuilder
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append("\n");
            }

            // Đóng FileReader và BufferedReader
            bufferedReader.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Trả về chuỗi chứa dữ liệu đã đọc được
        return content.toString();
    }
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
    public static void main(String[] args) {
        FileReadWriteExample example = new FileReadWriteExample();
        Scanner scanner = new Scanner(System.in);

        // Nhập đường dẫn file từ bàn phím
        System.out.println("Nhập đường dẫn file: ");
        String filePath = scanner.nextLine();

        // Nhập dữ liệu để ghi vào file từ bàn phím
        System.out.println("Nhập dữ liệu để ghi vào file (nhấn Enter để kết thúc): ");
        StringBuilder dataToWrite = new StringBuilder();
        String line;
        while (!(line = scanner.nextLine()).isEmpty()) {
            dataToWrite.append(line).append("\n");
        }

        // Ghi dữ liệu vào file
        boolean isWritten = example.writeToFile(filePath, dataToWrite.toString());
        if (isWritten) {
            System.out.println("Dữ liệu đã được ghi vào file thành công!");
        } else {
            System.out.println("Ghi dữ liệu thất bại.");
        }

        // Đọc dữ liệu từ file
        String fileContent = example.readFromFile(filePath);
        System.out.println("Dữ liệu đọc được từ file:");
        System.out.println(fileContent);

        scanner.close();
    }


}
