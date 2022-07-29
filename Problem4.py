
dict = {}
list = [1,2,8,9,12,46,76,82,15,20,30]
for i in range(1,10):
    count=0
    for j in list:
        if(j%i==0):
           count+=1
    dict[i]=count
print(dict)
