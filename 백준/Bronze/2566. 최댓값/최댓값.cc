#include <iostream>

using namespace std;

int n, x, y;
int maxNum = -1;


int main() {

	for (int i = 1; i <= 9; i++) {
		for (int j = 1; j <= 9; j++) {
			cin >> n;

			if (maxNum<= n) {
				maxNum= n;
				x = i;
				y = j;
			}
		}
	}

	cout << maxNum<< "\n";
	cout << x << " " << y;

	return 0;
}