import java.util.*
public class loops1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int i;
        for(i=1;i<=10;i)
        {
		System.out.println(i + " x "+N+" = "+(N*i));
        }
        
        bufferedReader.close();
    }
}
