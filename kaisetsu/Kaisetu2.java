public class Kaisetu2 {
    public static void main(String[] args) {
        System.out.println(SampleA.methodA());
    }
}

class SampleA{

    public static int methodA(){
        
        int numB = SampleB.methodB(); // 1
        return numB;
    }

}

class SampleB{

    public static int methodB(){
        return 1;
    }
}