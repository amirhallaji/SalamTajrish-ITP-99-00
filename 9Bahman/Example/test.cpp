#include <iostream>

using namespace std;

void swap(int &a, int &b){
    int temp = a;
    a = b;
    b = temp;
}
int main (){
    int a, b;
    cin >> a >> b;
    swap(a, b);
    cout << "a: " << a << endl << "b: " << b << endl;
    
    return 0;
}