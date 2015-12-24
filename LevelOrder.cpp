//Level order traversal in Binary Tree
#include<iostream>
using namespace std;
struct node{
	int data;
	node *left;
	node *right;
};
void insertBTree(node **root, int data){
	if ((*root) == NULL){
		node *p = new node;
		p->data = data;
		*root = p;
		p->left = nullptr;
		p->right = nullptr;
	}
	else{
		node *temp = new node;
		temp = *root;
		node *p = new node;
		p->data = data;
		node *prev = NULL;
		while (temp!=nullptr){
			if (data < temp->data){
				prev = temp;
				temp = temp->left;
			}
			else{
				prev = temp;
				temp = temp->right;
			}
			
		}
		if (data < prev->data){
			prev->left = p;
			p->right = nullptr;
			p->left = nullptr;
		}
		else{
			prev->right = p;
			p->left = nullptr;
			p->right = nullptr;
			
		}
		
	}
	
}
void traverseBTree(node **root){
	node *temp = *root;
	if (temp!= nullptr && temp->left!=nullptr)
		traverseBTree(&temp->left);
	cout << temp->data;
	if (temp != nullptr && temp->right != nullptr)
		traverseBTree(&temp->right);
	

}
int main(){
	node *root = NULL;
	//node *root1 = NULL;
	int data;
	int ch;
	
	
	while (true){
		cout << "do you wanna insert more in btree?";
		cin >> ch;
		if (ch == 1){
			cout << "enter the data";
			cin >> data;
			insertBTree(&root, data);
		}
		else{
			break;
		}
	}
	
	traverseBTree(&root);

	getchar();
	getchar();
	return 0;
}