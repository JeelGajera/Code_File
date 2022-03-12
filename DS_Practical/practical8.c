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
        printf("\nQueue is Underflow!");
    }
    else
    {
        struct node *p = head;
        while (p != NULL)
        {
            printf("%d ", p->data);
            p = p->next;
        }
    }
}

struct node *push(struct node *head)
{
    int value;
    struct node *new;
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
        new = (struct node *)malloc(sizeof(struct node));
        struct node *p = head;
        new->data = value;
        while (p->next != NULL)
        {
            p = p->next;
        }
        p->next = new;
        new->next = NULL;
    }
    return head;
}

struct node *pop(struct node *head)
{
    if (head = NULL)
    {
        printf("\nQueue is Underflow!\n");
    }
    else
    {
        struct node *ptr = head;
        head = head->next;
        free(ptr);
    }
    return head;
}

int main()
{
    int choice;
    do
    {
        printf("\n1. Enqueue\n2. Dequeue\n3. Display\n4. Exit\n");
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
            display(head);
            break;

        default:
            break;
        }
    } while (choice < 4);
    return 0;
}