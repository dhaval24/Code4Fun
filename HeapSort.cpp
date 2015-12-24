#include<iostream>
#include<conio.h>
#include<math.h>
#include<time.h>
using namespace std;
#define getch() _getch()
int a[100];
int heapsize=5;
void heapify(int a[], int i)
{
	int left;
	int right;
	int largest;
	if (i == 0){
		left = 1;
		right = 2;
	}
	else{
		left = (2 * i) + 1;
		right = (2 * i) + 2;
	}
	
	if (left <= heapsize && a[left] > a[i])
		largest = left;
	else
		largest = i;
	if (right <= heapsize && a[right] > a[largest]){
		largest = right;
	}
	if (largest != i){
		int temp = a[i];
		a[i] = a[largest];
		a[largest] = temp;
		heapify(a, largest);
	}

		
}
void buildMaxHeap(int a[]){
	for (int i = (heapsize/2); i >= 0; i--){
		heapify(a, i);
	}
}

void heapSort(int a[]){
	buildMaxHeap(a);
	cout << "elements are";
	for (int i = heapsize; i >=0; i--){
		int temp = a[0];
		a[0] = a[i];
		a[i] = temp;
		heapsize--;
		heapify(a, 0);
	}
}
// Prioirity queue using heap sort;
//Function to calculate parent of a node
inline int findParent(int i){
	int parent;
	if (i % 2 == 0){
		parent = (i / 2) - 1;
		return parent;
	}
	else{
		parent = (i / 2);
		return parent;
	}
}

//Fucntion to increase the value of a node
void heapIncreaseKey(int a[], int i, int key){
	if (key <= a[i]){
		cout << " Error new key is smaller then previous";
	}
	else{
		int temp1 = a[i];
		buildMaxHeap(a);
		for (int j = 0; j < 7; j++){
			if (a[j] == temp1){
				i = j;
				break;
			}
		}
		a[i] = key;
		int parent = findParent(i);
		while ((i > 0)&&(a[findParent(i)]<a[i])){
			int temp = a[findParent(i)];
			a[findParent(i)] = a[i];
			a[i] = temp;
			i = findParent(i);
		}
	}

}

//Function to insert a node in max heap
void maxHeapInsert(int a[], int key){
	heapsize++;
	a[heapsize] = -20000;
	heapIncreaseKey(a, heapsize, key);

}
int main(){
	clock_t tStart = clock();
	int ch;
	cout << "enter elements of array";
	for (int i = 0; i <6; i++){
		//cin >> a[i];
		a[i] = rand()/1000;
	}
	cout << "enter your choice\n 1. Sort \n 2. Increase key \n 3. Insert element in max heap";
	cin >> ch;
	switch (ch){
	case 1:
		if (ch == 1){
			heapSort(a);
			break;
		}
	case 2:
		if (ch == 2){
			int pos,key;
			cout << "enter the position of key";
			cin >> pos;
			cout << "enter the value of key";
			cin >> key;
			heapIncreaseKey(a, pos, key);
		}
	case 3:
		if (ch == 3){
			int value;
			cout << "enter the value of new node";
			cin >> value;
			maxHeapInsert(a, value);
		}
	}
	
	cout << "elements are";
	for (int i = 0; i <7; i++){
		cout << a[i] << "\n";
	}
	
	cout << "\ntime1" << (double)(clock() - tStart) / CLOCKS_PER_SEC;
	getch();
	return 0;
}