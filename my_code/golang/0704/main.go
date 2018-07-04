package main

import "fmt"

func Pira(nums int) int {

	for i := 0;i<=nums;i++ {
		var output = ""
		for o:=0;o<nums-i;o++ {
			output = output + " "
		}
		for o:=0 ; o < (i-1) * 2 +1 ; o++ {
			output = output + "*"
		}
		fmt.Println(output)

	}


	return 0
}

func main() {
	print("a")
	Pira(3)
	print("b")
}
