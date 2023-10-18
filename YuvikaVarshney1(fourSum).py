def fourSum(arr: [int], target: int) -> [[int]]:
    # Write your code from here.
    n=len(arr)
    arr.sort()
    ans=[]
    for i in range(len(arr)):
        if i>0 and arr[i]==arr[i-1]:
            continue
        for j in range(i+1,len(arr)):
            if j>i+1 and arr[j]==arr[j-1]:
                continue
            
            k=j+1
            l=n-1
            while(k<l):
                x=arr[i]+arr[j]+arr[k]+arr[l]
                if(x==target):
                    b=[arr[i],arr[j],arr[k],arr[l]]
                    ans.append(b)
                    k=k+1
                    l=l-1
                    while k<l and arr[k]==arr[k-1]:
                        k=k+1
                    while k<l and arr[l]==arr[l+1]:
                        l=l-1
                    
                elif x<target:
                    k=k+1
                elif x>target:
                    l=l-1
    return ans
