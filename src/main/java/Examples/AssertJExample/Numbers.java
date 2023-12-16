package Examples.AssertJExample;

import java.util.OptionalInt;

public class Numbers {
    public OptionalInt findFirstDigit(final String number) {
        return number.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .findFirst();
    }
}
