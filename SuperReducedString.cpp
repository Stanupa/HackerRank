/*
  Steve has a string S, consisting of N lowercase English alphabetic letters. In one operation, he can delete any pair of 
  adjacent letters with same value. For example, the string "aabcc" would become either "aab" or "bcc" after operation.
  Steve wants to reduce S as much as possible. To do this, he will repeat the above operation as many times as it can be performed. 
  Help Steve out by finding and printing S's non-reducible form!
  Note: If the final string is empty, print "Empty String".

  Input Format:
  A single string, S.
*/

#include <bits/stdc++.h>
using namespace std;

string super_reduced_string(string s){
    if (s.compare("") == 0)
    {
        return "Empty String";   
    }

    bool erased = false;
    for (int i = 0; i < s.length() - 1; i++)
    {
        if (s[i] == s[i+1])
        {
            s.erase(s.begin() + i, s.begin() + i + 2);
            erased = true;
            if (erased)
            {
                return super_reduced_string(s);
            }
        }
    }
    return s;
}

int main() {
    string s;
    cin >> s;
    string result = super_reduced_string(s);
    cout << result << endl;
    return 0;
}
