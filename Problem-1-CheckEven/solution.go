// For Explanation read Solution.java
package main  
 
import "fmt"

// Method 1
func usingBitwiseOper(n int) bool{
    return (n & 1) == 0;
}

// Method 2
func usingIntegerDivision(n int) bool{
    if((n / 2) * 2 == n) {
        return true;
    }
    return false;
}

func main() {

	fmt.Println(usingBitwiseOper(0));
	fmt.Println(usingBitwiseOper(1));
	fmt.Println(usingBitwiseOper(4));
	fmt.Println(usingBitwiseOper(99));

	// fmt.Println(usingIntegerDivision(0));
	// fmt.Println(usingIntegerDivision(1));
	// fmt.Println(usingIntegerDivision(4));
	// fmt.Println(usingIntegerDivision(99));
}