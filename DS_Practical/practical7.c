#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
} *head = NULL;

void display(struct node *head)
{
    if (head == NULL)
    {
        printf("\nStack is underflow!\n");
    }
    else
    {
        struct node *p = head;
        while (p != NULL)
        {
            printf("\n%d\n", p->data);
            p = p->next;
        }
    }
}

struct node *push(struct node *head)
{
    int value;
    struct node *new;
    new = (struct node *)malloc(sizeof(struct node));

    printf("\nEnter element you want to insert: ");
    scanf("%d", &value);

    if (head == NULL)
    {
        head = (struct node *)malloc(sizeof(struct node));
        head->data = value;
        head->next = NULL;
    }
    else
    {
        new->data = value;
        new->next = head;
        head = new;
    }
    return head;
}

struct node *pop(struct node *head)
{
    if (head == NULL)
    {
        printf("\nStack is Underflow!\n");
    }
    else
    {
        struct node *ptr = head;
        head = head->next;
        free(ptr);
        return head;
    }
    return head;
}

struct node *peep(struct node *head)
{
    int pos;
    printf("\nEnter the position: ");
    scanf("%d", &pos);

    struct node *p = head;
    int a = 1;
    while (a < pos)
    {
        p = p->next;
        a++;
    }
    if (p == NULL)
    {
        printf("\nStack length is less than your position!");
    }
    else
    {
        printf("\n%d element is: %d\n", pos, p->data);
    }
}

struct node *change(struct node *head)
{
    int pos, data;
    printf("\nEnter position you insert element: ");
    scanf("%d", &pos);

    struct node *p = head;
    int a = 1;
    while (a < pos)
    {
        p = p->next;
        a++;
    }
    if (p == NULL)
    {
        printf("\nStack length is less than your position!");
    }
    else
    {
        printf("\nEnter value you want to insert: ");
        scanf("%d", &data);
        p->data = data;
    }
    return head;
}

int main()
{
    int choice;
    do
    {
        printf("\n1. Push\n2. Pop\n3. Peep\n4. Change\n5. Display\n6. Exit\n");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            head = push(head);
            break;

        case 2:
            head = pop(head);
            break;

        case 3:
            peep(head);
            break;

        case 4:
            change(head);
            break;

        case 5:
            display(head);
            break; 

        default:
            break;
        }
    } while (choice < 6);
    return 0;
}