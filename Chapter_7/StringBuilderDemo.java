public class StringBuilderDemo {
    public static void main(String[] args) {
        
        // Create first StringBuilder
        StringBuilder nameString = new StringBuilder("Barbara");
        System.out.println("(StringBuilder 1) nameString: " + nameString);
        System.out.println("Capacity of nameString is: " + nameString.capacity());

        // Create second StringBuilder
        StringBuilder addressString = new StringBuilder("6311 Hickory Nut Grove Road");
        System.out.println("(StringBuilder 2) addressString: " + addressString);
        System.out.println("Capacity of addressString is: " + addressString.capacity());
        
        // Set lengths for both
        nameString.setLength(20);
        addressString.setLength(20);

        System.out.println("(Lenght set to 20 for StringBuilder 1) The name is " 
                            + nameString + "end");

        System.out.println("(Lenght set to 20 for StringBuilder 2) The address is " 
                            + addressString);
    }
}
