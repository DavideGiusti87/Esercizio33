/*
Regex 02
Exercise: Regex 2

You have a string with the following value: tup tuup tuuup tuuuup
with a regular expression, change into X all repetitions of the letter u, considering at least 2 repetitions but no more than 3 repeated letters
print the result
 */
public class Main {
    public static void main(String[] args) {
        String string = "tup tuup tuuup tuuuup";
        System.out.println(string.replaceAll("[u]{2,3}","X"));
    }
}
