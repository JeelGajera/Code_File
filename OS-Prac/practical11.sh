n=("$@")
len=${#n[@]}
echo "Length of Array : $len"
echo "Numbe in Array "
for (( i=0; i<$len; i++ ))
do
	echo "${n[$i]}"
done
for(( i=0; i<$len; i++ ))
do
	for (( j=$i; j<$len; j++ ))
	do
		if [ ${n[$i]} -lt ${n[$j]} ]
		then 
			t=${n[$i]}
			n[$i]=${n[$j]}
			n[$j]=$t
		fi
	done
done
echo "Sorted Numbers :"
for(( i=0; i<$len; i++ ))
do
	echo "${n[$i]}"
done
