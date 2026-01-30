import pytest


@pytest.mark.parametrize('earned,spent,expected',[(30,10,20),(20,2,18)])
def test_expected(wallet,earned,spent,expected):
    assert wallet+(earned-spent) == expected