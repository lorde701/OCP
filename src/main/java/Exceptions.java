import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.MissingResourceException;

public class Exceptions {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("dolphinsBorn.txt");
            String text = new String(Files.readAllBytes(path));
            LocalDate date = LocalDate.parse(text);
            System.out.println(date);
        } catch (DateTimeParseException e) {
            System.out.println("DateTimeParseException");
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        try {

        } catch (RuntimeException e) {

        }
    }

    public void doesNotCompile() { // METHOD DOES NOT COMPILE
         try {
            mightThrow();
            } catch (FileNotFoundException | IllegalStateException e) {
            } catch (InputMismatchException | MissingResourceException e) {
            } catch (ArrayIndexOutOfBoundsException e) {
            } catch (IllegalArgumentException e) {
         } catch (IOException e) {
         } catch (Exception e) {
            }
         }
private void mightThrow() throws DateTimeParseException, IOException { }
}
