#include <iostream>
#include <algorithm>
#include <string>
#include <math.h>
#include <vector>
using namespace std;

int main() {

	int count, divisor;
	cin >> count;
	int answer = 0;

	vector<int> array;

	for (int i = 0; i < count; i++) {
		cin >> divisor;
		array.push_back(divisor);

	}
	sort(array.begin(), array.end());

	if (count == 1)
		answer = pow(array[0], 2);
	else {
		answer = array[0] * array[count - 1];
	}

	cout << answer;

	return 0;
}