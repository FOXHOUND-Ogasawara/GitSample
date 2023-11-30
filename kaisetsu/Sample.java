package kaisetsu;
class Sample {
    public static void main(String[] args) {
        int width = 5;
        int height = 5;
        int start = (width - 1) / 2;
        int end = start;
        for (int i = 0; i < height; i++) {
            System.out.print("i = " + i + ",");
            System.out.print("start:" + start + ",end:" + end + " ");
            for (int j = 0; j < width; j++) {

                if (j >= start && j <= end) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if (i < (height - 1) / 2) {
                start--;
                end++;
            } else {
                start++;
                end--;
            }
        }
    }
}
