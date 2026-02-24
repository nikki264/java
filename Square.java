class Square {
    Square(int num) {
        int result = num * num;
        System.out.println("Square: " + result);
    }

    public static void main(String[] args) {
        Square s = new Square(5);
    }
}
