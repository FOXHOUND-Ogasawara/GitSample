package methodTest;

public class Letter {
    public static void main(String[] args) {

        String recipientName, recipientAddress, message;
        boolean isExistFlg = false;

        recipientName = "山田太郎";
        recipientAddress = "東京都千代田区○○町XX-X";

        setRecipient(recipientName, recipientAddress);

        message = "こんにちは、お元気ですか？";

        writeMessage(message);

        System.out.println("=====");

        isExistFlg = isExist(recipientName, recipientAddress);

        displayLetter(recipientName, recipientAddress, message, isExistFlg);

    }

    private static boolean isExist(String recipientName, String recipientAddress) {
        if (recipientName.equals("山田太郎") && recipientAddress.equals("東京都千代田区○○町XX-X")) {
            return true;
        } else {
            return false;
        }

    }

    private static void writeMessage(String message) {
        System.out.println("本文の内容は以下で問題ないですか？");
        System.out.println(message);
    }

    private static void setRecipient(String recipientName, String recipientAddress) {
        System.out.println("宛先は" + recipientName + "で間違いないですか？");
        System.out.println("住所は" + recipientAddress + "で間違いないですか？");
    }

    public static void displayLetter(String recipientName, String recipientAddress, String message,
            boolean isExistFlg) {
        if (isExistFlg) {
            System.out.println("下記の内容で受理しました。");
            System.out.println("宛先: " + recipientName + " (" + recipientAddress + ")");
            System.out.println("内容: " + message);
        } else {
            System.out.println("存在しない宛先のため手紙を届けられませんでした。");
        }
    }
}
