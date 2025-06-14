import java.util.Arrays;
import java.util.List;

public class Country {
    // Списък с държави, до които доставяме
    private static final List<String> validCountries = Arrays.asList(
            "Germany", "France", "USA", "Canada", "Italy", "Spain", "United Kingdom"
    );

    public static boolean isValidCountry(String country) {
        return validCountries.contains(country);
    }
}
