public class Test {
    public static void main(String[] args) {
        Rope r = new Rope("Hi rope!");
        Rope r2 = new Rope("Hi rope2!");
        Rope r3 = r.concat(r2);
        System.out.println("Concatenation");
        System.out.println("\t" + r3);
        System.out.print("charAt\n\t");
        for(int i = 0; i < r3.length(); i++) {
        	System.out.print(r3.charAt(i));
        }
        System.out.println("\nSplitting");
        for(int i = 0; i <= r3.length(); i++) {
            Pair<Rope> pair = r3.split(i);
            if (pair.one != null) {
                System.out.println("\t" + pair.one + "\t\tlen: " + pair.one.length());
            }
            if (pair.two != null) {
                System.out.println("\t" + pair.two + "\t\tlen: " + pair.two.length() + "\n");
            }
        }
        System.out.println("\nSub-sequence");
        for(int i = 0; i <= r3.length(); i++) {
            for (int j = i; j <= r3.length(); j++) {
                if (i != j) {
                    System.out.println("\t" + r3.subSequence(i,j));
                } else {
                    System.out.println("\t");
                }
            }
        }
        System.out.println("\nInsert");
        System.out.println(r2.insert(r, 3));
    }
}
