public class ExSeqEscape {
        
    public static void main(String[] args) {
        
        // Task 1: Add a tab between "Hello" & "World!"
        String myString1 = "Hello World!";
        System.out.println("Add tab:");
        System.out.println(myString1.replace(" ", "\t"));  // Output should be: Hello    World!

        // Task 2: Change myString2 to "Hello" 'World!'
        String myString2 = "Hello World!";
        System.out.println("Add quotes:");
        System.out.println("\"Hello\" 'World!'");  // Output should be: "Hello" 'World!'

        // Task 3: Change myString3 to be on separate lines:
        // Hello 
        // World!
        String myString3 = "Hello World!";
        System.out.println("Add New Line:");
        System.out.println(myString3.replace(" ", "\n"));  // Output should be:
        // Hello
        // World!

        // Task 4: Add a backslash (\) between Hello & World:
        String myString4 = "Hello World";
        System.out.println("Include backslash:");
        System.out.println(myString4.replace(" ", " \\"));  // Output should be: Hello \World
        
    }

}
