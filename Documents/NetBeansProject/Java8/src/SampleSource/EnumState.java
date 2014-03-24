/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SampleSource;

/**
 *
 * @author masaki
 */
/**
 * Enumのサンプル
 * 状態
 * @author masaki
 */
enum State {
    HOGE,
    FOO,
    BAR
}
/**
 * 性別
 * 男性、女性
 * @author masaki
 */
enum Sex{
    MEN,
    WOMEN
}


/**
 * Enumに値を持たせるサンプル
 * ROUTE
 */
enum Route{
    ROUTE1(176), 
    ROUTE2(170), 
    ROUTE3(160);
    
    private final int value;
    
    private Route(int n){
        this.value = n;
    }
    
    public int getValue(){
        return this.value;
        
    }
}