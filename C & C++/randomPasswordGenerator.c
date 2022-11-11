#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void password(int lenght)
{
    char result[lenght];
    char word[] = "abcdefghijklmnopqrstuvwxyz1234567890!@#$^&*";
    srand(time(NULL));
    for (int i = 0; i < lenght; i++)
    {
        result[i] = word[rand() % 43];
        printf("%c", result[i]);
    }
    printf("\n");
    printf("\n");
}
int main()
{
    printf("Random Password Generator..............\n");
    printf("\n");
    int passLenght;
    printf("Enter Lenght of password........\n");
    scanf("%d", &passLenght);
    printf("\n");
    password(passLenght);
    printf("\n");
}