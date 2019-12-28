/**
 * Good morning! Here's your coding interview problem for today.
 * <p>
 * This problem was asked by Amazon.
 * <p>
 * Run-length encoding is a fast and simple method of encoding strings.
 * The basic idea is to represent repeated successive characters as a single count and character.
 * For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".
 * <p>
 * Implement run-length encoding and decoding.
 * You can assume the string to be encoded have no digits and consists solely of alphabetic characters.
 * You can assume the string to be decoded is valid.
 */


public class Day29Problem {

    public String runLengthEncoding(String string) {

        int count = 0;
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < string.length(); i++) {
            count++;
            if ((i + 1 >= string.length() || (string.charAt(i) != string.charAt(i + 1)))) {
                result.append(count);
                result.append(string.charAt(i));
                count = 0;
            }
        }
        return result.toString();
    }
}
