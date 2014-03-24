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
public class tokumeiJava {
    
    public static void showHunterHunter( String comicName){
        System.out.println(comicName.toString());
    }
    
    interface Ii {
        void print();
    }
    
    class Ic implements Ii {
        String value;
        Ic(String v) {
            value = v;
        }
        public void print(){
            System.out.println("Ic1:" + value);
        }
    }
    
    public void execute (){
        
        Ii[] objs = new Ii[5];
        objs[0] = new Ic("objs[0]");
        objs[1] = new Ic("objs[1]"){
            public void println(){
                System.out.println("無名内部クラス　objs[1]:" + value);
            }
        };
        
    }
    /*
    public static void main( String args[]){
        showProfile(
            new Object(){
                public String toString(){
                    String myProfile = "私は21歳の匿名、独身です．";
                    return myProfile;
                }
            }
        );
    }*/
    /*
    public static void main(String args[]){
        showProfile(
                new Tokumei()
        );
    }*/
    

    
    
}
/*
    class Tokumei extends Object{
        public String toString(){
            String myProfile = "私は匿名の21歳、独身です";
            return myProfile;
        }
    }
*/