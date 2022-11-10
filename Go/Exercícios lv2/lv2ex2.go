package main

import "fmt"

func main() {
	a := 3 == 30
	b := 3 != 30
	c := 3 <= 30
	d := 3 < 30
	e := 3 >= 30
	f := 3 > 30

	fmt.Printf("%v\n%v\n%v\n%v\n%v\n%v\n", a, b, c, d, e, f)
}