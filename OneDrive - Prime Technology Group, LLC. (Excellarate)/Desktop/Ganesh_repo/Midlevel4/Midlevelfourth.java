public class Midlevelfourth {
    public void mixString(String alpha, String beta) {
        String result = "";
        for (int i = 0; i < alpha.length() || i < beta.length(); i++) {
            if (i < alpha.length()) {
                result += alpha.substring(i, i + 1);
            }
            if (i < beta.length()) {
                result += beta.substring(i, i + 1);
            }
        }
        System.out.println("mixString(\"abc\", \"xyz\") → " + result);
    }
        public static void main(String[] args) {
            Midlevelfourth Object = new Midlevelfourth();
            Object.mixString("abc", "xyz");
        }
    }
