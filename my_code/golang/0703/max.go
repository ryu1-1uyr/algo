package main

import "fmt"



func main() {

	var a,b,c int

	fmt.Println("input number1 >")
	fmt.Scan(&a)

	fmt.Println("input number2 >")
	fmt.Scan(&b)

	fmt.Println("input number3 >")
	fmt.Scan(&c)

	max := a

	if b > max {
	max = b
	}
	if c > max {
	max = c
	}

	fmt.Println("最大値は",max)

}
