name = input("Type your name : ")

print("Welcome",name,"to this adventure!")

answer = input("You are on a dirt road, it has com to an end and you can go left or right. Which way do you want to go? ")

if answer.lower() == 'left':
    answer = input("You come to a river, you can walk around it or you can swim across it. Type walk to walk aroutn or swim to swim across: ").lower()
    if answer == 'walk':
        print("You walked for many miles and ran out of water and you lost the game.")   
    elif answer == 'swim':
        print("You swam across it and were eaten by alligator. You lost!")        
    else : 
        print("Not a valid option. You lost! ")
    
    
    
elif answer.lower() == 'right':
    answer = input("You come to a bridge, It looks wobbly, do you want to cross it or head back?(cross/back): ").lower()
    
    if answer == 'back':
        print("You go back and lose.")        
    elif answer == 'cross':
        answer = input("You cross the bridge and meet a stanger. Do you want to talk to him (Yes/No): ").lower()
        if answer == 'no':
            print("You ignore the stanger and they are offenden and you lost.")
        
        elif answer == 'yes':
            print("you talk to them and they give you gold and tou WIN!")
        
        else : 
            print("Not a valid option. You lost! ")    
    else : 
        print("Not a valid option. You lost! ")



else : 
    print("Not a valid option. You lost! ")

print("Thank ypu for trying,",name)