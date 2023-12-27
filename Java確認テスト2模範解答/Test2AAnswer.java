package Java確認テスト2模範解答;

class Test2AAnswer {
    public static void main(String[] args) {
        // Q1
        int score = 2;
        switch (score) {
            case 3:
                System.out.println("優秀");
                break;
            case 2:
                System.out.println("良い");
                break;
            case 1:
                System.out.println("可");
                break;
            default:
                System.out.println("不可");
                break;
        }

        // Q2
        int count = 0;
        for (int i = 56; i < 250; i++) {
            if (i % 4 == 0 && i % 7 == 0) {
                count++;
            }
        }
        System.out.println(count + "個");

        // Q3
        int count2 = 0;
        for (int i = 499; i > 0; i--) {
            if (i % 2 == 0 || i % 3 == 0) {
                count2++;
                if (count2 == 13) {
                    System.out.println(i);
                    break;
                }
            }
        }

        // Q4
        String[][][] students = {
                {
                        { "山田太郎" },
                        { "佐藤一郎", "木村恵子", "田中健一" }
                },
                {
                        { "鈴木花子", "渡辺美咲", "小林誠", "伊藤紗英" },
                        { "高橋直樹", "中村裕美" }
                }
        };
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                for (int k = 0; k < students[i][j].length; k++) {
                    System.out.print(students[i][j][k] + ", ");
                }
            }
            System.out.println();
        }

        // Q5
        int width = 11;
        int hight = 5;
        int count_q5 = 0;
        for (int i = 1; i <= hight; i++) {
            for (int j = 1; j <= width; j++) {
                if (count_q5 % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(0);
                }
                count_q5++;
            }
            System.out.println();
        }

        // Q6
        int hight_q6 = 5;
        int width_q6 = 7;
        int h_center = (hight_q6 + 1) / 2;
        int w_center = (width_q6 + 1) / 2;
        int start = w_center, end = w_center;

        for (int i = 1; i <= hight_q6; i++) {
            for (int j = 1; j <= width_q6; j++) {
                if (j < start || j > end) {
                    System.out.print(0);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if (i < h_center) {
                start --;
                end ++;
            }else{
                start ++;
                end --;
            }
        }
    }
}
