package longes_repeatable_string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


import java.util.Arrays;

public class Amazon {


    public static String lcp(String s, String t) {
        int n = Math.min(s.length(), t.length());
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != t.charAt(i))
                return s.substring(0, i);
        }
        return s.substring(0, n);
    }



    public static String lrs(String s) {


        int N  = s.length();
        String[] suffixes = new String[N];
        for (int i = 0; i < N; i++) {
            suffixes[i] = s.substring(i, N);
        }


        Arrays.sort(suffixes);


        String lrs = "";
        for (int i = 0; i < N - 1; i++) {
            String x = lcp(suffixes[i], suffixes[i+1]);
            if (x.length() > lrs.length())
                lrs = x;
        }
        return lrs;
    }



    public static void main (String[] args) {
          String line;

          		  line = "Banana";
            	  line = line.replaceAll("\\s+", " ");
            	  System.out.println(line);
            	  line = lrs(line);
            	  System.out.println(line);
            	  if (line.trim().equals("")) System.out.println("NONE");
            	  else System.out.println(line);
              
         
          
          
  }  
}

