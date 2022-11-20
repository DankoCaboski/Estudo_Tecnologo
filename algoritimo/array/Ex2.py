n=[50,20,10,5,2,1]
vtroco = []
troco = int(input('valor pago: '))-int(input('Custo da compra: '))
if troco == 0:
    print('Não ha troco')
else:
    for i in n:
        while troco>= i:
            troco = troco-i
            vtroco.append(i)
    print(f'as cedulas serão{vtroco}')
