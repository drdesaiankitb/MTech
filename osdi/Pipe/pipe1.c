#include<stdio.h>

int main()
{
	int pfd[2];
	pipe(pfd);
	printf("Pipe read end desc is %d\n",pfd[0]);
	printf("Pipe write end desc is %d\n",pfd[1]);
	return 0;
}
