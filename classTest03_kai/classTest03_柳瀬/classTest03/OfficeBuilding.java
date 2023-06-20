/*
 * Buildingクラスを継承して下記の通り実装をする
 * 1. フィールドには入っているテナントの数を表す int型のnumOfficesを追加
 * 2. コンストラクタや、他のメンバメソッドをMainクラスの実装を元に定義
 */
public class OfficeBuilding {
    int numOffice;

    public int numOffice(){
        return this.numOffice;
    }

    public void setnumOffice(){
        this.numOffice = numOffice;
}}