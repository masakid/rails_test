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
public class SwichSample {
    public static void main(String[] args){
        //testSwitch("hoge");
        //State state = State.HOGE;
        //testEnumSwitch(state);
        
        System.out.println(Route.ROUTE1.getValue());
        System.out.println(Route.ROUTE2.getValue());
        System.out.println(Route.ROUTE3.getValue());
        
    }
    
    public static void testSwitch(String str){
        switch(str){
            case "hoge":
                System.out.println("hoge World");
                break;
            case "foo":
                System.out.println("foo World");
                break;
            case "bar":
                System.out.println("bar World");
                break;
            default:
                System.out.println("default world");
                break;
        }    
    }
    
    public static void testEnumSwitch(State stt){
        switch(stt){
            case HOGE:
                System.out.println("enum hoge World");
                break;
            case FOO:
                System.out.println("enum foo World");
                break;
            case BAR:
                System.out.println("enum bar World");
                break;
            default:
                System.out.println("enum default world");
                break;
        }
        
        
    }
    
    
}
