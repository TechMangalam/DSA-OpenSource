def circularArrayRotation(a, k, queries):
    result = []
    k= k % n
    for q in queries:
        result.append(a[(n-k+q)%n])
    return result
