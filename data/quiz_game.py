print("Welcome to my computer quiz!")

playing = input("Do you want to play? ")

if playing.lower() != "yes":
    quit()
    
print("okay? let's play :) ")
score = 0

answer = input("What does CPU stand for? ")
if answer.lower() == "central processing unit":
    print("Correct! ")
    score += 1
else:
    print("Incorrect!")    


answer = input("What does GPU stand for? ")
if answer.lower() == "graphics processing unit":
    print("Correct! ")
    score += 1
else:
    print("Incorrect!")
    

answer = input("What does RAM stand for? ")
if answer.lower() == "random access memory":
    print("Correct! ")
    score += 1
else:
    print("Incorrect!")
    

answer = input("What does PSU stand for? ")
if answer.lower() == "power supply unit":
    print("Correct! ")
    score += 1
else:
    print("Incorrect!")
    
answer = input("What does BIOS stand for? ")
if answer.lower() == "basic input/output system":
    print("Correct! ")
    score += 1
else:
    print("Incorrect!")
    

answer = input("What does USB stand for? ")
if answer.lower() == "universal serial bus":
    print("Correct! ")
    score += 1
else:
    print("Incorrect!")
    
answer = input("What does LAN stand for? ")
if answer.lower() == "local area network":
    print("Correct! ")
    score += 1
else:
    print("Incorrect!")

answer = input("What does PDF stand for? ")
if answer.lower() == "portable document format":
    print("Correct! ")
    score += 1
else:
    print("Incorrect!")

answer = input("What does URL stand for? ")
if answer.lower() == "uniform resource locator":
    print("Correct! ")
    score += 1
else:
    print("Incorrect!")

answer = input("What does SSD stand for? ")
if answer.lower() == "solid state drive":
    print("Correct! ")
    score += 1
else:
    print("Incorrect!")
    

print("You got " + str(score) + " questions correct!")
print("You got " + str((score/10)*100) +"%")
