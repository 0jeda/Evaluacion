#include <stdio.h>
#include <stdlib.h>



        typedef struct{
        int *array;
        int *tail;
        int *head;
        int count;
        int size;
        }arreglo;

        /* run this program using the console pauser or add your own getch, system("pause") or input loop */
        void addFront(int *array, int number);
        void addTail(arreglo **array, int number);
        void size(arreglo *arr);
        void removeAll(arreglo **arr);
        int getNumber(arreglo *arr, int index);


        void addFront(arreglo **array, int number){
        if(*array->head==null){
        *array->array[0]=number;
        *array->head=*array->array[0]=*array->tail;
        (*array->count)++;
        }else{
        if(*array->count<*array->size){
        for(int i=0;i<=*array->count;i++){
        *array->array[(*array->count)-i]=*array->array[(*array->count)-i-1]
        }
        *array->array[0]=number;
        *array->head=*array->array[0];
        (*array->count)++;
        return;
        }else{
        *array->size=*array->size*2;
        int *arrAux=(int*)realloc(*array->array,*array->size*sizeof(int));
        *array->array=arrAux;
        for(int i=0;i<=*array->count;i++){
        *array->array[(*array->count)-i]=*array->array[(*array->count)-i-1]
        }
        *array->array[0]=number;
        *array->head=*array->array[0];
        (*array->count)++;
        return;
        }
        }
        }

        void addTail(arreglo **array, int number){
        if(*array->tail==null){
        *array->array[0]=number;
        *array->head=*array->array[0]=*array->tail;
        (*array->count)++;
        return;
        }else{
        if(*array->count<*array->size){
        *array->array[*array->count]=number;
        *array->tail=*array->array[*array->count];
        (*array->count)++;
        return;
        }else{
        *array->size=*array->size*2;
        int *arrAux=(int*)realloc(*array->array,*array->size*sizeof(int));
        *array->array=arrAux;
        *array->array[*array->count]=number;
        *array->tail=*array->array[*array->count];
        (*array->count)++;
        return;
        }
        }
        }

        void size(arreglo *arr){
        printf("Hay %d elementos en el arreglo",arr->count)

        }

        void removeAll(arreglo **arr){
        free(*arr->array);
        *arr->head=*arr->tail=null;
        return;
        }

        int getNumber(arreglo *arr, int index){
        if(0<=index && index<arr->count){
        return arr->array[index];
        }
        return -1;
        }