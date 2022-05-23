a=0
while [ $a -lt 6 ]
do
echo "<!|---- Operations ----|!>
1. List Directory
2. Copy File
3. Rename a File
4. Delete File
5. Edit a File
6. Exit"
read a
case "$a" in
	1) ls;;
	2) echo -a "Enter File Name:"
  	    read file
	    cp $file ./copy.txt
		echo "Coping Completed"
		;;
	3) echo -a "Enter old name:"
		read oldName
		echo -a "Enter new name:"
		read newName
		mv $oldName $newName
		echo "Successfully renamed"
		;;
	4) echo -a "Enter File name:"
		read file
		rm $file
		echo "Successfully Deleted"
		;;
	5) echo -a "Enter File name:"
		read file
		echo "Typ text & Ctrl+c for stop:"
		cat >> $file
		echo "Successfully file edited"
		;;
esac
done	
