#include <stdio.h>
#include <stdlib.h>

int data;
struct node
{
    int data;
    struct node *next;
} *head = NULL;

void linkedListlocator(struct node *ptr)
{
    if (head == NULL)
    {
        printf("Linked list is empty!\n");
    }
    else
    {
        printf("\nElement: ");
        while (ptr != NULL)
        {
            printf("%d ", ptr->data);
            ptr = ptr->next;
        }
    }
}

//(a) Insert Node at the front of the linked list

struct node *insertAtFirst(struct node *head)
{
    printf("\nEnter element you want to insert: ");
    scanf("%d", &data);

    if (head == NULL)
    {
        head = (struct node *)malloc(sizeof(struct node));
        head->data = data;
        head->next = NULL;
        return head;
    }
    else
    {
        struct node *ptr = (struct node *)malloc(sizeof(struct node));
        ptr->data = data;
        ptr->next = head;
        return ptr;
    }
}
//(b) Insert Node at the end of the linked list

struct node *insertAtEnd(struct node *head)
{
    printf("\nEnter element you want to insert: ");
    scanf("%d", &data);

    struct node *ptr = (struct node *)malloc(sizeof(struct node));
    struct node *p = head;
    ptr->data = data;

    if (head == NULL)
    {
        head = (struct node *)malloc(sizeof(struct node));
        head->data = data;
        head->next = NULL;
        return head;
    }
    else
    {
        while (p->next != NULL)
        {
            p = p->next;
        }
        p->next = ptr;
        ptr->next = NULL;
        return ptr;
    }
}
//(c) Insert a Node such that linked list in ascending order

struct node *ascending(struct node *ptr)
{
    int temp;
    struct node *new = (struct node *)malloc(sizeof(struct node));
    ptr = head;
    struct node *q;
    struct node *p = head;

    if (head == NULL)
    {
        printf("\nlinked list is empty!");
    }

    while (ptr != NULL) // checking for asending order
    {
        q = ptr->next;
        while (q != NULL)
        {
            if (ptr->data > q->data)
            {
                temp = ptr->data;
                ptr->data = q->data;
                q->data = temp;
            }
            q = q->next;
        }
        ptr = ptr->next;
    }

    printf("\nEnter element you want to insert: ");
    scanf("%d", &data);
    new->data = data;
    p = head;

    if (p->data > new->data)
    {
        new->next = p;
        head = new;
    }
    else
    {

        while (p->next != NULL && new->data > (p->next)->data)
        {
            p = p->next;
        }

        if (p->next == NULL)
        {
            p->next = new;
            new->next = NULL;
        }
        else
        {
            q = p->next;
            new->next = q;
            p->next = new;
        }
    }
    return head;
}
//(d) Delete first node of the linked list

struct node *deleteFirstNode(struct node *ptr)
{
    if (head == NULL)
    {
        printf("\nlinked list is empty!\n");
    }
    else
    {
        ptr = (struct node *)malloc(sizeof(struct node));
        ptr = head->next;
        free(head);
        head = ptr;
        return head;
    }
}
//(e) Delete a Node before specified position

struct node *deleteBeforeValue(struct node *head)
{
    if (head == NULL)
    {
        printf("\nlinked list is empty!\n");
    }
    else if (head->next == NULL)
    {
        printf("\nlinked list has a only one element!\n");
    }
    else
    {
        struct node *p = head;
        struct node *q = p->next;

        printf("\nEnter the value\n");
        scanf("%d", &data);

        if (q->next == NULL || q->data == data)
        {
            head = q;
            free(p);
        }
        else
        {
            while (q->next != NULL && (q->next)->data != data)
            {
                p = p->next;
                q = q->next;
            }

            if ((q->next)->data == data)
            {
                p->next = q->next;
                free(q);
            }
            else
            {
                printf("\nHey human are you kidding me!. plz enter proper value.\n");
            }
        }
    }
    return head;
}
//(f) Delete a Node after specified position

struct node *deleteAfterValue(struct node *head)
{
    if (head == NULL)
    {
        printf("\nlinked list is empty!\n");
    }
    else if (head->next == NULL)
    {
        printf("\nlinked list has a only one element!\n");
    }
    else
    {
        struct node *p = head;
        struct node *q = head->next;

        printf("\nEnter the value\n");
        scanf("%d", &data);
        while (p->data != data && q->next != NULL)
        {
            p = p->next;
            q = q->next;
        }

        if (p->data == data)
        {
            p->next = q->next;
            free(q);
        }
        else
        {
            printf("\nHey human are you kidding me!. plz enter proper value.\n");
        }
    }

    return head;
}

// main control center ;)
int main()
{
    int choice;
    do
    {
        printf("\n 1 To see list\n 2 for insertion at starting\n 3 for insertion at end\n 4 for insert at ascending order\n 5 Delete first node\n 6 Delete node before position\n 7 Delete node after position\n 8 for Exit\n");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
            linkedListlocator(head);
            break;

        case 2:
            head = insertAtFirst(head);
            break;

        case 3:
            head = insertAtEnd(head);
            break;

        case 4:
            head = ascending(head);
            break;

        case 5:
            head = deleteFirstNode(head);
            break;

        case 6:
            head = deleteBeforeValue(head);
            break;

        case 7:
            head = deleteAfterValue(head);
            break;

        default:
            break;
        }
    } while (choice < 8);

    return 0;
}