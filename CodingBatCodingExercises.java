//Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).
//
//
//factorial(1) -> 1
//factorial(2) -> 2
//factorial(3) -> 6

public int factorial(int n) {
  if ( n > 1 )
  
  return n * factorial ( n - 1 );
  else return n;

}

//We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
//bunnyEars(0) -> 0
//bunnyEars(1) -> 2
//bunnyEars(2) -> 4

public int bunnyEars(int bunnies) {
  if (bunnies >= 1)
  return (2 + (bunnyEars ( bunnies - 1 )));
  else return bunnies;
}

The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition. The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence.
//
//
//fibonacci(0) -> 0
//fibonacci(1) -> 1
//fibonacci(2) -> 1
public int fibonacci(int n) {
  if ( n > 1)
  return fibonacci (n - 1) + fibonacci(n - 2);
  else return n;
}
//fib(n) = fib(n-1)+fib(n-2);
    

//We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
//
//
//bunnyEars2(0) -> 0
//bunnyEars2(1) -> 2
//bunnyEars2(2) -> 5

public int bunnyEars2(int bunnies) {
  // compute odd or even
  int ears = 0;
  if ( (bunnies % 2) == 1 ){
    ears = 2;
  }else{
    ears = 3;
  }
  if ( bunnies >= 1 )
    return ears + bunnyEars2 (bunnies - 1);
  else return bunnies;
  
}

//We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.
//
//
//triangle(0) -> 0
//triangle(1) -> 1
//triangle(2) -> 3

public int triangle(int rows) {
  if ( rows > 1)
  return rows + triangle ( rows - 1);
  else return rows;
}

