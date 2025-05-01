import os, time

consultas = [
            {'NumeroConsulta':'000001','NomeDoutor':'Dr. Gabriel Azevedo','Data':'25/07/25 - 13h00','Especialidade':'Cardiologista'},
            {'NumeroConsulta':'000002','NomeDoutor':'Dra. Isabella Azevedo','Data':'20/08/25 - 17h30','Especialidade':'Psiquiatra'}
            ]

historicos = [
            {'Data':'01/01/25 - 10h00', 'NomeDoutor':'Dr. Gabriel Azevedo','Especialidade':'Cardiologista'},
            {'Data':'02/02/25 - 20h00', 'NomeDoutor':'Dr. Isabella Azevedo','Especialidade':'Psiquiatra'}]

def limparTela():
    os.system('cls')

def listaMenu():
    limparTela()
    print(" ---- Bem-Vindo ao Agendador do hospital das clínicas ---- \n")
    print("1. Historico de Consultas")
    print("2. Telemedicina")
    print("3. Dúvidas")
    print("4. Sair\n")

    selecao = int(input("Digite qual opção deseja escolher: "))

    match selecao:
        case 1:
            historicoConsultas()
        case 2:
            telemedicina()
        case 3:
            duvidas()
        case 4:
            desligar()
        case _:
            print("Opção Inválida! Tente novamente... \n")
            time.sleep(3)
            os.system('cls')
            listaMenu()


def historicoConsultas():
    limparTela()
    print(" ---- HISTORICO DE CONSULTAS ---- \n")
    print("Veja abaixo as suas ultimas consultas\n")
    for historico in historicos:
        print(f'Data: {historico['Data']}')
        print(f'Dr(a): {historico['NomeDoutor']}')
        print(f'Especialidade: {historico['Especialidade']}\n')
    
    input("Digite qualquer tecla para voltar: ")
    listaMenu()

def telemedicina():
    limparTela()
    print(" ---- TELEMEDICINA ---- \n")
    print("1. Meus agendamentos")
    print("2. Reagendar consulta")
    print("3. Cancelar consulta")
    print("4. Voltar\n")

    selecao = int(input("Digite qual opção deseja escolher: "))

    match selecao:
        case 1:
            meusAgendamentos()
        case 2:
            reagendarConsulta()
        case 3:
            cancelarConsulta()
        case 4:
            listaMenu()
        case _:
            print("Opção Inválida! Tente novamente... \n")
            time.sleep(3)
            os.system('cls')
            telemedicina()

def meusAgendamentos():
    os.system('cls')
    print(" ---- MEUS AGENDAMENTOS ---- \n")
    for consulta in consultas:
        print(f"Numero da Consulta: {consulta['NumeroConsulta']}")
        print(f"Dr(a): {consulta['NomeDoutor']}")
        print(f"Data da Consulta: {consulta['Data']}")
        print(f"Especialidade: {consulta['Especialidade']}\n")

    input("Digite qualquer tecla para voltar: ")
    telemedicina()

def reagendarConsulta():
    limparTela()
    print(" ---- REAGENDAMENTOS ---- \n")

    for consulta in consultas:
        print(f"Numero da Consulta: {consulta['NumeroConsulta']}")
        print(f"Dr(a): {consulta['NomeDoutor']}")
        print(f"Data da Consulta: {consulta['Data']}")
        print(f"Especialidade: {consulta['Especialidade']}\n")

    selecaoConsulta = input('Digite o numero da consulta que você deseja reagendar: ')

    consultaEncontrada = None
    for consulta in consultas:
        if consulta['NumeroConsulta'] == selecaoConsulta:
            consultaEncontrada = consulta
            break
    
    if consultaEncontrada:
        print(f'Consulta de numero {consulta["NumeroConsulta"]} encontrada!')
        nova_data = input('\nDigite qual a data desejada(Siga o padrão "01/01/25 - 00h30"): ')

        consulta['Data'] = nova_data
        limparTela()
        print("Data alterada com sucesso!\n")
        input("Digite qualquer tecla para voltar: ")
        telemedicina()
    else: 
        limparTela
        print("\nNumero de consulta não encontrado")
        time.sleep(2)
        telemedicina()

def cancelarConsulta():
    print(" ---- CANCELAMENTOS ---- \n")

def duvidas():
    limparTela()
    print("Pau no seu cu kkkkk\n")
    input("Digite qualquer tecla para voltar: ")
    listaMenu()


def desligar():
    limparTela()
    print("Finalizando programa...")
    time.sleep(3)
    os.system('cls')

listaMenu()
