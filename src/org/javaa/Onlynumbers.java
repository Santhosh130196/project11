package org.javaa;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Onlynumbers {
public static void main(String[] args) {
String s ="my name is billa";
char[] ch = s.toCharArray();
Map<Character,Integer>m=new TreeMap<Character,Integer>();
for (int i = 0; i < ch.length; i++) {
	char c=ch[i];
	if (c=='a'||c=='e'||c=='o'||c=='u'||c=='i') {
		if (m.containsKey(c)) {
			Integer inet = m.get(ch[i]);
			m.put(c, inet+1);
		}else {
			m.put(c, 1);
		}
	}
}

Set<Entry<Character, Integer>> entrySet = m.entrySet();
for (Entry<Character, Integer> entry : entrySet) {
	System.out.println(entry);
}

}
}