# For Explanation read Solution.java

# Method 1
def usingBitwiseOper(n):
    return not bool(n & 1)


# Method 2
def usingIntegerDivision(n):
    if((n // 2) * 2 == n):
        return True
    return False


        
print(usingBitwiseOper(0))
print(usingBitwiseOper(1))
print(usingBitwiseOper(4))
print(usingBitwiseOper(99))

# print(usingIntegerDivision(0))
# print(usingIntegerDivision(1))
# print(usingIntegerDivision(4))
# print(usingIntegerDivision(99))
