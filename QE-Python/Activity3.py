P1= input("Enter player 1 choice")
P2 = input("Enter player 2 choice")
if (P1 == "rock" and P2 == "scissor") or  (P1 == "scissor" and P2 == "paper") or (P1 == "paper" and P2 == "rock") :
    print("player 1 win")
elif (P1 == "rock" and P2 == "paper") or (P1 == "paper" and P2 == "scissor") or (P1 == "scissor" and P2 == "rock") :
    print("player 2 win")
else :
    print("draw")