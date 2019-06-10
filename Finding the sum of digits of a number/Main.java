#include <stdio.h>
int main() {
	//Type your code
  int a;
  scanf("%d",&a);
  int b=0;
  while(a>0){
  b=b+(a%10);
    a=a/10;
  }
  printf("%d",b);
	return 0;
}