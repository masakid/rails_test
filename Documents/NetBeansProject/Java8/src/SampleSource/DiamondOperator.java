/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SampleSource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author masaki
 */
public class DiamondOperator {
    public static void main(String[] args){
        
        List<String> list = new ArrayList<>();
        list.add("hoge");
        list.add("foo");
        list.add("bar");
        
        for(String str : list ){
            System.out.println(str);
        }
        
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "hoge");
        map.put(2, "foo");
        map.put(3, "bar");
        
        for(Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + "&" + entry.getValue());
            
        }
        
        
    }
}
