import numpy as np
import pandas as pd

def print_hi(name):
    print(f'Hi, {name}')



if __name__ == "__main__":
    s = pd.Series([1,3,5,np.nan, 6,8])
    print_hi('Wise')
    print(s)