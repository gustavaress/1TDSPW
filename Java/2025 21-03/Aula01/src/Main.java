public class Main{

    public static void main(String[] args) {
        float cp = 10;
        float challange = 5;
        float gs = 7;

        double media =  cp * 0.2 + challange * 0.2 + gs * 0.6;

        System.out.println("A média final é: " + media);

        int x = 10;
        x++; // 10 + 1
        System.out.println(x);
        x--; // 11 - 1
        System.out.println(x);
        x += 2; // 10 + 2
        System.out.println(x);
        x -= 4; // 12 - 4
        System.out.println(x);
        x *= 3; // 8 * 3
        System.out.println(x);
        x /= 4; // 24 / 4
        System.out.println(x);
        x %= 2; // resto da divisão
        System.out.println(x);

    }
}