#include <stdio.h>
#include <stdlib.h>
#define n 10

int top=0,stack[n];
void push();
void pop();
void display();
void peep();
void change();

void main()
{
    int choice;
    do
    {
        printf("\n--//Stack Menu//--");
        printf("\n\n1.PUSH\n2.POP\n3.DISPLAY\n4.PEEP\n5.CHANGE\n6.EXIT");
        printf("\n\nEnter your choice(1-6):");
        scanf("%d",&choice);

        switch(choice)
        {
            case 1:push();
                break;
            case 2:pop();
                break;
            case 3:display();
                break;
            case 4:peep();
                break;
            case 5:change();
                break;
            case 6:printf("Thank You!");
                break;
            default:printf("\nEnter proper choice!!");

        }
    }while(choice<6);
}

void push()
{
    int value;
    if(top >= n)
    {
        printf("\nStack Overflow!");
    }
    else
    {
        printf("\nEnter elements to push:");
        scanf("%d", &value);
        top++;
        stack[top] = value;
    }
}

void pop()
{
    if(top == 0)
    {
        printf("\nStack Underflow!!");
    }
    else
    {
        printf("]nDeleted element is %d", stack[top]);
        top--;
    }
}

void display()
{
    int i;
    if(top == 0)
    {
        printf("\nStack Underflow!!");
    }
    else
    {
        printf("\nStack is...\n");
        for(i=top; i>0; i--)
            printf("%d\n", stack[i]);
    }
}

void peep()
{
    int x, pos;
    printf("\nEnter the position:");   
    scanf("\n%d", &pos);
    if(top-pos+1 <= 0)
    {
        printf("\nStack Underflow!!");
    }
    else
    {
        printf("\n%d", stack[top-pos+1]);
    }
}

void change()
{
    int pos, a;
    printf("\nEnter the position: ");
    scanf("\n%d", &pos);

    if(top-pos+1 <= 0)
    {
        printf("\nStack underflow!!");
    }
    else
    {
        printf("\nEnter the number: ");
        scanf("\n%d", &a);
        stack[top-pos+1] = a;
    }
}
