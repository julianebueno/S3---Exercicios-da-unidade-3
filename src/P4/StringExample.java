package P4; //---------------------------------------------------------------- FIGURA 13

public class StringExample {
    public static void main(String[] args) {
        String txt;
        
        txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Comprimeto de [" + txt + "] = " + txt.length());
        
        txt = "Olá Mundo!";
        System.out.println(txt.toUpperCase());   // Saída = "OLÁ MUNDO!"
        System.out.println(txt.toLowerCase());   // Saída = "olá mundo"
        
        txt = "Localize a posição da palavra 'eureka' neste texto!";
        System.out.println(txt.indexOf("eureka")); // Saída = 31
        //The indexOf() method returns the position of the first 
        //occurrence of specified character(s) in a string.
    }
}
    