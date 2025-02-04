public class ReverseString {

    public  static void main(String[] args) {

        String str = "Bruno Monteiro";
        System.out.println(str);

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }
}
