//Swap Nodes in the binary tree
#include<iostream>
using namespace std;
struct node{
	int data;
	node *left;
	node *right;
};
// create root of the tree
void createRoot(node **root, int data){
	node *p = new node;
	p->data = data;
	*root= p;
	p->left = nullptr;
	p->right = nullptr;
}
//insert into left of binary tree

void insertLBTree(node **root, int data){
	node *tempL = *root;
	node *p = new node;
	p->data = data;
	tempL->left = p;
	p->left = nullptr;
	p->right = nullptr;

}

void insertRBTree(node **root, int data){
	node *tempR = *root;
	node *p = new node;
	p->data = data;
	tempR->right = p;
	p->left = nullptr;
	p->right = nullptr;

}


//find position

node * fPosition(node *root, int dataItem){
	node *temp = root;
	if (temp->left!=nullptr && temp->left->data == dataItem){
		return temp;
	}
	if (temp->left!=nullptr && temp->right->data == dataItem){
		return temp;
	}
	if (temp->left != nullptr && temp->left->data != dataItem){
		fPosition(temp->left, dataItem);
	}
	if (temp->right != nullptr && temp->right->data != dataItem){
		fPosition(temp->right, dataItem);
	}
	//return temp;
	
	
}

// swap nodes
void swapNodes(node **root, int a, int b){
	node *temp = *root;
	node *prevA = fPosition(temp, a);
	cout << prevA->data<<"\n";
	temp = *root;
	//cout << temp->data;
	node *prevB = fPosition(temp, b);
	cout << prevB->data << "\n";
	if (prevA->left->data == a){
		if (prevB->left->data == b){
			node *tempSwap = prevA->left;
			prevA->left = prevB->left;
			prevB->left = tempSwap;

		}
	}
	/*if (prevA->left->data == a){
		if (prevB->right!=nullptr && prevB->right->data == b){
			prevA->left = prevB->right;
			prevB->right = prevA->left;
		}
		else{
			prevA->left = prevB->left;
			prevB->left = prevA->left;
		}
	}
	else{
		if (prevA->right->data == a){
			if (prevB->right->data == b){
				prevA->right = prevB->right;
				prevB->right = prevA->right;
			}
			else{
				prevA->right = prevB->left;
				prevB->left = prevA->right;
			}
		}
	}*/
	
	
}


void traverseBTree(node **root){
	node *temp = *root;
	if (temp != nullptr && temp->left != nullptr)
		traverseBTree(&temp->left);
	cout << temp->data<<"\t";
	if (temp != nullptr && temp->right != nullptr)
		traverseBTree(&temp->right);


}
int main(){
	node *root = NULL;
	//node *root1 = NULL;
	//int data;
	//int ch;
	
	createRoot(&root, 11);
	insertLBTree(&root, 5);
	insertLBTree(&root->left, 2);
	insertRBTree(&root->left, 7);
	insertRBTree(&root, 15);
	insertLBTree(&root->right, 12);
	traverseBTree(&root);
	swapNodes(&root, 5, 12);
	cout << "\n";
	traverseBTree(&root);


	getchar();
	getchar();
	return 0;
}