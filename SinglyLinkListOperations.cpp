#include<iostream>
#include<conio.h>
using namespace std;
struct node
{
	int data;
	node *nxt;
};
void insert(node **start, int data)
{
	node *temp = *start;
	if ((*start == NULL))
	{
		node *p = new node;
		p->data = data;
		*start = p;
		temp = *start;
		p->nxt = NULL;
	}
	else
	{
		node *p = new node;
		while (temp->nxt!= NULL)
		{
			temp = temp->nxt;
		}
		p->data = data;
		temp->nxt = p;
		p->nxt = NULL;

	}
}
void insertFirst(node **start, int data){
	node *temp = *start;
	node *p = new node;
	p->data = data;
	p->nxt = temp;
	temp = p;
	*start = temp;
}
void insertLast(node **start, int data){
	node *temp = *start;
	node *p = new node;
	p->data = data;
	while (temp->nxt != NULL){
		temp = temp->nxt;
	}
	temp->nxt = p;
	p->nxt = NULL;
}
void insertPosition(node **start, int data, int pos){
	node *temp = *start;
	node *p = new node;
	p->data = data;
	int count = 1;
	while (count != pos)
	{
		temp = temp->nxt;
		count++;
	}
	p->nxt = temp->nxt;
	temp->nxt = p;
}
void deleteFirst(node **start){
	node *temp = *start;
	*start = (*start)->nxt;
	delete temp;
}
void deleteLast(node **start){
	node *temp = *start;
	node *temp1;
	while (temp->nxt->nxt != NULL)
	{
		temp = temp->nxt;
	}
	temp1 = temp->nxt;
	temp->nxt = NULL;
	delete temp1;
	
}
void reverseList(node **start){
	node *temp, *temp1, *x;
	temp = *start;
	temp1 = temp->nxt;
	x = temp->nxt->nxt;
	temp->nxt = NULL;
	while (x->nxt != NULL){
		temp1->nxt = NULL;
		temp1->nxt = temp;
		
		temp = temp1;
		temp1 = x;
		x = x->nxt;
	}
	x->nxt = temp1;
	temp1->nxt = NULL;
	temp1->nxt = temp;
	//(*start)->nxt = NULL;
	*start = x;
	
}
void insertRecurse(node **start, node **temp, int data){
	node *p=new node;
	static int count = 0;
	if (count == 0){
		p->data = data;
		*start = p;
		*temp = p;
		//*start = p;
		p->nxt = NULL;
		count++;
	}

	else if (*temp!= NULL){
		*temp = (*temp)->nxt;
		insertRecurse(&(*start), &(*temp), data);
	}
	
	else{
		p->data = data;
		(*temp)= p;
		p->nxt = NULL;
	}
	
	
}
void display(node **start)
{

	node *temp = (*start);
	while (temp!= NULL)
	{
		cout << temp->data << "\n";
		temp = temp->nxt;
	}
	
}
int main()
{
	node *start=NULL;
	node *temp = NULL;
	int ch;
	char choice='y';
	int data;
	

	while (choice=='y'){
		cout << "1. Do you want to insert in list\n 2. Do you want to view list\n 3. Insert at first\n 4. Insert at last";
		cout << "\n5. Insert at required position\n6. Deletion at first\n7. Deletion at last\n 8. Reverse Link List";
		cout << "\n.9 Insert Using Recurssion";
		cin >> ch;
		

		switch (ch){
		case 1:
			if (ch == 1){
				cout << "enter data";
				cin >> data;
				insert(&start, data);
				break;
			}
		case 2:
			if (ch == 2){
				display(&start);
				break;
			}
		case 3:
			if (ch == 3){
				cout << "enter data";
				cin >> data;
				insertFirst(&start, data);
			}
		case 4:
			if (ch == 4){
				cout << "enter data";
				cin >> data;
				insertLast(&start, data);
			}
		case 5:
			if (ch == 5){
				display(&start);
				cout << "enter the position";
				int pos;
				cin >> pos;
				cout << "enter data";
				cin >> data;
				insertPosition(&start, data, pos);

			}
		case 6:
			if (ch == 6){
				deleteFirst(&start);
			}
		case 7:
			if (ch == 7){
				deleteLast(&start);

			}
		case 8:
			if (ch == 8){
				reverseList(&start);
			}
		case 9:
			if (ch == 9){
				cout << "enter data";
				cin >> data;
				insertRecurse(&start,&temp, data);
			}
			
			
		}
		cout << "do you want to continue?";
		cin >> choice;
	
	}
	getchar();
	return 0;
}