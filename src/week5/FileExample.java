package week5;

import java.io.File;
import java.io.IOException;

public class FileExample {

    public void createAndCheckFile(String filePath) {
        try {
            // Tạo đối tượng File với đường dẫn file đã cho
            File file = new File(filePath);

            // Kiểm tra xem file có tồn tại không
            if (file.exists()) {
                System.out.println("File đã tồn tại.");
            } else {
                // Tạo file mới nếu file chưa tồn tại
                boolean isCreated = file.createNewFile();
                if (isCreated) {
                    System.out.println("File mới đã được tạo.");
                } else {
                    System.out.println("Không thể tạo file.");
                }
            }

            // Kiểm tra xem file có phải là thư mục hay không
            if (file.isDirectory()) {
                System.out.println("Đây là một thư mục.");
            } else {
                System.out.println("Đây không phải là một thư mục.");
            }

            // Hiển thị đường dẫn của file
            System.out.println("Đường dẫn của file: " + file.getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FileExample example = new FileExample();

        // Đường dẫn file mong muốn
        String filePath = "C:\\Users\\HELLO\\Desktop\\Codegym\\OOP2\\src\\week5\\filePath.txt";

        // Thực hiện các thao tác với file
        example.createAndCheckFile(filePath);
    }
}
