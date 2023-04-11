//Listを利用準備
import java.util.ArrayList;
import java.util.List;

class Zoo{
    //フィールド
    private static List<Object> animals = new ArrayList<Object>();

    //animalsListの中身を作る
    public static void setAnimals() {
        //animals フィールドの最後に引数のanimal を追加する。
        animals.add(new Animal("パンダ",12));
        animals.add(new SeaAnimal("ジンベエザメ",22,3));
    }

    //animals フィールドを繰り返し表示する。
    public static void showAnimals() {
        setAnimals();//中身を作る

        //出力
        animals.forEach((e) -> {
            //if文でObject型を確認する
            if(e.getClass() == Animal.class){
                //確認際に、Object型を適当にキャストして、一時的保存する。
                Animal animal_tmp = (Animal)e;
                animal_tmp.showProperties();//中身を見せるメゾットを起動
            }else if(e.getClass() == SeaAnimal.class){
                SeaAnimal seaAnimal_tmp = (SeaAnimal)e;
                seaAnimal_tmp.showProperties();
            } 
            System.out.println();//出力を読みやすいするため白行
        });  
        
    }
}