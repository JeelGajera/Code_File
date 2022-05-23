#include <sys/types.h>
#include <unistd.h>
#include <stdio.h>
int main()
{
    pid_t pid;
    pid = fork();
    if (pid == -1)
    {
        printf("Error cannot create child process\n");
        return -1;
    }
    else if (pid > 0)
    {
        printf("Hello from parent and My pid = %d\n", getpid());
    }
    else if (pid == 0)
    {
        printf("Hello from child and My pid =%d\n", getpid());
    }
    return 0;
}
