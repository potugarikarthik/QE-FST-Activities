import pytest
@pytest.fixture
def nums_from_one_to_10():
    num_list = [0,1,2,3,4,5,6,7,8,9,10]
    return num_list

@pytest.fixture
def wallet():
    amount = 0
    return amount