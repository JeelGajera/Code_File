echo "Enter number to find factorial"
read num
fact=1
while [ $num -ge 1 ]
do
	fact=$(expr $fact \* $num)
	num=$((num -1))
done
echo "Factorial is : $fact"

