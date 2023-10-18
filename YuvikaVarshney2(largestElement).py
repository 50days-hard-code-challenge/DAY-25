def largestElement(arr: [], n: int) -> int:

    # Write your code from here.
    l=arr[0]
    for i in arr:
        if i>l:
            l=i
    return l
    """
    A higher time complexity solution
    arr.sort()
    return arr[n-1]"""
    pass
