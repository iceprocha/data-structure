#include <stdio.h>
//1 - Instânciado na mémoria stack
//2 - é criado com um tamanho fixo mesmo que não tenha sido completamente preenchido
//3 - Estrutura leve e performatica
//4 - Os elementos do array devem ser do mesmo tipo

void main() {
    
    int array[10] = {10, 20, 30, 40 , 50, 88, 77, 100, 1 };

       printf("Tamanho %d",sizeof(int));

    for (int i = 0; i < 10; i++) {
        printf("Índice [%d]: Endereço na memória [%p], conteúdo: [%d]\n", i, &array[i], array[i]);         
    }

 

    printf("----------------\n");
    
    array[8] = 55;
    
    printf("Alteração do elemento de índice 8: [%p] conteúdo: [%d]\n", &array[8], array[8]);
    printf("----------------\n\n\n");

    return;
}