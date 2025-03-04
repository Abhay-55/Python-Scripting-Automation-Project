import random

while True : 
    top_of_number = input("Type a number: ")
    if top_of_number.isdigit() :
        top_of_number = int(top_of_number)
        if (top_of_number <= 0):
            print("Please enter a number larger than 0 next time.")
            continue
        else : break

    else :
        print("Please enter a number next time.")
        continue
    
random_number = random.randint(0, top_of_number)
guess = 0
while True :
    guess +=1
    print()
    user_guess = input("Make a guess: ")
    if user_guess.isdigit() :
        user_guess = int(user_guess)       

    else :
        print("Please enter a number next time.")
        continue
    
    if random_number == user_guess:
        print("You got it!")
        break
    else :
        print()
        if user_guess>random_number:
            print("You are above the number!")
        else : 
            print("You are below the number!")

print("You guess it in" , guess, (" guesses."))