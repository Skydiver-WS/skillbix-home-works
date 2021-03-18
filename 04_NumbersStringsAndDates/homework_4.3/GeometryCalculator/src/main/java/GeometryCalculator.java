public class GeometryCalculator {
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {
        return (4 * Math.PI * Math.pow(Math.abs(radius), 3)) / 3;
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        if (!((a + b) > c) || !((a + c) > b) || !((c + b) > a))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        if (isTrianglePossible(a, b, c)) // выполнится только при условии, что метод isTrianglePossible = true, это достигается за счет проверки условий в методе
        {
            double semiPerimeter = (a + b + c) / 2;
            double triangSquare = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
            return triangSquare;
        }
        else
        {
            return -1;
        }
    }
}
