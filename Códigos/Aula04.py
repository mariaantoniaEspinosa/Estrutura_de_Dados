from clima import Clima

lista = []
nome_base = "base.csv"

try:

    leitor = open(nome_base, "r", encoding="utf-8")

    for linha in leitor:
        dados_linha = linha.split(",")
        obj_clima = Clima(dados_linha[0], dados_linha[1], dados_linha[2], dados_linha[3])

        if obj_clima not in lista:
            lista.append(obj_clima)


    for item in lista:
        print(item, end=" ")

    leitor.close()
except Exception as e:
    print("Ocorreu algum erro", e)
