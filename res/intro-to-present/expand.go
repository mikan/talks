package main

import (
	"fmt"
	"regexp"
)

func main() {
	text := "1 $foo 2 $bar 3 $baz 4"
	fmt.Printf("input:  %s\n", text)
	fmt.Printf("putput: %s\n", expand(text, func(s string) string { return "[" + s + "]" }))
}

func expand(s string, f func(string) string) string {
	r := regexp.MustCompile(`\$\w+`)
	return r.ReplaceAllStringFunc(s, func(s string) string { return f(s[1:]) })
}
