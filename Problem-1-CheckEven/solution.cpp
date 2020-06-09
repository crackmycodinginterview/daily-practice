// For Explanation read Solution.java
#include<iostream>
using namespace std;

// Method 1
bool usingBitwiseOper(int n) {
    return (n & 1) == 0;
}

// Method 2
bool usingIntegerDivision(int n) {
    if((n / 2) * 2 == n) {
        return true;
    }
    return false;
}

int main() {
        
    cout << (usingBitwiseOper(0) ? "true" : "false") << endl;
    cout << (usingBitwiseOper(1) ? "true" : "false") << endl;
    cout << (usingBitwiseOper(4) ? "true" : "false") << endl;
    cout << (usingBitwiseOper(99) ? "true" : "false") << endl;

    // cout << usingIntegerDivision(0) ? "true" : "false" << endl;
    // cout << usingIntegerDivision(1) ? "true" : "false" << endl;
    // cout << usingIntegerDivision(4) ? "true" : "false" << endl;
    // cout << usingIntegerDivision(99) ? "true" : "false" << endl;

    return 0;
}
