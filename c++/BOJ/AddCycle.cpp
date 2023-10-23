#include <iostream>
using namespace std;

int main() {

	int count = 0;
	int N;
	cin >> N;
	int cN = N;

	while (true) {
		if (cN >= 0 && cN < 10) {
			cN = cN * 10 + cN;
			count++;
		}
		else {
			cN = cN % 10 * 10 + (cN % 10 + cN / 10)%10;
			count++;
		}
		if (N == cN)
			break;
	}
	cout << count;

	return 0;
}