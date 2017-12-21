/*
  You will be given a list of 32 bits unsigned integers. You are required to output the list of the unsigned integers you get by flipping bits in its binary representation (i.e. unset bits must be set, and set bits must be unset).
  Input Format:
  The first line of the input contains the list size , which is followed by  lines, each line having an integer from the list.
*/

#include<stdlib.h>
#include<iostream>
using namespace std;

int main(int argc, char** argv) {
    size_t length = 0;
    cin >> length;
    if (length == 0)
    {
        return 0;
    }
    
    unsigned int buffer = 0;
    for (int i = 0; i < length; i++)
    {
        cin >> buffer;
        buffer = ~buffer;
        cout << buffer << endl;
    }
    return 0;
}
