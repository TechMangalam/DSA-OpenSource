#include<stdio.h>
    void main (){
        int a[10],k;
        printf("Enter Number of elements to input=");
        scanf("%d",&k);
        for(int j=0;j<k;j++)
        {
            printf("Enter elements=");
            scanf("%d",&a[j]);
        }
        int s, i,pos;
        printf("Enter Number which is to be searched\n");
        scanf("%d",&s);
        for (i = 0; i< 10; i++){
            if(a[i] == s)
            {
                pos = i+1;
                break;
            }
            else
            pos = 0;
        }
        if(pos != 0)
        {
            printf("\nNumber found at position %d\n",pos);
        }
        else
        {
            printf("\nNumber not found\n");
        }
    }
