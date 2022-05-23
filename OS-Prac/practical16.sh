echo "Enter Day:" 
read DD
echo "Enter Month:"
read MM
echo "Enter Year:"
read YY
if [ $mm -le 0 ] || [ $mm -gt 12 ] 
then 
	echo "Date Invalid"
fi
days=0
case $MM in
	1) days=31;;
	2) days=28;;
	3) days=31;;
	4) days=30;;
	5) days=31;;
	6) days=30;;
	7) days=31;;
	8) days=31;;
	9) days=30;;
	10) days=31;;
	11) days=30;;
	12) days=31;;
	*) days=1;;
esac
if [ $MM -eq 2 ]
then 
	if [ $((YY % 4)) -eq 0 ]
	then
		days=29
	fi
fi
if [ $DD -le 0 ] || [ $DD -gt $days ]
then
	echo "Date Invalid"
else 
	echo "$DD-$MM-$YY is Valid Date"
fi










