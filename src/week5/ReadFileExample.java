package week5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {

    public void readFileText(String filePath) {
        try {
            // Đọc file theo đường dẫn
            File file = new File(filePath);
            // Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ.
            if (!file.exists()) {
                throw new FileNotFoundException();
            }


            // Đọc từng dòng của file và tiến hành cộng tổng lại
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

            // Hiển thị ra màn hình tổng các số nguyên trong file
            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            // TH file không tồn tại hoặc nội dung file có lỗi thì sẽ hiển thị thông báo lỗi.
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }


//            while ((line = br.readLine()) != null) {
//                try {
//                    sum += Integer.parseInt(line);
//                } catch (NumberFormatException e) {
//                    // Nếu gặp giá trị không phải là số, thông báo lỗi và tiếp tục.
//                    System.err.println("Dòng chứa giá trị không phải là số: " + line);
//                }
//            }
//            br.close();
//
//            // Hiển thị ra màn hình tổng các số nguyên trong file
//            System.out.println("Tổng = " + sum);
//        } catch (FileNotFoundException e) {
//            System.err.println("File không tồn tại!");
//        } catch (IOException e) {
//            System.err.println("Lỗi khi đọc file: " + e.getMessage());
//        }
    }

    public static class Main {
        public static void main(String[] args) {
            System.out.println("Nhập đường dẫn file: ");
            Scanner scanner = new Scanner(System.in);
            String path = scanner.nextLine();

            ReadFileExample readfileEx = new ReadFileExample();
            readfileEx.readFileText(path);
        }
    }

}