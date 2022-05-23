a=0
while [ $a -lt 6 ]
do
echo "<!|---- Menu ----|!>
1. Display calendar o current month
2. Display today's date & time
3. Display usename who currently loged in
4. Display your name at given x,y position
5. Display your terminal number
6. Exit"
read a
case "$a" in
	1) cal;;
	2) date;;
	3) uname;;
	4) tput cup 200 150
		echo "Jeel";;
	5) pwd;;
esac
done
