echo -n "Enter yuor name: "
read name
echo "$name" > cat > file
awk '{ print toupper($0) }' file
