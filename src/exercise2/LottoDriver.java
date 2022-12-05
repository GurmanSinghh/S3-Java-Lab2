package exercise2;

import javax.swing.*;
public class LottoDriver {
    public  static  void main(String[] args)
    {
        Lotto lotto = new Lotto();
        int[] arr = lotto.getArray();
        int sum =0;
        for (int i = 0; i <arr.length ; i++) {
            sum = sum+arr[i];
        }
        int num =0;
        boolean wins = false;
        System.out.print(sum);

        for (int i = 0; i <5 ; i++) {

            num = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number "));
            while (num < 3 || num > 27) {
                JOptionPane.showMessageDialog(null, "Please enter a number between 3 - 27");
                num = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number "));
            }
            if (num == sum)
            {
                JOptionPane.showMessageDialog(null,"You wins.");
                wins = true;
                break;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please try again.");
            }
        }
        if(!wins)
        {
            JOptionPane.showMessageDialog(null,"You lose all the chances to win this game.");
        }

    }
}