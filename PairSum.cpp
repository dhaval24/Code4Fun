// This code finds the number of pairs in the array whose sum is the input number.
#include<iostream>
using namespace std;
int a[] = { 3, 7, 2, 5,6,4};
void merge(int a[], int p, int q, int r){
	int n1 = q - p + 1;
	int n2 = r - q;
	int *l1 = new int[n1];
	int *l2 = new int[n2];
	for (int i = 0; i < n1; i++){
		l1[i] = a[p + i];
	}
	for (int i = 0; i < n2; i++){
		l2[i] = a[q + 1 + i];
	}
	int i = 0;
	int j = 0;
	int k = p;
	while (i<n1 && j<n2){
		if (l1[i] < l2[j]){
			a[k] = l1[i];
			i++;
			k++;
		}
		else{
			a[k] = l2[j];
			j++;
			k++;
		}
	}
	while (i < n1){
		a[k] = l1[i];
		i++;
		k++;
	}
	while (j < n2){
		a[k] = l2[j];
		j++;
		k++;
	}
}
void mergeSort(int a1[], int p, int r){
	//int *a1;
	if (p < r){
		int q = (p + (r -1))/ 2;
		mergeSort(a1, p, q);
		mergeSort(a1, q + 1, r);
		merge(a1, p, q, r);
	}
}
int findPairs(int a[], int n){
	//This is a brute force soultion think something more efficient
	int num;
	int count = 0;
	for (int i = 0; i < 6; i++){
		num = n-a[i];
		if (num < 0){
			break;
		}
		for (int j = i + 1; (j < 6)||a[j]>num; j++)
		{
			if (a[i] + a[j] == n){
				count++;
			}
		}
	}
	return count;
}
int main(){
	int n;
	mergeSort(a, 0, 5);
	for (int i = 0; i < 6; i++){
		cout << a[i];
	}
	cout << "enter the sum number";
	cin >> n;
	int count=findPairs(a,n);
	cout << "total pairs are" << count;
	getchar();
	getchar();
}

// a better solution could be done using a single for loop for picking up the element
// and then searching through the array using binary search to find x-i element and increase count.