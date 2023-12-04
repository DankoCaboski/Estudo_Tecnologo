import random

def seedVetor():
    tamanho = random.randint(20, 50)
    vetor = [random.randint(1, 100) for _ in range(tamanho)]
    return vetor

def printArray(arr, sorted):
    print()
    print("ordenado?", sorted)
    for num in arr:
        print(num)

def mergeSort(a):
    if len(a) < 2:
        return a

    meio = len(a) // 2

    left = mergeSort(a[:meio])
    right = mergeSort(a[meio:])

    return merge(left, right)

def merge(left, right):
    result = []
    i = j = 0

    while i < len(left) and j < len(right):
        if left[i] <= right[j]:
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1

    result.extend(left[i:])
    result.extend(right[j:])

    return result

vetor = seedVetor()
printArray(vetor, False)

vetor = mergeSort(vetor)

printArray(vetor, True)



