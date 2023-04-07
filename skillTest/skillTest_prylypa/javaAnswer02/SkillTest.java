class SkillTest {
    public static void main (String[] args){
        //問.01 回答の始まり-------------------------
        System.out.println("問.01 回答:");
        Animal animal = new Animal("パンダ", 12);
        animal.showProperties();
        //問.01 回答の`終わり------------------------
        System.out.println();
        //問.02 回答の始まり-------------------------
        System.out.println("問.02 回答:");
        SeaAnimal seaAnimal = new SeaAnimal("ジンベエザメ", 22, 3);
        seaAnimal.showProperties();
        //問.02 回答の`終わり------------------------
    }
}