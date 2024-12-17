import java.util.Optional;

public class GetTaskForOptionalInstance {
    public static void main(String[] args){
        Optional<String> johnny = Optional.of("Mnemonic");
        String lastname;
// Get method
        /*The regular get() method returns the value of the Optional or
        throws an exception if the Optional is empty.*/
        lastname = johnny.get();
// orElse method
        /*The orElse() method returns the value of the Optional. If the Optional is empty,
        it returns the default value.*/
        lastname = johnny.orElse("Silverhand");
// orElseGet method
        /*The method orElseGet() accepts the Supplier of the default value.
        The method returns the value of the Optional if it is available.
        If the Optional is empty, it calls the Supplier and returns its result.
        This method is preferable to orElse() if you would like to avoid
        constructing the default value when it is not necessary.*/
        lastname = johnny.orElseGet(() -> "Silverhand");
// orElseThrow method
        /*The orElseThrow() method works like get() but uses the
        given Supplier to create an exception to throw.*/
        lastname = johnny.orElseThrow(() -> new IllegalStateException());
    }
}
