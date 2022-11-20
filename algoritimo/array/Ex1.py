n = []
while len(n)!=10:
    n.append(int(input(f'informe o numero {len(n)+1} da lista: ')))
n.sort()
print(f'menor: {n[0]}')
n.sort(reverse=True)
print(f'maior: {n[0]}')