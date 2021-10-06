#include<stdio.h>
#include<unistd.h>
#include<signal.h>


int main()
{ if (fork() != 0)
{
alarm(8);
printf("I am the parent \n");
sleep(3);
execl("./ABC", "201951089", NULL); // Replace “Your student id” with your actual id. Eg, 2018051001
}
else while (1)
{
alarm(6);
printf("I am the child \n");
sleep(2);
}
}
