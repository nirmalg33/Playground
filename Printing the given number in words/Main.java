#include<stdio.h>
int main()
{
  //Type your code here
  int a;
  scanf("%d",&a);
  
  switch(a)
  {
  case 1:
  printf("one");
  break;
  case 2:
  printf("two");
  break;
  case 3:
  printf("Three");
  break;
  case 4:
  printf("four");
  break;
  case 5:
  printf("Five");
  break;
  default:
  printf("Invalid");
  break;
  }
  return 0;
}