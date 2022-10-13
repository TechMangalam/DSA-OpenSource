def icecreamParlor(m, arr):
    n = len(arr)
    result=[]
    s=0
    for i in range(n-1, 0,-1):
        if arr[i]<m:
            for j in range(i):
                temp = arr[i] + arr[j]
                if temp ==m:
                    result=[j+1, i+1]
                    break
    return result
#end
