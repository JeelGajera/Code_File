echo "Enter Number :"
read num
b=$(echo "obase=2;$num" | bc)
echo "binary : $b"
o=$(echo "obase=8;$num" | bc)
echo "Octal : $o"
h=$(echo "obase=16;$num" | bc)
echo "Hex : $h"
