//This code removes multiple underscores from the string and returns a string with only single under scores.
#include<iostream>
using namespace std;
void copy(char *s, int i){//This function moves each character forward in the string
	while (*(s + i) != '\0'){
		*(s+i) = *(s +i+1);
		i++;
	}
	//return *s;
}
int main(){
	char string[] = "__hello___world__";
	int i = 0;
	while (*(string + i) != '\0'){
		int a = int(*(string + i));
		int b= int(*(string + i + 1));
		if (a == 95 && b == 95){
			copy(string, i+1);
		}
		else{
			i++;
		}
		
	}
	cout << string;
	getchar();
	return 0;
}