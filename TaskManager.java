import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        List<Task> tasks = new ArrayList<Task>();

        try {
            while (true) {
                System.out.println("1. タスク追加");
                System.out.println("2. タスク一覧表示");
                System.out.println("3. 終了");
                System.out.print("選択してください: ");
                int choice = Integer.parseInt(reader.readLine());

                if (choice == 1) {
                    System.out.print("タスクのタイトルを入力してください: ");
                    String title = reader.readLine();

                    System.out.print("タスクの期限（yyyy-MM-dd HH:mm）を入力してください: ");
                    String dueDateString = reader.readLine();

                    try {
                        LocalDateTime dueDate = LocalDateTime.parse(dueDateString, formatter);
                        addTask(tasks, title, dueDate);
                    } catch (DateTimeParseException e) {
                        System.out.println("日付の形式が無効です。");
                    }
                } else if (choice == 2) {
                    displayTasks(tasks);
                } else if (choice == 3) {
                    break;
                } else {
                    System.out.println("無効な選択です。");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("無効な入力です。");
        } catch (IOException e) {
            System.out.println("不正なデータです。");
        } finally {
            System.out.println("プログラムを終了します。");
        }
    }

    static void addTask(List<Task> tasks, String title, LocalDateTime dueDate) {
        Task newTask = new Task(title, dueDate);
        tasks.add(newTask);
        System.out.println("タスクが追加されました。");
        displayTasks(tasks);
    }

    static void displayTasks(List<Task> tasks) {
        System.out.println("タスク一覧:");
        for (Task task : tasks) {
            System.out.println(task.showTask());
        }
    }
}

class Task {
    private String title;
    private LocalDateTime dueDate;

    public Task(String title, LocalDateTime dueDate) {
        this.title = title;
        this.dueDate = dueDate;
    }

    public String showTask() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return "タイトル: " + title + " 期限: " + dueDate.format(formatter);
    }
}
