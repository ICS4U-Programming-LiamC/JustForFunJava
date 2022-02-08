import java.util.*;  
class Primes {
  public static void main(String[] args) {
    List<Integer> list=new ArrayList<Integer>();
    list.add(2);
    list.add(3);

    int prime = 1;

    for (int i = 4; i < 10000; i++) {
      for (int x = 0; x < list.size(); x++) {
        if (i % list.get(x) == 0) {
          prime = 0;
          break;
        }
        if (list.get(x) > Math.sqrt(i)) {
          break;
        }

      }
      if (prime == 1) {
        list.add(i);
      } else {
        prime = 1;
      }
    }
    System.out.print(list);
    System.out.print("Done");
  }
}
