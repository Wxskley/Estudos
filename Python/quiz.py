print("Seja muito bem vindo ao quiz do Weskley!")
answer_user = input("Quer começar? (S/N) ")
if answer_user != "s":
    quit()
score = 0
print("Começando...")
# Abre Bloco de Pergunta
print("Quem desenvolveu o jogo Grand Theft Auto (GTA)? \n (A) Rockstar Games \n (B) Ubisoft \n (C) Activision \n (D) EA \n")
answer_1 = input("Resposta: ")
if answer_1 == "A":
    print("Correto!")
    score = score + 1
else:
    print("Incorreto!")
# Fecha bloco de pergunta
print(f"Quiz acabou... Pontuação: {score}")