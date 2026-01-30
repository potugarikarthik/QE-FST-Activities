import math,pytest
num1 = 20
num2 = 30

def sum(num, num0):
    return num+num0

@pytest.mark.group1
def test_sum():
    assert sum(num1,num2) == 50

def sub(num, num0):
    return num-num0

@pytest.mark.group1
def test_sub():
    assert sub(num1,num2) == -10

def product(num, num0):
    return num*num0

@pytest.mark.group2
def test_product():
    assert product(num1, num2)== 600

def quo(num,num0):
    return num/num0

@pytest.mark.group2
def test_quo():
    assert quo(num1,num2) == 40
