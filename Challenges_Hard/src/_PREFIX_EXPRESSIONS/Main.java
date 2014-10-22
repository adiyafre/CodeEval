package _PREFIX_EXPRESSIONS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

	static int count = 0;
	
	public static String getString(int _n, String[] _s,String last, LinkedList _list){
		
		String _str = last;
		if (_n==0)  { 
						

			_list.add(_str);
			count++;
			return "";
		} 
		else{
			
			for (int _i=0; _i<_s.length; _i++){
				
				//System.out.println("n="+_n+" char:"+_s[_i]);
				//_str = _str+_s[_i];
				
				getString(_n-1,_s,_str+_s[_i], _list);
			}
			
			return _str;
			
		} 
		
		
	}
	
	
	public static void stringList(int _n, String _s){
		
		String first=_s;
		String newFirst="";
		
		
		for(int i=0;i<first.length();i++)
		{ 
		     if(newFirst.indexOf(first.charAt(i))==-1){
		      newFirst+=first.charAt(i);
		      
		     }
		}
		
		
		String array[] = new String[newFirst.length()];
		for (int i=0; i<newFirst.length();i++) 
			array[i]=""+newFirst.charAt(i);
			
		
		Arrays.sort(array);

		LinkedList list = new LinkedList();
		
		getString(_n,array,"", list);

		for (int i=0; i<list.size(); i++){
			if (list.size()>1){
				 if(list.size()-1!=i) System.out.print(list.get(i)+",");
				 else System.out.print(list.get(i));
				
			}
			else System.out.print(list.get(i));
			
		}
		
		
	}
	
	public static void main (String[] args) {

	    try {
	        File file = new File(args[0]);
	        BufferedReader in = new BufferedReader(new FileReader(file));
	        String line;
	        while ((line = in.readLine()) != null) {
	            String[] lineArray = line.split("\\s");
	            int i=0;
	            if (lineArray.length > 0) {
	                //System.out.println(lineArray[i]); 
	                
	                String array[] = lineArray[i].split(",");
	                int n = Integer.parseInt(array[0]);
	                String s = array[1];
	                		
	                stringList(n,s);
	                System.out.println();
	               
	            	
	            } 
	        }
	    } catch (IOException e) {
	        System.out.println("File Read Error: " + e.getMessage());
	    }    
	    
	}
}
