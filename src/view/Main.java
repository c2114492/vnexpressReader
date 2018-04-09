package view;

import controller.DanTriReader;
import controller.Reader;

import java.util.Scanner;
import controller.Reader;
import controller.VnExpressReader;

public class Main {
    public static void main(String[] args) {
        Reader reader;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please chosse website to read:");
        System.out.println("1. vnexpress.net");
        System.out.println("2. dantri.com,vn");
        System.out.println("Please center your choice");
        int websiteChoice = scanner.nextInt();
        scanner.nextLine();
        if (websiteChoice == 1){
            reader = new VnExpressReader();
        }else {
            reader = new DanTriReader();
        }
        while (true){
            System.out.println("Chào mừng bạn đến chương trình đọc báo");
            System.out.println("1. Lấy danh sách tin trang chủ");
            System.out.println("2. Lấy danh mục");
            System.out.println("3. Lấy tin theo danh mục và name");
            System.out.println("4. Lấy theo nội dung tin từ trang");
            System.out.println("5. Thoát chương trình");
            System.out.println("=======================================");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    reader.getIndexArticle();
                    break;
                case 2:
                    reader.getListCategories();
                    break;
                case 3:
                    reader.getArticleByCategory("");
                    break;
                case 4:
                    reader.getArticleDetail("");
                    break;
                case 5:
                    System.out.println("Bye Bye");
                    break;
                default:
                    System.out.println("Lựa chọn sai vui lòng chọn lại");
                    break;
            }
            if (choice == 5) {
                break;
            }
        }
    }
}
