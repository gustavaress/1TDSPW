print("Bem vindo ao nosso convertor de dolar para reais!\n")

cotacaoDolar = float(input("Insira o valor atual do dólar: "))
valorReal = float(input("\nInsira o valor de reais que você deseja converter: "))
valorDolar = valorReal / cotacaoDolar

print(f"\nO valor R${valorReal} sera convertido para ${valorDolar}")