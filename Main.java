import java.util.Scanner;
  class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Bir sayı giriniz: ");
    int n = input.nextInt();
    int toplam = 0;
    for(int i=1 ; i < n ; i++) {
      if(n % i ==0 ) {
        toplam += i; 
      }

      
    }
    if(toplam == n) {
          System.out.println("Girdiğiniz sayı bir mükemmel sayıdır. ");
        } else{
          System.out.println("Girdiğiniz sayı bir mükemmel sayı değildir. ");
        }
    
  }
}