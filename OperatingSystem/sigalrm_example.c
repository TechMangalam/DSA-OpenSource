#include<stdio.h>
#include<unistd.h>
#include<signal.h>

using namespace std;

void handle_sigalrm(int sig) {
printf("Hello!\n");
alarm(1); /* Request another SIGALRM in 1 second. */
}
/* User typed Ctrl-C. Taunt them. */
void handle_sigint(int sig) {
printf("Ha ha, can't kill me!\n");
}
int main() {
signal(SIGINT, handle_sigint);
signal(SIGALRM, handle_sigalrm);
alarm(1); /* Request a SIGALRM in 1 second. */

while (1) pause(); /* Gentle infinite loop. */
return 0;
}
