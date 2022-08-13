sum = 0                                                 
count = 1                                              
while(True):                                            
    num = int(input('Enter number %d: '%count))         
    if (num < 0):                                       
        break                                           
    sum+=num                                            
    count+=1                                            
print('Summation is %d'%sum)      