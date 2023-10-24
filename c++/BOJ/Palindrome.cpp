#include <iostream>
#include <string>
#include <stdio.h>
using namespace std;

int main() {

	string str;

	while(true) {

		cin >> str;

		if (str == "0")
			break;

		if (str.length() < 2) {
			cout << "no\n";

		}
		else {
			for (int i = 0; i < str.length() / 2; i++) {
				
				if (str[i] == str[str.length() - i - 1]) {
					
					if (i == (int)(str.length() / 2) - 1) {
						cout << "yes\n";
						break;
					}
					else {
						continue;
					}
				}
				else {
					cout << "no\n";
					break;
				}
			}
		}
	}
	


	return 0;
}