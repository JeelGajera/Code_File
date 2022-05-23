echo "Enter Number-1"
read num1
echo "Enter Number-2"
read num2
i=0
while [ $i != 5 ]
do
echo "Operations
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Exit
Choose your option to enter corresponding value"
read i
	case "$i" in
		1) echo "sum = $((num1 + num2))"
		   ;;
		2) echo "sub = $((num1 - num2))"
		   ;;
		3) echo "mul = $((num1 * num2))"
		   ;;
		4) echo "div = $((num1 / num2))"
		   ;;
esac
done
