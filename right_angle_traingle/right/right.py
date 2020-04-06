from __future__ import print_function
def printSpaces(num):
    for x in range(g):
        print (" ",end='')
def printRepeatedValues(num,repeation):
    toPrint=''
    for x in range(repeation):
        toPrint = toPrint + str(num) +' '
        #print(num, end=' ')
    print(toPrint);
g = int(raw_input("Enter a number: ") )
copy  = g
if(g>9):
    print("Current program cannot print more than 9 ,please wiat for the update")
    exit()
spaces = g-1; 
for x in range(g):
    printSpaces(spaces)
    printRepeatedValues(x+1,x+1)
    copy = copy -1 
    print("spaces are ",spaces)
    spaces = spaces - 1 
    

