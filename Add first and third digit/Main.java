#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d", &n);
  int a;
  int b;
  int c;
  
  a=n/100;
  b=n%10;
  c=a+b;
  
  printf("%d",c);
  return 0;
}