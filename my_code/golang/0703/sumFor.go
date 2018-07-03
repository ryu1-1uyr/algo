package main

import "fmt"

func main() {
	var sum , input int

	fmt.Println("1からnまでの和")
	fmt.Println("nの値")
	fmt.Scan(&input)

	for i:=1;i<=input;i++ {
		sum += i
	}
	fmt.Println(sum)

}
