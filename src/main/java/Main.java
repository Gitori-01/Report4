public class Main {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        }catch (NullPointerException nuru){
            System.out.println("\u001b[00;31m" + "Exception in thread \"main\" java.lang.虚無虚無プリン" + "\u001b[00m");
            System.out.println(nuru.getMessage());
        }

    }
}
