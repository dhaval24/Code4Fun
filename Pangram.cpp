// This code finds if the given string is a pangram or not.(Pangram is a string which has all the alphabets in it atleast once)
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include<string>
using namespace std;


int main() {
	char input[1000];
	int map[26];
	int flag = 0;
	//string input;
	cin.getline(input, 1000);// Read entire character array with spaces
	char *ptr = input;
	int i = 0;
	for (int j = 0; j<26; j++){
		map[j] = 0;
	}
	while (*(ptr+i) != '\0'){
		int temp = int(*(ptr + i));
		
		if ((temp >= 97) && (temp <= 122)){
		map[temp - 97] = map[temp - 97] + 1;
		}
		if ((temp >= 65) && (temp <= 90)){
			map[temp - 65] = map[temp - 65] + 1;
		}
		//cout << temp << "\n";
		i++;
	}
	for (int j = 0; j<26; j++){
		if (map[j]>0){
			continue;
		}
		else{
			flag = 1;
			break;
		}
	}
	if (flag == 0){
		cout << "pangram";
	}
	else{
		cout << "not pangram";
	}
	getchar();
	getchar();
	return 0;
}
