def robocito(array):
    cord=[0,0]
    if len(array)==0:return cord
    pos=1
    char="+"
    for i in array:
        if char=="+":
            cord[pos]+=i
        else:
            cord[pos]-=i
        if char=="+" and pos==1:
            char="-"
        elif char=="-" and pos==1:
            char="+"
        pos-=2*pos-1
    return cord