public class Midlevelfourth {
    public void mixString(String a, String b) {
        String result = "";
        for (int i = 0; i < a.length() || i < b.length(); i++) {
            if (i < a.length()) {
                result += a.substring(i, i + 1);
            }
            if (i < b.length()) {
                result += b.substring(i, i + 1);
            }
        }
        System.out.println("mixString(\"abc\", \"xyz\") → " + result);
    }
        public static void main(String[] args) {
            Midlevelfourth a = new Midlevelfourth();
            a.mixString("abc", "xyz");
        }
    }
