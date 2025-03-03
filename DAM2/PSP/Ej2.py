'''
 * Enunciado: Crea una función que retorne el número total de bumeranes de 
 * un array de números enteros e imprima cada uno de ellos.
 * - Un bumerán (búmeran, boomerang) es una secuencia formada por 3 números
 *   seguidos, en el que el primero y el último son iguales, y el segundo
 *   es diferente. Por ejemplo [2, 1, 2].
 * - En el array [2, 1, 2, 3, 3, 4, 2, 4] hay 2 bumeranes ([2, 1, 2] 
 *   y [4, 2, 4]).
 */
'''

def function(array):
    pointer = 0
    n = 0
    while pointer < len(array)-1:
        tmp_pointer = pointer + 2
        if (tmp_pointer > len(array) - 1 or pointer > len(array) -1):
            break
        if array[pointer] == array[tmp_pointer]:
            n += 1
            pointer = tmp_pointer + 1
            continue
        pointer += 1
    return n
array=[2,1,2,1,3,3,4,2,4]
print(function(array))