// For Explanation read Solution.java

// Method 1
fn usingBitwiseOper(n: u32) -> bool{
    return (n & 1) == 0;
}

// Method 2
fn usingIntegerDivision(n: u32) -> bool {
    if (n / 2) * 2 == n {
        return true;
    }
    return false;
}

fn main() {
    
    println!("{}", usingBitwiseOper(0));
    println!("{}", usingBitwiseOper(1));
    println!("{}", usingBitwiseOper(4));
    println!("{}", usingBitwiseOper(99));

    // println!("{}", usingIntegerDivision(0));
    // println!("{}", usingIntegerDivision(1));
    // println!("{}", usingIntegerDivision(4));
    // println!("{}", usingIntegerDivision(99));

}
