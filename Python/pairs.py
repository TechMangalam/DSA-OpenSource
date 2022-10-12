def pairs(k, arr):
    freq=dict()
    count=0
    for i in arr:
        freq[i]=freq.get(i,0)+1
    for i in arr:
        if (k+i) in freq:
            count+=1
    return count
