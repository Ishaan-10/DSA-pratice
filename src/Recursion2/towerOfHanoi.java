package Recursion2;

/* Rules
 Move 1 disk at time
 Never place smalldisk under large
 Move disk at top */

public class towerOfHanoi {

  public static void moveDisks(
    int disks,
    char source,
    char destination,
    char aux
  ) {
    if (disks == 0) {
      return;
    }

    moveDisks(disks - 1, source, aux, destination);
    System.out.println(
      "Disk " +
      disks +
      " moved from " +
      source +
      " to " +
      destination +
      " using " +
      aux
    );
    moveDisks(disks - 1, aux, destination, source);
  }

  public static void main(String[] args) {
    moveDisks(10, 'A', 'B', 'C');
  }
}
