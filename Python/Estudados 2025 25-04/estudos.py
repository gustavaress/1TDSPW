import os

def limparTela():
    os.system('cls')

def exibirOpções():
    limparTela()
    opcao1 = print("Opção 1")
    opcao2 = print("Opção 2")
    opcao3 = print("Opção 3")
    opcao4 = print("Opção 4")

    selecionado = int(input("Digite a opção que deseja escolher: "))
    return selecionado

def primeiraOpcao():
    input("Quantos neymares são 1 Neymar + 1 Neymar? ")

def segundaOpcao():
    input("Quantos neymares são 2 Neymar x 2 Neymar? ")

opcaoMenu = exibirOpções()

if opcaoMenu == 1:
    limparTela()
    primeiraOpcao()

elif opcaoMenu == 2:
    limparTela()
    segundaOpcao()

elif opcaoMenu == 3:
    limparTela()
    print("Voce escolheu a opção 3")

elif opcaoMenu == 4:
    limparTela()
    print("Voce escolheu a opção 4")

else:
    limparTela()
    print("Opção Inválida!")


# 2. Soma até zero
# Crie um programa que leia números inteiros do usuário até que ele digite 0. No final, mostre a soma de todos os números digitados (excluindo o zero).

# 3. Validação de senha
# Peça para o usuário digitar uma senha. Enquanto a senha digitada for diferente de "python123", continue pedindo. Quando ele acertar, exiba "Acesso permitido!".

# 4. Jogo da adivinhação
# O programa deve ter um número secreto entre 1 e 10. Peça ao usuário para tentar adivinhar. Enquanto ele errar, continue perguntando. Quando acertar, exiba uma mensagem de sucesso.

# 5. Cálculo de fatorial
# Peça um número ao usuário e calcule seu fatorial utilizando while. Exemplo: 5! = 5 × 4 × 3 × 2 × 1 = 120.

