package 実施済みテスト.kadai01_Ans;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int width, height;

        while (true) {
            try {
                System.out.print("長方形の幅を入力してください: ");
                width = Integer.parseInt(reader.readLine());
                break;
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
                System.out.println("数字を入力してください。");
            }
        }

        while (true) {
            try {
                System.out.print("長方形の高さを入力してください: ");
                height = Integer.parseInt(reader.readLine());
                break;
            } catch (IOException | NumberFormatException e) {
                System.out.println("数字を入力してください。");
            }
        }

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("長方形の面積: " + rectangle.getArea());
        System.out.println("長方形の周囲の長さ: " + rectangle.getPerimeter());

        int sideLength;
        while (true) {
            try {
                System.out.print("正方形の1辺の長さを入力してください: ");
                sideLength = Integer.parseInt(reader.readLine());
                break;
            } catch (IOException | NumberFormatException e) {
                System.out.println("数字を入力してください。");
            }
        }

        Square square = new Square(sideLength);
        System.out.println("正方形の面積: " + square.getArea());
        System.out.println("正方形の周囲の長さ: " + square.getPerimeter());
    }
}
