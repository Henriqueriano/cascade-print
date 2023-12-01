import java.util.Scanner;

public class Main 
{
    public Main() 
    {
        // Atributos
        String[] alphabet_and_more = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z", " ", ".", "!", ",", "?"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com as palavras:");
        String text = sc.nextLine(); // Substituir por Scanner;
        String[] letters = text.split("");
        String result = "";

        // Logica
        for (String f_temp : letters) {
            for (String s_temp : alphabet_and_more) {
                if (f_temp.toLowerCase().equals(s_temp)) {
                    result += s_temp;
                } else { System.out.println(result + s_temp);}
        }
        System.out.println(result);
        
        // Delay
        try { Thread.sleep(150); } catch (Exception e) { System.out.println(e); }
    }
    }
    public static void main(String[] args) 
        {
            new Main();
        }
}