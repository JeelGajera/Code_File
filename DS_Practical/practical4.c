#include <stdio.h>
#include <stdlib.h>

int queue[5], front=0, rear=0, n=5;
void insertion();
void deletion();
void display();

void main()
{
    int choice;
    char  ch = 'y',c;
    while(ch=='y' || ch=='y')
    {
        printf("\nSelection an operation\n \n1.Inseertion(enqueue)\n2.Deleton(Dequeue)\n3.Display\n4.Exit\n");
        printf("\nEnter your choice: ");
        scanf("%d", &choice);

        switch(choice)
        {
            case 1:insertion();
                break;
            case 2:deletion();
                break;
            case 3:display();
                break;
            case 4:exit(1);
                break;
            default:printf("\nSelect proper operaton");

        }
        printf("\nDo you want to Continue?(y/n): ");
        scanf("%c", &c);
        scanf("%c", &ch);
    }
}

void insertion()
{
    int val;
    if((rear+1)%n == front)
        printf("Queue Overflow!");
   
    if((rear+1)%n < n)
    {
        printf("\nEnter the value: ");
        scanf("%d", &val);
        rear++;
        queue[rear] = val;
        if(front == 0)
            front=1;
    }
    else
    {
        rear = (rear+1)%n;
        queue[rear] = val;
    }
}

void deletion()
{
    int val;
    if(front == 0)
        printf("\n\nQueue Underflow\n");
    else
    {
        val = queue[front];
        if(front == rear)
            front=rear=0;
        else
            front = (front+1)%n;
        printf("\n\nDeleted Value: %d\n", val);
    }
}

void display()
{
    int i;
    if(front == 0)
        printf("Queue Undeflow!!\n");
    i=front;
    if(front<=rear)
    {
        printf("\n\n");
        while(i<=rear)
            printf("%d ",queue[i++]);
        printf("\n");
    }
    else
    {
        printf("\n\n");
        while(i<=n-1)
           printf("%d ",queue[i++]) ;
        i=0;
        while(i<=rear)
            printf("%d ",queue[i++]);
        printf("\n");
    }
}