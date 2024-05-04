import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.Year;

class Demo {

    public static boolean isLeap(String dateString) throws DateTimeParseException {
        // TODO: Delete line below and write your own solution.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dateString, formatter);
        return Year.isLeap(date.getYear());
    }


    public static void main(String[] args) {
        for (String arg : args) {
            // TODO: Delete line below and write your own solution.
            try {
                System.out.println(isLeap(arg));
            } catch (DateTimeParseException e) {
                String nonMatchingCharacter = String.valueOf(arg.charAt(e.getErrorIndex()));
                System.out.printf("%s: The illegal sequence begins with the character '%s' at index %d",
                        arg, nonMatchingCharacter, e.getErrorIndex());
            }
        }
    }
}