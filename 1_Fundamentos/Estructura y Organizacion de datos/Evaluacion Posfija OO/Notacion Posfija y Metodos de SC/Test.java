public class Test {
    public static void main(String args[]) {
    String s = "pre/fix/dir1/dir2/dir3/dir4/..";
    String prefix = "pre/fix";
    String[] tokens = s.substring(prefix.length()).split("/");
    for (int i=0; i<tokens.length; i++) {
    	System.out.println(tokens[i]);
    }
    }

}