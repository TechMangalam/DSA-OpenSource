#include<unistd.h>
#include<stdio.h>
int main(){
	if(fork() == 0){
		printf("child process is running with id  : %d\n",getpid());
		printf("parent process id is %d",getpid());
	}
	else{
		printf("parent process running with id : %d",getpid());		
	}
	return 0;
}
