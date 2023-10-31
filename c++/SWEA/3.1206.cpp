#include <iostream> 
#include <algorithm>
#include <vector>
using namespace std;

int main(int argc, char** argv) {
	int test_case;
	int T=10;

	for (test_case = 1; test_case <= T; ++test_case) {
		int num;
		cin >> num;
		vector<int> v;
		int count = 0;

		for (int i = 0; i < num; i++) {
			int height;
			cin >> height;
			v.push_back(height);
		}
		for (int i = 2; i < num - 2; i++) {
			int maxr = max({ v[i - 2], v[i - 1],v[i + 2],v[i + 1] });

			if (v[i] > maxr)
				count += v[i] - maxr;
		}

		cout << "#" << test_case << " " << count << endl;

	}

	return 0;
}