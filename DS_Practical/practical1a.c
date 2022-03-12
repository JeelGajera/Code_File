// CALL BY VALUE

#include <stdio.h>

void swap(int a, int b)
{
    int j;
    j = a;
    a = b;
    b = j;
}

void main()
{
    int x, y;
    int *p = &x;
    int *q = &y;
    printf("Enter value of X , Y :-\n");
    scanf("%d %d", &x, &y);
    printf("\nBefore swapping X=%d Y=%d", x, y);
    swap(*p, *q);
    printf("\nAfter swapping X=%d Y=%d", *p, *q);
}

// CALL BY REFERANCE

#include <stdio.h>

void swap(int *a, int *b)
{
    int j;
    j = *a;
    *a = *b;
    *b = j;
}

void main()
{
    int x, y;
    printf("Enter the value of X and Y:\n");
    scanf("%d %d", &x, &y);
    printf("\nBefore swapping X=%d Y=%d", x, y);
    swap(&x, &y);
    printf("\nAfter swapping X=%d Y=%d", x, y);
}

