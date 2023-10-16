#include <iostream>
#include <string>
#include <cstring>
using namespace std;

int main() {

	string str="";
	int count;
	char array[50];

	cin >> count;
	cin >> str;

	for (int i = 0; i < str.length(); i++)
		array[i] = str[i];

	if (count == 1)
		cout << str;
	else {
		for (int i = 1; i < count; i++) {
			cin >> str;

			for (int j = 0; j < str.length(); j++) {
				if (array[j] != str[j])
					array[j] = '?';
			}
		}
		for (int i = 0; i < str.length(); i++)
			cout << array[i];
	}


	return 0;
}
