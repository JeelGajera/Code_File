echo "Enter Number: "
read num
i=1
while [ $i -le 10 ]
do
	echo " $num X $i = $(( num * i )) "
	i=$((i+1))
done
