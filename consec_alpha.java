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
        int i; int j; int L; int c; int fn = 0;
        String st; String w = "";
        char ch; char che;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string: ");
        st = in.nextLine();
        L = st.length();
        for (i = L;i < L;i++){
            ch = st.charAt(i);c = 0;w  = "";
            if (ch != ' ')
            {
                w += ch;
                c++;
            }
            else
            {
                for (j = 0;j < c-1;j++)
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
