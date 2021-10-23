def processLogs(logs, maxSpan):
    signin={}
    signout={}
    lst1=[]
    lst2=[]
    for ele in logs:
        ID,timeS,action=ele.split()
        ID=int(ID)
        time=int(timeS)
        if action == "sign-in":
            signin[ID]=time
        else:
            signout[ID]=time
    for ele in signin:
        if ele in signout:
            if signout[ele]-signin[ele]<=maxSpan:
                lst1.append(ele)
    lst1.sort()
    for i in lst1:
        lst2.append(str(i))
    return lst2
