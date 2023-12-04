class No:
     
     def __init__(self, key, dir, esq):
          self.item = key
          self.dir = dir
          self.esq = esq

class Tree:

     def __init__(self): #construtor
          self.root = No(None,None,None)
          self.root = None

     def inserir(self, nParaAdicionar):
          novo = No(nParaAdicionar,None,None)
          if self.root == None:
               print(str(nParaAdicionar) + " foi colocado como raiz")
               self.root = novo
          else:
               atual = self.root
               while True:
                    anterior = atual
                    if nParaAdicionar <= atual.item: # ir para esquerda
                        atual = atual.esq
                        if atual == None:
                              anterior.esq = novo
                              print(str(nParaAdicionar) + " inserido na esquerda")
                              return
                    # fim da condição ir a esquerda
                    else:
                        atual = atual.dir
                        if atual == None:
                               anterior.dir = novo
                               print(str(nParaAdicionar) + " inserido na direita")
                               return
                        

     def buscar(self, chave):
         if self.root == None:
              return None
         
         atual = self.root
         while atual.item != chave:
               if chave < atual.item:
                    atual = atual.esq # caminha para esquerda
               else:
                    atual = atual.dir # caminha para direita
               if atual == None:
                    print("Não encontrado")
                    return None
         print("valor encontrado: ", str(atual.item))
         return atual   


     def noSucessor(self, apaga):
          paidosucessor = apaga
          sucessor = apaga
          atual = apaga.dir # vai para a direita

          while atual != None: # anda tudo para a esquersa
               paidosucessor = sucessor
               sucessor = atual
               atual = atual.esq

          if sucessor != apaga.dir:
               paidosucessor.esq = sucessor.dir
               sucessor.dir = apaga.dir
          return sucessor
     

     def remover(self, nParaRemover):
         if self.root == None:
               print("arvore vazia")
               return False
         
         atual = self.root
         pai = self.root
         filho_esq = True
         
         while atual.item != nParaRemover: # enquanto nao encontrou
               pai = atual
               if nParaRemover < atual.item: # caminha para esquerda
                    atual = atual.esq
                    filho_esq = True
               else: # caminha para direita
                    atual = atual.dir 
                    filho_esq = False # é filho a esquerda? NAO
               if atual == None:
                    return False
               
         if atual.esq == None and atual.dir == None:
               if atual == self.root:
                    self.root = None # se raiz
               else:
                    if filho_esq:
                         pai.esq =  None
                    else:
                         pai.dir = None


         elif atual.dir == None:
               if atual == self.root:
                    self.root = atual.esq # se raiz
               else:
                    if filho_esq:
                         pai.esq = atual.esq # se for filho a esquerda do pai
                    else:
                         pai.dir = atual.esq # se for filho a direita do pai
         

         elif atual.esq == None:
               if atual == self.root:
                    self.root = atual.dir # se raiz
               else:
                    if filho_esq:
                         pai.esq = atual.dir # se for filho a esquerda do pai
                    else:
                         pai.dir = atual.dir # se for  filho a direita do pai


         else:
               sucessor = self.noSucessor(atual) #menor dos maiores 
               if atual == self.root:
                    self.root = sucessor # se raiz
               else:
                    if filho_esq:
                         pai.esq = sucessor # se for filho a esquerda do pai
                    else:
                         pai.dir = sucessor # se for filho a direita do pai
               sucessor.esq = atual.esq 

         return True
  
     def inOrder(self, atual):
         if atual != None:
              self.inOrder(atual.esq)
              print(atual.item,end=" ")
              self.inOrder(atual.dir)
  
     def preOrder(self, atual):
         if atual != None:
              print(atual.item,end=" ")
              self.preOrder(atual.esq)
              self.preOrder(atual.dir)
       
     def posOrder(self, atual):
         if atual != None:
              self.posOrder(atual.esq)
              self.posOrder(atual.dir)
              print(atual.item,end=" ")
     

arv = Tree() # cria uma arvore binaria

arv.inserir(int(input("Digite o valor a ser inserido: ")))
arv.inserir(int(input("Digite o valor a ser inserido: ")))
arv.inserir(int(input("Digite o valor a ser inserido: ")))

arv.remover(int(input("Digite o valor a ser removido: ")))

arv.buscar(int(input("Digite o valor a ser buscado: ")))