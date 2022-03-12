#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *prev;
    struct node *next;
} *head = NULL;

void display(struct node *head)
{
    if (head == NULL)
    {
        printf("\nList is empty\n");
    }
    else
    {
        struct node *p = head;
        printf("\nElement : ");
        while (p != NULL)
        {
            printf("%d ", p->data);
            p = p->next;
        }
    }
}

struct node *InsertAtFront(struct node *head)
{
    int value;
    struct node *new = (struct node *)malloc(sizeof(struct node));
    printf("\nEnter value that you want to insert: ");
    scanf("%d", &value);

    if (head == NULL)
    {
        head = (struct node *)malloc(sizeof(struct node));
        head->data = value;
        head->next = NULL;
        head->prev = NULL;
    }
    else
    {
        new->next = head;
        head->prev = new;
        new->data = value;
        head = new;
    }
    return head;
}

struct node *InsertAtEnd(struct node *head)
{
    int value;
    struct node *new = (struct node *)malloc(sizeof(struct node));
    printf("\nEnter value that you want to insert: ");
    scanf("%d", &value);

    if (head == NULL)
    {
        head = (struct node *)malloc(sizeof(struct node));
        head->data = value;
        head->next = NULL;
        head->prev = NULL;
    }
    else
    {
        struct node *p = head;
        while (p->next != NULL)
        {
            p = p->next;
        }
        p->next = new;
        new->prev = p;
        new->data = value;
    }
    return head;
}

struct node *DeleteAtLast(struct node *head)
{
    if (head == NULL)
    {
        printf("\nList is empty\n");
    }
    else
    {
        if (head->next == NULL)
        {
            free(head);
            head = NULL;
        }
        else
        {
            struct node *p = head;
            struct node *q = p->next;
            while (q->next != NULL)
            {
                q = q->next;
                p = p->next;
            }
            p->next = NULL;
            free(q);
        }
    }

    return head;
}

struct node *DeleteBeforePosition(struct node *head)
{
    int value;

    if (head == NULL)
    {
        printf("\nLinked list is empty\n");
    }
    else if (head->next == NULL && head->prev == NULL)
    {
        printf("\nThere is only one element available\n");
    }
    else
    {
        struct node *p = head;
        struct node *q = p->next;

        printf("\nEnter the value\n");
        scanf("%d", &value);

        if (q->next == NULL || q->data==value)
        {
            head = q;
            q->prev=NULL;
            free(p);
        }
        else
        {
            while (q->next != NULL && (q->next)->data != value)
            {
                q = q->next;
            }

            if ((q->next)->data == value)
            {
                (q->prev)->next = q->next;
                (q->next)->prev = q->prev;
                free(q);
            }
            else
            {
                printf("");
            }
        }
    }
    return head;
}

int main()
{
    int ch;

    do
    {
        printf("\n1. Insert at front\n2. Insert at end\n3. Delete at last\n4. Delete before position\n5. Display\n6. Exit\n");
        scanf("%d", &ch);

        switch (ch)
        {
        case 1:
            head = InsertAtFront(head);
            break;

        case 2:
            head = InsertAtEnd(head);
            break;

        case 3:
            head = DeleteAtLast(head);
            break;

        case 4:
            head = DeleteBeforePosition(head);
            break;

        case 5:
            display(head);
            break;

        default:
            break;
        }
    } while (ch < 6);

    return 0;
}