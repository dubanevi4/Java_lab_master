import java.util.Optional;

public class FilterTaskForOptionalInstance {
    public static void main(String[] args){
        Optional<String> johnny = Optional.of("Mnemonic");
        // Filter method
        /*The filter() method accepts a Predicate. If the requirements of the
        condition are met and the original Optional is not empty, it returns
        an Optional holding the original value. Otherwise, it returns an empty Optional.*/
        johnny.filter(lastname -> lastname.length() > 5)
        // Map method
        /*The map() method accepts a Function to transform the value of the Optional.
        The result is an Optional holding a transformed value or an empty Optional if
        the original container is also empty.*/
        .map(lastname -> lastname.toLowerCase())
        // ifPresent method
        /*The ifPresent() method accepts a Consumer, which is applied to the value of
        the Optional if it is not empty.*/
        .ifPresent(lastname -> System.out.println(lastname));
    }
}



