// MALLOC ( )
#include <stdio.h>
#include <stdlib.h>

void main()
{
    int *ptr;
    int i, x;

    printf("Enter number of elements:");
    scanf("%d", &x);
    printf("\nNo.Of elements: %d", x);
    ptr = (int*)malloc(x*sizeof(int));

    if(ptr == NULL)
    {
        printf("\nMEMORY IS NOT ALLOCATED");
        exit(0);
    }
    else
    {
        printf("\nMemory successfully allocated using malloc\n");

        for ( i = 0; i < x; ++i)
        {
            ptr[i] = i + 1;
        }

        printf("\nThe elements of the array are: ");
        
        for ( i = 0; i < x; i++)
        {
            printf("%d ", ptr[i]);
        }
        
    }
    
}
// CALLOC ( )
#include <stdio.h>
#include <stdlib.h>

void main()
{
    int *ptr;
    int i, x=5;

    printf("Enter number of elements:");
    scanf("%d", &x);
    printf("\nNo.Of elements: %d", x);
    ptr = (int*)calloc(x,sizeof(int));

    if(ptr == NULL)
    {
        printf("\nMEMORY IS NOT ALLOCATED");
        exit(0);
    }
    else
    {
        printf("\nMemory successfully allocated using calloc\n");

        for ( i = 0; i < x; ++i)
        {
            ptr[i] = i + 1;
        }

        printf("\nThe elements of the array are: ");
        
        for ( i = 0; i < x; i++)
        {
            printf("%d ", ptr[i]);
        }
        
    }
    
}
// FREE ( )
#include <stdio.h>
#include <stdlib.h>

void main()
{
    int *ptr;
    int i, x=5;

    printf("Enter number of elements:");
    scanf("%d", &x);
    printf("\nNo.Of elements: %d", x);
    ptr = (int*)malloc(x*sizeof(int));

    if(ptr == NULL)
    {
        printf("\nMEMORY IS NOT ALLOCATED");
        exit(0);
    }
    else
    {
        printf("\nMemory successfully allocated using malloc\n");

        for ( i = 0; i < x; ++i)
        {
            ptr[i] = i + 1;
        }

        printf("\nThe elements of the array are: ");
        
        for ( i = 0; i < x; i++)
        {
            printf("%d ", ptr[i]);
        }
        
    }
    free(ptr);
}