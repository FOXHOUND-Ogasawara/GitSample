class Animal{
   //問１
   private String name ;
   private int age;

    //コンストラクタ
   public Animal(String name,int age){
       this.name = name;
       this.age = age;

   }
   //メソッド
   public void showProperties() {
       System.out.println("名前: " + this.name);
       System.out.println("年齢: " + this.age);
   }
}