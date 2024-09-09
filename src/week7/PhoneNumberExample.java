package week7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    // Biểu thức chính quy cho số điện thoại
    private static final String PHONE_NUMBER_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

//    ^: Đánh dấu bắt đầu chuỗi.
//\\(: Ký tự mở ngoặc đơn.
//\\d{2}: Hai chữ số.
//\\): Ký tự đóng ngoặc đơn.
//-: Dấu gạch ngang.
//\\(0: Ký tự mở ngoặc đơn, theo sau là số 0.
//\\d{9}: Chín chữ số.
//\\): Ký tự đóng ngoặc đơn.
//$: Đánh dấu kết thúc chuỗi.

    public PhoneNumberExample() {
    }

    // Phương thức kiểm tra tính hợp lệ của số điện thoại
    public boolean validate(String phoneNumber) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {
        PhoneNumberExample phoneNumberExample = new PhoneNumberExample();

        // Số điện thoại hợp lệ
        String[] validPhoneNumbers = {"(84)-(0978489648)", "(84)-(0912345678)"};

        // Số điện thoại không hợp lệ
        String[] invalidPhoneNumbers = {"(a8)-(2222222222)", "(84)-(22b2222222)", "(84)-(9978489648)", "(84)-(0123456)"};

        // Kiểm tra các số điện thoại hợp lệ
        for (String phoneNumber : validPhoneNumbers) {
            boolean isValid = phoneNumberExample.validate(phoneNumber);
            System.out.println("Phone number " + phoneNumber + " is valid: " + isValid);
        }

        // Kiểm tra các số điện thoại không hợp lệ
        for (String phoneNumber : invalidPhoneNumbers) {
            boolean isValid = phoneNumberExample.validate(phoneNumber);
            System.out.println("Phone number " + phoneNumber + " is valid: " + isValid);
        }
    }
}
