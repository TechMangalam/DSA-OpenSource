def superStack(operations):

    s1=[]
    s2=[]
    global i
    i=0

    def push(x):
        global i
        s1.append([int(x),0])
        i+=1

    def pop():
        global i
        if s1[-1][1]!=0 and i>1:
            s1[-2][1]+=s1[-1][1]
        s1.pop()
        i-=1

    def inc(x,v):
        global i
        x=int(x)
        v=int(v)
        if i == x:
            s1[i-1][1]+=v
        elif x<i:
            while i!=x:
                s2.append(s1[i-1])
                s1.pop()
                i-=1
            s1[i-1][1]+=v
            while len(s2)!=0:
                s1.append(s2[-1])
                s2.pop()
                i+=1

    for item in operations:
        lst=item.split()
        if lst[0]=="push":
            push(lst[1])
        elif lst[0]=="pop":
            if i!=0:
                pop()
        elif lst[0]=="inc":
            inc(lst[1],lst[2])
        if i!=0:
            print(sum(s1[-1]))
        else:
            print("EMPTY")

        
    
if _name_ == "_main_":
    operations_cnt = 0
    operations_cnt = int(input())
    operations_i = 0
    operations = []
    while operations_i < operations_cnt:
        try:
            operations_item = str(input())
        except:
            operations_item = None
        operations.append(operations_item)
        operations_i += 1


    res = superStack(operations);
