class Circle {
    int radius;

    // No-argument constructor
    Circle() {
        radius = 5;
    }

    // Two-argument constructor
    Circle(int r, int x) {
        radius = r;
    }

    int calculateCircumference() {
        return 2 * 3 * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(7, 0);

        System.out.println("Circumference: " + c1.calculateCircumference());
        System.out.println("Circumference: " + c2.calculateCircumference());
    }
}
