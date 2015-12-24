//Funny String The string S is funny if the condition |Si?Si?1|=|Ri?Ri?1| is true for every i from 1 to N?1. And R is the reversed string.
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
char* reverseString(char *a){
	int i = 0, j = 0;
	while (*(a + i) != '\0'){
		i++;
	}
	
	j = i-1;
	i = 0;
	while (i <= j){
		char temp = *(a + i);
		*(a + i) = *(a + j);
		*(a + j) = temp;
		i++;
		j--;
	}
	
	return a;
}
void isFunny(char *a, char *b){
	int flag = 0;
	int i = 0;
	int diff1, diff2;
	while (*(a+i+1)!='\0'){
		if ((int(*(a + i + 1)) - int(*(a + i))) > 0){
			diff1 = (int(*(a + i + 1)) - int(*(a + i)));
		}
		else
		{
			 diff1 = (int(*(a + i)) - int(*(a + i + 1)));
		}
		if ((int(*(b + i + 1)) - int(*(b + i))) > 0){
			 diff2 = (int(*(b + i + 1)) - int(*(b + i)));
		}
		else
		{
			 diff2 = (int(*(b + i)) - int(*(b + i + 1)));
		}
		if (diff1 == diff2){
			i++;
		}
		else{
			flag = 1;
			cout << "Not Funny";
			break;
		}
	}
	if (flag == 0){
		cout << "Funy";
	}
}
int main() {
	char a[100000], b[10000];
	int n;
	cin >> n;
	for (int k = 0; k < n; k++){
		cin >> a;
		int i = 0;
		while (*(a + i) != '\0'){
			b[i] = a[i];
			i++;
		}
		b[i] = '\0';
		char *temp = a;
		char *temp1 = reverseString(a);
		isFunny(a, b);
		cout << "\n";
	}
		
	
	
	//cout << a;
	getchar();
	return 0;
}
