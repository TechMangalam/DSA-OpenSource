import java.util.*;

public class Main {

  public static void main(String[] args) {
    // write youhere
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    String ns = "", res;
    int len = 0;
    ns = Integer.toString(n);
    len = ns.length();

    for (int i = 0; i < len; i++)
    {
      System.out.println(ns.charAt(i));
    }


  }
}
