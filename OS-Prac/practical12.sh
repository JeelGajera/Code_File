echo "<!|---- Executable Files ----|!>"
for file in *
do
	if [ -f $file ]
	then 
		echo "$file"
	fi
done
echo "<!|---- Directories ----|!>"
for d in */
do
	echo "$d"
done
echo "<!|---- Zero Size Files ----|!>"
find -size 0
