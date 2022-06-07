public class SQRService {
    public int calcSqr(int borderOne, int borderTwo) {
        //System.out.println("числа, квадраты которых удовлетворяют диапазону от " + borderOne + " до " + borderTwo + " это: ");
        int numberSqr = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i >= borderOne && i * i <= borderTwo) {
                numberSqr = numberSqr + 1;
                //System.out.println(i);
            }
        }
        //System.out.println("Количество таких чисел:");
        return numberSqr;
    }
}
