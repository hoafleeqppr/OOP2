package week7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern; //đối tượng Pattern để chứa biểu thức chính quy.
    private Matcher matcher; //đối tượng Matcher để so sánh email với biểu thức chính quy.

    private static final String EMAIL_REGEX =   "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
//EMAIL_REGEX là một chuỗi biểu thức chính quy được dùng để định nghĩa mẫu email hợp lệ:
//^[A-Za-z0-9]+: Email phải bắt đầu bằng ít nhất một ký tự chữ cái (viết hoa, viết thường) hoặc số.
//[A-Za-z0-9]*: Sau ký tự đầu tiên, có thể có thêm nhiều ký tự chữ cái hoặc số.
//@: Phải có ký tự @ ngăn cách giữa phần tên email và phần domain.
//[A-Za-z0-9]+: Sau dấu @, domain phải chứa ít nhất một ký tự chữ hoặc số.
//(\\.[A-Za-z0-9]+): Domain phải có ít nhất một phần mở rộng, ví dụ .com hoặc .vn.

    public EmailExample() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    // Phương thức kiểm tra tính hợp lệ của email
    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

//    Hai mảng validEmail và invalidEmail chứa các email mẫu để kiểm tra.
//validEmail: Các email hợp lệ.
//invalidEmail: Các email không hợp lệ do không tuân theo quy tắc.

    private static EmailExample emailExample;
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String args[]) {
        emailExample = new EmailExample();
        for (String email : validEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
    }

}
