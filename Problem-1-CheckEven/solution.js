// For Explanation read Solution.java

// Method 1
function usingBitwiseOper(n) {
    return (n & 1) == 0;
}

// Method 2
function usingIntegerDivision(n) {
    if((n / 2) * 2 == n) {
        return true;
    }
    return false;
}

console.log(usingBitwiseOper(0));
console.log(usingBitwiseOper(1));
console.log(usingBitwiseOper(4));
console.log(usingBitwiseOper(99));

// console.log(usingIntegerDivision(0));
// console.log(usingIntegerDivision(1));
// console.log(usingIntegerDivision(4));
// console.log(usingIntegerDivision(99));
