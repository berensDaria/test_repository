/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package englishking;
/**
 * @author Даричка
 */
import java.util.Scanner;
public class EnglishKing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
        int wallet=10000;
         System.out.print("Ваш счёт составляет: ");
         System.out.println(wallet);
        int[] numberHor={1,2,3,4,5,6,7,8,9,10};
        String[] nameHor={"Ромашка","Маньяк","Обертка","Волан-де-Морт",
            "Хохма","Мурка","Снеговик","Монстрик","Чайник","Лень"};
        for(int i=0;i<10;i++)
        {
        System.out.print(numberHor[i]);
        System.out.print(". ");
        System.out.print(nameHor[i]);
        System.out.print(" Cтавка 1:");
        System.out.println(i+1);
        }
        System.out.println();
        while(wallet>0)
        {
        System.out.println("Ваше Высочество, выберите номер лошадки от 1 до 10:");
        int ourHor = in.nextInt();
        
        int ourStake=0;
        boolean b=true; 
        while(b)
         {
          System.out.println();
         System.out.println("Ваше Высочество, сделайте вашу ставку:");
         ourStake = in.nextInt();
         if(wallet<ourStake)
         {
              System.out.println();
          System.out.println("Ваше Высочество, одумайтесь, у Вас недостаточно денег");
          b=true;
         }
         else{b=false;}
         }
        System.out.println();
        System.out.println("Лошадки поскакали: тыгыдык-тыгыдык-тыгыдык-тыгыдык");
        int winHor=1+(int)(Math.random()*10);
  
  
           System.out.print("Первой приехала лошадка "); 
           System.out.println(nameHor[winHor-1]);
              System.out.println();
        if (ourHor==winHor)
        {
           wallet=wallet+ourStake*(winHor-1);
         
           System.out.print("Ваше Высочество, поздарвляем, Вы выиграли "); 
           System.out.println(ourStake*winHor);
          
        }
        else
        {
           wallet=wallet-ourStake;
           System.out.print("Ваше Высочество, сожалеем, Вы проиграли "); 
           System.out.println(ourStake); 
          
        }
         System.out.print("Ваше счёт составляет "); 
         System.out.println(wallet);
         System.out.println();
         System.out.println("Ваше высочество, желаете ещё раз сделать ставку? (Y/N)");
         String yn=in.next();
         if("N".equals(yn))
         {wallet=0;
         }
        }
       System.out.println("Благодорим за игру! Досвидания, приходите ещё!:)");
    }
    
}
