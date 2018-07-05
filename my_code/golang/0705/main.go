package main

import "fmt"



func isLeap(year int) int {
	if year % 4 == 0 && year % 100 != 0 || year % 400 == 0 {
		return 1
	} else {
		return 0
	}
}

func leftDayOfYear(y int , m int , d int) int {
	var days int = d

	mdays := [][]int{{31,28,31,30,31,30,31,31,30,31,30,31},{31,29,31,30,31,30,31,31,30,31,30,31}}

	for i:=1;i<m;i++ {
		days+= mdays[isLeap(y)][i-1]
	}

	return (365 + isLeap(y)) - days
}

func main() {
	var y,m,d int
	fmt.Println("y?")
	fmt.Scan(&y)
	fmt.Println("m?")
	fmt.Scan(&m)
	fmt.Println("d?")
	fmt.Scan(&d)

	fmt.Println(leftDayOfYear(y,m,d))


}
