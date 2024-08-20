package br.senac.sp.app;

public class view {
    public static void main(String[] args) {
        //String para Int
        String s = "50";
        int n = Integer.parseInt(s);
        
        //String para float
        String s1 = "30.91";
        float n2 = Float.parseFloat(s1);
        
        double d = 51.41;
        String s3 = Double.toString(d);
        
        System.out.printf("O numero 1 e: %s", s3);
    }  
}   
