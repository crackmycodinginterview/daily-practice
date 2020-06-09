
# Method 1 - Brute Force (Time - O((n+m) * log(n+m)), Space - O(m + n))
def mergeList(a, b):
    a.extend(b)
    a.sort()
    return list(set(a))


a = [5, 3, 6, 2, 6, 2, 3]
b = [8, 5, 3, 7, 2, 1]

c = mergeList(a, b)

print(c)