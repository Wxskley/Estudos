from tkinter import *
janela = Tk()
janela.title("Tela Simples")
janela.geometry("400x500")
texto = Label(text="Seu Programa", font=("Arial Black", 15)).pack(pady=25)
campo_texto = Entry().pack(pady=20)
botao = Button(text="Confirmar").pack()
janela.mainloop()
