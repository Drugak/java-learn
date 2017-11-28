public class FirstSample 
{
    public static void main(String[] arg)
    {
	String text = "Jecan maman ";
	int[] codePoints = text.codePoints().toArray();
        System.out.println(codePoints);
    }
}
