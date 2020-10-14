/*
NAME: Stanley Hahm
ID: A14609365
EMAIL: sthahm@ucsd.edu

In this code, we are receiving inputs for how much exposure
two parties had with each other. From then, we evaluate how
long the two met in minutes. And we also calculate how severe
the exposure will make them prone to coronavirus.
*/
import java.util.Scanner;
/*
This class will receive input from user and scan it to calculate
difference in time of meeting and time of leaving. Then it'll
output time difference and potential of exposure.
*/
public class CovidTransmission {
  /*
  This takes in inputs of time and converts it to time difference
  and likeliness of exposure.

  D1, D2 = input day of the month
  H1, H2 = input hours
  M1, M2 = input minutes

  System.out.println(tot + "") = output of total time & exposure
  */
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int D1;
    int D2;
    int H1;
    int H2;
    int M1;
    int M2;
    int D; //output Day
    int H; //output Hour
    int M; //output Minute
    int tot; //total time in minutes

    D1 = scnr.nextInt();
    H1 = scnr.nextInt();
    M1 = scnr.nextInt();
    D2 = scnr.nextInt();
    H2 = scnr.nextInt();
    M2 = scnr.nextInt();

    if ((D1 > 0) && (D1 <= 31) && (D2 > 0) && (D2 <= 31)){
      D = D2 - D1;
      if ((H1 >= 0) && (H1 < 24) && (H2 >= 0) && (H2 < 24)){
        H = H2 - H1;
          if ((M1 >= 0) && (M1 < 60) && (M2 >= 0) && (M2 < 60)){
            M = M2 - M1;
            D = D * 1440;
            H = H * 60;
            tot = D + H + M;
            if ((tot >= 0) && (tot <= 60)){
              System.out.println(tot + " low");
            }
            else if ((tot > 60) && (tot <= 180)){
              System.out.println(tot + " medium");
            }
            else if ((tot > 180) && (tot <= 360)){
              System.out.println(tot + " high");
            }
            else if ((tot > 360)){
              System.out.println(tot + " extremely high");
            }
            else {
              System.out.println("-1 -1");
            }
          }
          else {
            System.out.println("-1 -1");
          }
      }
      else {
        System.out.println("-1 -1");
      }

    }
    else {
      System.out.println("-1 -1");
    }

  }
}
