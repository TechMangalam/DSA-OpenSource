def minimumLoss(price):
    d={}
    for f,p in enumerate(price):
        d[p] = f
    price.sort()
    min_value = sys.maxsize
    
    for i in range(1, len(price)):
        if d[price[i-1]]> d[price[i]]:
            min_value = min(min_value,price[i]-price[i-1])
    return min_value  
