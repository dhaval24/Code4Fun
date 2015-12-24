//Implementation of string compare library function
#include<iostream>
#include<string>
using namespace std;
void stringCompare(char *a, char *b){
	int i = 0;
	while (true){
		if (a[i] == '\0' && b[i] == '\0'){
			cout << "match";
			break;
		}
		if (a[i] == '\0' || b[i] == '\0'){
			cout << "Mismatch";
			break;
		}
		if (a[i] == b[i]){
			i++;
			continue;
		}
		else{
			cout<<"mismmatch";
			break;
		}
	}
}
void main(){
	char a[] = "My name is dhaval";
	char b[] = "My name is Dhaval";
	char *a1 = a;
	char *b1 = b;
	stringCompare(a1, b1);
	getchar();
}