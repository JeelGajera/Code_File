echo "Enter the range for fibonacci series"
read rng
i=3
n1=1
n2=1
echo "Fibonacci Series upto $rng term:
$n1
$n2"
while [ $i -le $rng ] 
do 
	sum=$(expr $n1 + $n2)
	echo "$sum"
	n1=$n2
	n2=$sum
	i=$(expr $i + 1)
done
