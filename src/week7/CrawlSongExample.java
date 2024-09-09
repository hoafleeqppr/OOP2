package week7;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {

    public static void main(String[] args) {
        try {
// Đối tượng URL được tạo ra để kết nối đến địa chỉ trang web chứa danh sách các bài hát.
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            // mở stream và đưa nó vào BufferedReader
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z"); // Đọc toàn bộ nội dung trang web thành một chuỗi duy nhất.
            //Lấy toàn bộ nội dung của trang dưới dạng một chuỗi,lưu toàn bộ nội dung trang web vào biến content.

            String content = scanner.next();
            // đóng scanner
            scanner.close();
            // xóa tất cả các dòng trống
            content = content.replaceAll("\\n+", "");
            // regex: tìm kiếm các tên bài hát
            Pattern p = Pattern.compile("name_song\">(.*?)</a>");

            //Pattern.compile("name_song\">(.*?)</a>"): Đây là biểu thức chính quy dùng để tìm kiếm tên bài hát.
//name_song">: Tìm chuỗi bắt đầu bằng name_song">.
//(.*?): Tìm bất kỳ ký tự nào nằm giữa cặp name_song"> và </a>.
// Dấu *? cho phép tìm các ký tự bất kỳ với số lượng nhỏ nhất có thể.
//</a>: Tìm chuỗi kết thúc bằng </a>, dấu kết thúc của thẻ liên kết HTML.

            Matcher m = p.matcher(content);//Tạo đối tượng Matcher để so khớp nội dung trang web với biểu thức chính quy.
            while (m.find()) {
                System.out.println(m.group(1)); // in ra tên bài hát
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
