package staticInnerClass;

class ArrayAlg {
    public static class Pair {

        private double first;
        private double last;

        public Pair (double f, double l) {
            first = f;
            last = l;
        }

        public double getFirst() {
            return first;
        }

        public double getLast() {
            return last;
        }
    }

    public static Pair minmax(double[] values) {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;

        for (double v : values) {
            if (min > v) min = v;
            if (max < v) max = v;
        }
        return new Pair(min, max);
    }
}
