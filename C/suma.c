#include <stdio.h> // Necesario para printf y scanf

void ingreso() {
    int a = 0; 
    int b = 0;

    printf("Ingresa el numero a: ");
    if (scanf("%d", &a) != 1) {
        printf("Error: Entrada invalida para a.\n");
        while (getchar() != '\n');
        return;
    }

    printf("Ingresa el numero b: ");
    if (scanf("%d", &b) != 1) {
        printf("Error: Entrada invalida para b.\n");
        while (getchar() != '\n');
        return; 
    }
    int resultado = a + b; 

    printf("La suma de %d y %d es: %d\n", a, b, resultado);
}

int main() {
    ingreso();
    return 0; 
}