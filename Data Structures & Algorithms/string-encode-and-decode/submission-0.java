class Solution {

    public String encode(List<String> strs) {
         StringBuilder encodedResult = new StringBuilder();

        for (String currentString : strs) {

            encodedResult.append(currentString.length())
                    .append("#")
                    .append(currentString);
        }

        return encodedResult.toString();

    }

    public List<String> decode(String encodedString) {
         List<String> decodedStrings = new ArrayList<>();

        int currentPosition = 0;

        while (currentPosition < encodedString.length()) {

            int delimiterPosition =
                    encodedString.indexOf('#', currentPosition);

            int currentStringLength =
                    Integer.parseInt(
                            encodedString.substring(
                                    currentPosition,
                                    delimiterPosition));

            int stringStartIndex = delimiterPosition + 1;
            int stringEndIndex = stringStartIndex + currentStringLength;

            decodedStrings.add(
                    encodedString.substring(
                            stringStartIndex,
                            stringEndIndex));

            currentPosition = stringEndIndex;
        }

        return decodedStrings;

    }
}
