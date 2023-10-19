package itakura;

import java.util.Map;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class VendingMachine {
    private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

    private Map<Integer, Drink> drinks = new HashMap<Integer, Drink>();
    DepositManager depositManager = new DepositManager();
    private int select = 0;
    // コンストラクタ
    public VendingMachine() {
        this.drinks = DrinkManager.getDrinksMap();
    }
    // 制御
    public void execution() {
        while (checkAllStocks() > 0) {
            this.showDrink();
            this.selectDrink();
            this.checkDeposit();
            this.getDrink();
            this.getChange();
        }
        System.out.println("全て売り切れました");
    }
    // 商品の表示
    private void showDrink() {
        System.out.println("---------------------------");
        this.drinks.forEach((index, drink) -> {
            int stocks = this.drinks.get(index).getStocks();
            System.out.print(index + ": " + drink.getName() + "( ");
            if (stocks > 0) {
                System.out.print(this.drinks.get(index).getPrice() + " 円");
            }
            else {
                System.out.print("売切");
            }
            System.out.println(" )");
        });
        System.out.println("---------------------------");
    }
    // 数字入力
    private int inputNum() {
        while(true) {
            try {
                return Integer.parseInt(BR.readLine());
            }
            catch(NumberFormatException | IOException e) {
                return 0;
            }
        }
    }
    // 在庫確認
    private boolean checkStocks(int select) {
        int stocks = this.drinks.get(select).getStocks();
        return stocks > 0;
    }
    // 商品選択
    private void selectDrink() {
        int selectedNum = -1;

        while (true) {
            System.out.println("商品の番号を選択してください");
            selectedNum = inputNum();
            if (selectedNum < 1 || selectedNum > this.drinks.size()) {
                continue;
            }
            if (this.checkStocks(selectedNum)) {
                break;
            }
            else {
                System.out.println("売り切れです");
            }
        }
        this.select = selectedNum;
    }

    // 入金額チェック
    private void checkDeposit() {
        this.deposit();
        int price = this.drinks.get(this.select).getPrice();
        while (depositManager.getDeposit() < price) {
            System.out.println("入金額が足りません 現在の投入金額 " + depositManager.getDeposit() + " 円");
            this.deposit();
        }
    }
    // 入金
    private void deposit() {
        int input = -1;
        while (input <= 0) {
            System.out.println("お金を入れてください");
            input = this.inputNum();
        }
        depositManager.setDeposit(input);
    }

    // 商品を出す
    private void getDrink() {
        int stocks = this.drinks.get(this.select).getStocks();
        this.drinks.get(this.select).setStocks(--stocks);
        System.out.println(this.drinks.get(this.select).getName() + " を購入しました");
    }
    // 購入 お釣り
    private void getChange() {
        int price = this.drinks.get(this.select).getPrice();
        int change = depositManager.getDeposit() - price;
        if (change > 0) {
            System.out.println(this.depositManager.getReturn(change) + " 円のお返しです");
        }
    }
    // 全在庫確認
    private int checkAllStocks() {
        int allStocks = 0;
        for (int i = 1; i <= this.drinks.size(); i++) {
            allStocks += this.drinks.get(i).getStocks();
        }
        return allStocks;
    }
}
