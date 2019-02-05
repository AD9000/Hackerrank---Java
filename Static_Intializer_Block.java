// Author: Atharv Damle
// Create a static initializer block. It is used to initialize static or class variables.
// It is like a constructor in the sense that it is executed when the class is executed.
// Only difference is that a constructor is only executed when an object is created.

// Full Question: https://www.hackerrank.com/challenges/java-static-initializer-block/problem

// This solution is only a part of the complete class. (Stub/Locked code provided by hackerrank is the rest)

static int B, H;
static boolean flag;
static {
    Scanner sc = new Scanner(System.in);
    B = sc.nextInt();
    H = sc.nextInt();
    if (B <= 0 || H <= 0)
    {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        flag = false;
    }
    else
    {
        flag = true;
    }
}
