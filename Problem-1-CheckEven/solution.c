// For Explanation read Solution.java
#include<stdio.h>

// Method 1
int usingBitwiseOper(int n) {
    if((n & 1) == 0) {
        return 1;
    }
    return 0;
}

// Method 2
int usingIntegerDivision(int n) {
    if((n / 2) * 2 == n) {
        return 1;
    }
    return 0;
}

int main() {

    printf("%s\n", usingBitwiseOper(0) ? "true" : "false");
    printf("%s\n", usingBitwiseOper(1) ? "true" : "false");
    printf("%s\n", usingBitwiseOper(4) ? "true" : "false");
    printf("%s\n", usingBitwiseOper(99) ? "true" : "false");

    // printf("%s\n", usingIntegerDivision(0) ? "true" : "false");
    // printf("%s\n", usingIntegerDivision(1) ? "true" : "false");
    // printf("%s\n", usingIntegerDivision(4) ? "true" : "false");
    // printf("%s\n", usingIntegerDivision(99) ? "true" : "false");
    return 0;
}
