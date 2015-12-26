//This code takes a string with repeated characters and compresses it.
#include<iostream>
using namespace std;
class StringCompress{
private:
	char a[100];
	char b[100];
	char *temp = a;
	char *temp1 = b;
	int length, count;
	int i;
public:
	void getA(){
		cout << "enter string";
		cin.getline(a, 100);
	}
	void calcLength(){
		int j = 0;
		length = 0;
		while (*(temp + j) != '\0'){
			length++;
			j++;
			
		}
	}
	void compress(){
		count = 1;
		int j = 0;
		for (i =0; i<length; i++,j++){
			*(temp1 + j) = *(temp + i);
			while (*(temp + i) == *(temp + i + 1)){
				count++;
				i++;
			}
			*(temp1 + j+1) = char(count+48);
			j++;
			count = 1;
		}
		cout << b;
	}
};

int main(){
	StringCompress s;
	s.getA();
	s.calcLength();
	s.compress();
	getchar();
	return 0;
}