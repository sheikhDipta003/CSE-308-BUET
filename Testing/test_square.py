import math
import pytest

@pytest.mark.xfail
@pytest.mark.square
def test_sqrt():
   num = 25
   assert math.sqrt(num) == 5

@pytest.mark.xfail
@pytest.mark.square
def testsquare():
   num = 7
   assert 7*7 == 40

@pytest.mark.skip
@pytest.mark.others
def tesequality():
   assert 10 == 11