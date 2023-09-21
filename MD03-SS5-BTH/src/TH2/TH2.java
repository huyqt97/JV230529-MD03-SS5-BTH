package TH2;

public class TH2 {
    private static CheckUser checkUser;

    public static void main(String[] args) {

        String[] user = {"123abc_", "_abc123", "______", "123456", "abcdefgh", ".@", "12345", "1234_", "abcde"};
        for (String s : user) {
            boolean check = checkUser.checkUsers(s);
            System.out.println("Account is " + s +" is valid: "+ check);
        }
    }
}
