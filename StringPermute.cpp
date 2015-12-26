//Calculate if one string is permutation of another
#include<iostream>
using namespace std;
class Permute
{
private:
	char a[100];
	char b[100];
	char *temp1 = a;
	char *temp2 = b;
	int array[25];
	int flag = 0;
public:
	void getStringA(){
		cout << "enter string A";
		cin.getline(a, 100);
	}
	void getStringB(){
		cout << "enter string B";
		cin.getline(b, 100);
	}
	void SetArray(){
		for (int i = 0; i < 25; i++){
			array[i] = 0;
		}
	}
	void permute(){//This function calculates if one string is permutation of another
		SetArray();
		int i = 0;
		while (*(temp1 + i) != '\0'){
			if (int(*(temp1 + i)) > 90){
				array[int(*(temp1 + i)) - 97] = array[int(*(temp1 + i)) - 97] + 1;
			}
			else{
				array[int(*(temp1 + i)) - 65] = array[int(*(temp1 + i)) - 65] + 1;
			}
			i++;
		}
		i = 0;
		while (*(temp2 + i) != '\0'){
			if (int(*(temp1 + i)) > 90){
				if (array[int(*(temp2 + i)) - 97] == 0){
					cout << "not a permutation!";
					flag = 1;
					break;
				}
			}
			else{
				if (array[int(*(temp2 + i)) - 65] == 0){
					cout << "not a permutation!";
					flag = 1;
					break;
				}
			}
			
			i++;
		}
		if (flag == 0){
			cout << "permutation";
		}
	}
};
int main(){
	Permute p;
	p.getStringA();
	p.getStringB();
	p.permute();
	getchar();
	return 0;
}