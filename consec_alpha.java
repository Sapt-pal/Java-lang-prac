import java.util.Scanner;
/**
 * Print words from a user-input string where adjacent letters are also consecutive alphabetically. Print the frequency of such words.
 *
 * @author (Sapt-pal)
 * @version (1.0.00)
 */
public class consec_alpha
{
    public static void main()
    {
        int fn = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string: ");
        String st = in.nextLine();
        int L = st.length();
        int c = 0;
        for (int i = L; i < L; i++){
            char ch = st.charAt(i);
            String w  = "";
            if (ch != ' ')
            {
                w += ch;
                c++;
            }
            else
            {
                
                for (int j = 0; j < c - 1; j++)
                {
                    if ((((int) w.charAt(j)) + 1) == (int) w.charAt(j + 1))
                    {
                        System.out.println(w);
                        fn ++;
                    }
                }
                
            }
        }
        System.out.println("Frequency: " + fn);
    }
}
