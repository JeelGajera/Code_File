echo "Enter Marks Out of 30"
echo "Enter marks for subject-1"
read mrk1
echo "Enter marks for subject-2"
read mrk2
echo "Enter marks for subject-3"
read mrk3
total=$(expr "$mrk1"  + "$mrk2" + "$mrk3")
echo "Total = $total"
per=$(expr "$total" \* 10 / 9)
echo "Percentage = $per"
if [ $per -ge 60 ]
then
	echo "You got Distinction"

elif [ $per -ge 50 ]
then
	echo "You got First class"

elif [ $per -ge 40 ] 
then
	echo "You got Second class"

else 
	echo "Sorry Failed! Better luck next time :)"
fi

