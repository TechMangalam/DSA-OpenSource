dict = {}
    for word in magazine:
        dict[word] = dict.get(word,0) + 1
    for word in note:
        if dict.get(word,0) == 0:
            print('No')
            return
        else:
            dict[word] -= 1
    print('Yes')
