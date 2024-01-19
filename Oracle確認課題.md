# Oracle確認課題
Oracleの理解度確認をしましょう。
2つのお題があるので、それぞれに取り組んでみてください。

取り組み方のヒント
> CREATE文全体とCOMMENTの内容からテーブル同士の関係性を理解しましょう
> 用意された問題以外のシチュエーションも考えていろいろ試してみましょう



## 準備
課題回答にあたり、まず以下の手順を実施してください。

1. 接続用のユーザーについて下記の通り作成しなさい

| ユーザー | ロール | システム権限 | 割り当て要領 |
| ---- | ---- | ---- | ---- |
| ユーザー名：KAKUNIN_KADAI_USER<br>パスワード：oracle<br>デフォルト領域：USERS<br>一時領域：TEMP | CONNECT<br>RESOURCE | 全て付与 | 表領域：USERS<br>無制限にチェック<br>単位：K |

2. 手順1で作成しユーザーを利用し、以下の情報を使ってDBに接続しなさい

   ユーザー名: `KAKUNIN_KADAI_USER`

   パスワード: `oracle`

# 設定1

* `kadai1_ddl_dml.sql`を実行し、必要なテーブルとデータを作成してから着手すること

# 配布したSQL文が文字化けしていたら

* 「ツール」＞「プリファレンス」を開く
* 「Environment」内の項目「エンコード」を「UTF-8」に変更し「OK」
* SQL Developerを再起動する

### 設問

#### 1.
`COMPANY_MST`を全件表示するSELECT文を作成しなさい



#### 2.
`COMPANY_MST`と`CAR_MST`を結合し、`COMPANY_MST`の`COUNTRY`が<br>
「United States」のものの会社名、車名、国名を表示するSELECT文を作成しなさい



#### 3.
`CAR_MST`と`CAR_SPEC`を結合し、馬力の高い順に並べ、車名と馬力を表示するSELECT文を作成しなさい



#### 4.
`CAR_MST`と`CAR_COST`を結合し、車名、価格、燃費を価格の安い順に並べて表示し、<br>
また価格と燃費がNULLのものは「非公表」と表示することのできるSELECT文を作成しなさい。

NULLの場合の処理は`COALESCE()`関数を使う事で対応できる。調べて使用すること。
 >※COALESCE()だけだと「非公表」は表示できずにエラーとなるので、
TO_CHAR()という文字列化関数も一緒に使用してみましょう



#### 5.

 `CAR_MST`と`CAR_COST`を結合し、燃費の良い順に並べて、価格または燃費がNULLのレコードは非表示とし、 車名、価格を表示するSELECT文を作成しなさい

NULLかどうか判断する場合のWHERE句の書き方を調べて使用すること。



#### 6.
 `COMPANY_MST`, `CAR_MST`, `CAR_SPEC`, `CAR_COST`を結合し、会社ID、会社名、会社ごとの平均価格、平均馬力、
 `COMPANY_MST`に紐付く`CAR_MST`の数を表示し、平均価格の安い順に並べ替えなさい。

<div style="page-break-before:always"></div>

# 設定2

* `kadai2_ddl_dml.sql`を実行し、必要なテーブルとデータを作成してから着手すること



### 設問


#### 1.

`WORKERS`より、国籍毎に人数の合計を表示するSELECT文を作成しなさい



#### 2.

`WORKERS`より、`GENDER`ごとの平均年齢を表示しなさい



#### 3.

`WORKERS`より、`AGE`の大きい順に`LAST_NAME`, `FIRST_NAME`を表示するSELECT文を作成しなさい。
`AGE`が同じ場合、`COUNTRY`をabc順でさらに並べ替えること。



#### 4.

次の表示例を参考にCASE文を使用し、`WORKERS`の`LAST_NAME`, `COUNTRY`を表示しなさい

`COUNTRY`はJapanなら「 日本 」、United Statesなら「 アメリカ合州国 」、それ以外なら「 その他 」と表示し、
`LAST_NAME`のカラム名は苗字、`COUNTRY`のカラム名は国籍にすること

| 苗字     | 国籍           |
| :------- | :------------- |
| 山田     | 日本           |
| 三谷     | 日本           |
| Mark     | アメリカ合衆国 |
| Emmanuel | その他         |
| ...      | ...            |

<div style="page-break-before:always"></div>

#### 5.

次の表示例を参考に、`WORKERS`の`LAST_NAME`, `FIRST_NAME`,`JOBS`の`NAME`を表示しなさい

| LAST_NAME | FIRST_NAME | NAME   |
| :-------- | :--------- | :----- |
| 山田      | 太郎       | 会社員 |
| 三谷      | 幸喜       | 脚本家 |
| ..        | ..         | ..     |




#### 6.

 次の表示例を参考に、`WORKERS`, `JOBS`を表示しなさい。
 > ※カラム名も以下の通りにすること
 > ※性別カラムは1なら男性、2なら女性と表示させること
 > ※`JOBS`のid順に昇順でソートすること
 > ※同じ職業の`WORKERS`がいた場合はさらに`WORKERS`の`ID`の昇順で並べること

| 苗字      | 名前       | 年齢 | 性別 | 国籍          | 職業         |
| --------- | ---------- | ---- | ---- | ------------- | ------------ |
| 山田      | 太郎       | 20   | 男性 | Japan         | 会社員       |
| 三谷      | 幸喜       | 56   | 男性 | Japan         | 脚本家       |
| 山田      | 太郎       | 20   | 男性 | Japan         | IT起業家     |
| Mark      | Zuckerberg | 33   | 男性 | United States | IT起業家     |
| Emmanuel  | Macron     | 39   | 男性 | France        | 政治家       |
| Hillary   | Clinton    | 69   | 女性 | United States | 政治家       |
| Gianluigi | Buffon     | 39   | 男性 | Italiana      | サッカー選手 |
| Hillary   | Duff       | 29   | 女性 | United States | 歌手         |
