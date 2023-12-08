package J04022;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author HienDao
 */
class WordSet{
    private String s;

    public WordSet(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }
    
    
    
    public WordSet union(WordSet t){
        Set<String> st = new TreeSet<String>();
        String[] words = this.s.toLowerCase().split("\\s+");
        for(String i : words) st.add(i);
        Set<String> st2 = new TreeSet<String>();
        words = t.getS().toLowerCase().split("\\s+");
        for(String i : words) st2.add(i);
        Set<String> union = new TreeSet<String>(st);
        union.addAll(st2);
        String res = "";
        for(String i : union) res += i + " ";
        return new WordSet(res);
    }        
    
    public WordSet intersection(WordSet t){
        Set<String> st = new TreeSet<String>();
        String[] words = this.s.toLowerCase().split("\\s+");
        for(String i : words) st.add(i);
        Set<String> st2 = new TreeSet<String>();
        words = t.getS().toLowerCase().split("\\s+");
        for(String i : words) st2.add(i);
        Set<String> union = new TreeSet<String>(st);
        union.retainAll(st2);
        String res = "";
        for(String i : union) res += i + " ";
        return new WordSet(res);
    }
    
    @Override
    public String toString(){
        return this.s;
    }
    
}

public class J04022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
