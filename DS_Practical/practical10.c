#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
} *head = NULL;

void linkedListLocator(struct node *head)
{
    if (head == NULL)
    {
        printf("\nLinked list is empty!");
    }
    else
    {
        struct node *ptr = head;
        printf("\nElement: ");
        do
        {
            printf("%d ", ptr->data);
            ptr = ptr->next;
        } while (ptr != head);
    }
}

struct node *insertAtEnd(struct node *head)
{
    int data;
    printf("\nEnter value you want to insert: ");
    scanf("%d", &data);

    if(head == NULL)
    {
        head = (struct node *)malloc(sizeof(struct node));
        head->data = data;
        head->next = head;
    }
    else
    {
        struct node *new = (struct node *)malloc(sizeof(struct node));
        struct node *p = head;
        new->data = data;
        while ( p != NULL)
        {
            p = p->next;
        }
        p->next = new;
        new->next = head;
    }
    return head;
}

struct node *insertBeforePosition(struct node *head)
{
    int value, data;

    struct node *p = head;
    printf("\nEnter the value: ");
    scanf("%d", &value);
    printf("\nEnter the data you want to insert: ");
    scanf("%d", &data);
    
    struct node *new = (struct node *)malloc(sizeof(struct node));
    new->data = data;
    if(head->data == value)
    {
        while (p->next != head)
        {
            p = p->next;
        }
        new->next = head;
        p->next = new;
        head = new;
    }
    else
    {
        while ((p->next)->data != value && p->next != head)
        {
            p = p->next;
        }
        if((p->next)->data = value)
        {
            new->next = p->next;
            p->next = new;
        }
        else
        {
            if (p->next == head)
            {
                printf("\nEnter proper value!");
            }
        }
    }
    return head;
}

struct node *deleteAtFirst(struct node *head)
{
    if(head == NULL)
    {
        printf("\nLinked list is empty!");
    }
    else
    {
        if (head->next == head)
        {
            struct node *p = head;
            free(p);
            head = NULL;
        }
        else
        {
            struct node *p = head;
            struct node *q = head;
            while (q->next != head)
            {
                q = q->next;
            }
            q->next = p->next;
            head = q->next;
            free(p);
        }
    }
    return head;
}

struct node *deleteAfterPosition(struct node *head)
{
    int value;
    printf("\nEnter the value: ");
    scanf("%d", &value);
    if (head == NULL)
    {
        printf("\nLinked list empty!");
    }
    else if (head->next == head)
    {
        if(head->data == value)
        {
            printf("\nOnly one element is present!\n");
        }
        else
        {
            printf("\nThere is No match with entered value!\n");
        }
    }
    else
    {
        struct node *p = head;
        struct node *q = head->next;
        while (p->data != value && p->next != head)
        {
            p = p->next;
            q = q->next; 
        }
        if (p->data == value && p->next != head)
        {
            p->next = q->next;
            free(q);
        }
        else if (p->data == value && p->next == head)
        {
            printf("\nNo element available after %d\n", value);
        }
        else
        {
            printf("\nThere is No match with entered value!\n");
        }
    }
    return head;
}

int main()
{
    int choice;
    do
    {
        printf("\n1. Insert At End\n2. Insert Before Position\n3. Delete At First\n4. Delete After Position\n5. Display\n6. Exit\n");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
            head = insertAtEnd(head);
            break;

        case 2:
            head = insertBeforePosition(head);
            break;

        case 3:
            head = deleteAtFirst(head);
            break;

        case 4:
            head = deleteAfterPosition(head);
            break;

        case 5:
            linkedListLocator(head);
            break;
        
        default:
            break;
        }
    } while (choice < 6);
    return 0;
}