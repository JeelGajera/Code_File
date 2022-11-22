# =======>prac1
str1 = input("Enter string1: ")
str2 = input("Enter string2: ")
print(f"String1: {str1}\nString2: {str2}")

# =======>prac2
import datetime
import calendar

cal = calendar.TextCalendar(firstweekday=0)
b = input("Enter DOB dd/mm/yyyy:- ")
b_day = b.split('/')[0]
b_month = b.split('/')[1]
b_year = b.split('/')[2]
t_d = datetime.date.today()
def age_claculate():
    age = t_d.year - int(b_year)
    print(age, 'years')
    cal.formatmonth(int(b_year), int(b_month), w=0, l=0)
    cal.prmonth(int(b_year), int(b_month), w=0, l=0)
age_claculate()

# =======>prac3
dec = int(input("Enter decimal numbers:- "))
print("Binary value:-- ", bin(dec))
print("Hex value:-- ", hex(dec))
print("Octal value:-- ", oct(dec))

def binaryFunc(dec):
    binary, ctr = (0,0)
    temp = dec
    while(temp > 0):
        binary = ((temp%2)*(10**ctr)) + binary
        temp = int(temp/2)
        ctr += 1
    return binary
print("without built-in func: ",binaryFunc(dec))

# =======>prac4
choice = 0
num1, num2 = map(int, input("Enter two number:- ").split())
while (True and choice<5) :
    print("1. Sum\n2. Subtraction\n3. Multiplication\n4. Division")
    choice = int(input("Enter Choice:- "))
    if (5>choice >= 0):
        match choice:
            case 1:
                print("Sum:- ", num1+num2)
            case 2:
                print("Subtraction:- ", num1-num2)
            case 3:
                print("Multiplication:- ", num1*num2)
            case 4:
                print("Division:- ", num1/num2)
            case 5:
                print("Exit Calculator....")
                break

# =======> prac5
num_list = list(map(int, input("Enter numbers:- ").split()))
even_list = []
odd_list = []
for i in num_list:
    if i%2 == 0:
        even_list.append(i)
    else:
        odd_list.append(i)
print("Large even, odd numbers:- ", max(even_list), ",", max(odd_list))
print("Number of even, odd numbers:- ", len(even_list), ",", len(odd_list))

# =======> prac6
num = input("Enter Number:- ")
temp_num = str(num)
sum = 0
for i in temp_num:
    sum += int(i)**len(temp_num)
if sum == int(num):
    print("Number is Armstrong")
else:
    print("Number is not Armstrong")

# =======> prac7
str = input("Enter String:- ")
alpha = "abcdefghijklmnopqrstuvwxyz"
for i in str:
    if i in alpha:
        alpha = alpha.replace(i, "")
if len(alpha) == 0:
    print("String is pangram")
else:
    print("String is not pangram")

# =======> prac8
def factorial(num):
    fact = 0
    if num == 1 or num == 0:
        return 1
    else:
        fact = num * factorial(num-1)
        return fact
num = int(input("Enter Number:- "))
print(f"{num}! =",factorial(num))

# =======> prac9
num1, num2 = map(int, input("Enter two number:- ").split())
def gcd(num1, num2):
    if num2 == 0:
        return num1
    else:
        return gcd(num2, num1%num2)

def hcf(num1, num2):
    return (num1*num2)/gcd(num1, num2)

print("GCD:- ", gcd(num1, num2))
print("HCF:- ", hcf(num1, num2))

# =======> prac10
file_path = 'J:\Study Material\sem5\PDS\Python\Practical\LabManual\data\pdsWord.txt'
line_count = 0
line_with_pds = 0
with open(file_path, 'r') as f:
    for line in f:
        line_count += 1
        if ("PDS" or "pds") in (line.split()[0]):
            line_with_pds += 1
print("Total line in file:- ", line_count)
print("Total line start with PDS:- ", line_with_pds)

# =======> prac11
element_list = [11, 10, 3, 12, 11, 4, 3, 8, 10, 3, 5, 0, 7, 4, 9, 3]
elm = 3
count = 0
for i in element_list:
    if i == elm: count += 1
print(elm, " : ", count, "times")

# =======> prac12
element_list = [[5,4,9],[3,8,2],[1,6,7]]
for i in range(len(element_list[0])):
    sort = sorted(element_list, key = lambda x: x[i])
    print("sorted list to colum {}, {}".format(i+1,sort))

# =======> prac13
element_list = [11, 10, 3, 12, 11, 4, 3, 8, 10, 5, 0, 7, 4, 9, 3]
def getDuplicates(list):
   for i in list:
        if list.count(i)>1:
            print("Element {} accurs {} times".format(i, list.count(i)))
            while(list.count(i)>1):
                list.remove(i)
getDuplicates(element_list)

# =======> prac14
stud_marks = []
for i in range(1,6):
    mark = input("Enter Student {} marks: ".format(i))
    stud_marks.append(mark)
print(tuple(stud_marks))

# =======> prac15
enroll_set = {1002,1005,1006,1004,1001,1008,1003}
print("Sorted:", sorted(enroll_set))
enroll_set.add(1007)
enroll_set.add(1009)
enroll_set.add(1010)
print("Adding:", enroll_set)
enroll_set.discard(1001)
print("Deleting:", enroll_set)

# =======> prac16
set_a = {12, "ldce", "jeel", 34, 1}
set_b = {34, "jeel", "nirma", 2110}
uni_set = set_a.union(set_b)
int_set = set_a.intersection(set_b)
dif_set = set_a.difference(set_b)
sym_dif_set = set_a.symmetric_difference(set_b)
print(f"Union: {uni_set}\nIntersection: {int_set}\nDifference: {dif_set}\nSymmetric Difference: {sym_dif_set}")

# =======> prac17
stud_detail = { "name": "Jeel", "lastname": "Gajera", "branch": "Computer", "subject": "PDS", "sub_code": 3150713, "number": 900000009 }
stud_detail['number'] = 9900990099
stud_detail['email'] = "jeel@mail.com"
print(stud_detail.get('lastname'))
print(stud_detail.keys())
print(stud_detail.values())
print(stud_detail.items())

# =======> prac18
str = "COMPUTERENGINEERING"
char_count = {}
for i in str:
    char_count[i] = str.count(i)
print(char_count)

# =======> prac19
marks = { "PDS": 29, "CN": 27, "SE": 24, "ADA": 25, "PE": 26, "IPDC": 30 }
print(sorted(marks, key = lambda i : marks[i], reverse = True))

# =======> prac20
std_list = [
    {
        "name": "Jeel",
        "spi": 8.5,
    },
    {
        "name": "Dishant",
        "spi": 9.2,
    },
    {
        "name": "Jay",
        "spi": 8.7,
    },
    {
        "name": "Jon",
        "spi": 8.1,
    },
    {
        "name": "Due",
        "spi": 8.9,
    }
]
std_list = sorted(std_list, key = lambda i : i['spi'])
for i in std_list:
    print(i['name'], end=" ")