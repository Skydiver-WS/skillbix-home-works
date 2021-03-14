public class Main {
    public static void main(String[] args) {
        byte a = Byte.MAX_VALUE;
        byte b = Byte.MIN_VALUE;
        short c = Short.MAX_VALUE;
        short d = Short.MIN_VALUE;
        int e = Integer.MAX_VALUE;
        int f = Integer.MIN_VALUE;
        long g = Long.MAX_VALUE;
        long h = Long.MIN_VALUE;
        float i = Float.MAX_VALUE;
        float j = -Float.MAX_VALUE;
        double k = Double.MAX_VALUE;
        double l = -Double.MAX_VALUE;
        System.out.println("byte max: " + a + "\t" + "min: " + b + "\n" + "short max: " + c + "\t" + "min: " + d + "\n" +
                "int max: " + e + "\t" + "min: " + f + "\n" + "long max: " + g + "\t" + "min: " + h + "\n" + "float max: " + i + "\t" + "min: " + j + "\n" +
                "double max: " + k + "\t" + "min: " + l);
    }
}
