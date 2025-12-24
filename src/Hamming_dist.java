//Program for Calculate the Hamming distance between two strings

public class Hamming_dist {
    public static int calculateHammingDistance(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException("Strings cannot be null.");
        }
        if (str1.length() != str2.length()) {
            throw new IllegalArgumentException("Strings must have the same length to calculate Hamming distance.");
        }

        int distance = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                distance++;
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        String s1 = "karolin";
        String s2 = "kerstin";
        String s3 = "apple";
        String s4 = "apply";
        String s5 = "short";
        String s6 = "longerstring";

        try {
            System.out.println("Hamming distance between \"" + s1 + "\" and \"" + s2 + "\": " + calculateHammingDistance(s1, s2)); // Expected: 3
            System.out.println("Hamming distance between \"" + s3 + "\" and \"" + s4 + "\": " + calculateHammingDistance(s3, s4)); // Expected: 1
            System.out.println("Hamming distance between \"" + s5 + "\" and \"" + s5 + "\": " + calculateHammingDistance(s5, s5)); // Expected: 0

            // This will throw an IllegalArgumentException
            // System.out.println("Hamming distance between \"" + s5 + "\" and \"" + s6 + "\": " + calculateHammingDistance(s5, s6));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
