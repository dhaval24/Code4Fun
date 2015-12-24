	//This is the code to find the largest area rectangle out of the given histogram and is done in O(N^2) complexity using stacks.
	#include <cmath>
	#include <cstdio>
	#include <vector>
	#include <iostream>
	#include <algorithm>
	using namespace std;
	int numBuildings;
	int buildingHeight[100000];
	int minStack[10000];
	static int stackI = 0;
	//Function to calculate area of K rectangles
	//buildIndex is the current position of starting building
	//noBuilding is the number of buildings included in current call
	void minStackPush(int minStack[], int dataItem){
		if (stackI == 0){
			minStack[stackI] = dataItem;
		}
		else{
			stackI++;
			minStack[stackI] = dataItem;
		}
		
	}
	int minStackPop(int minStack[]){
		int dataItem = minStack[stackI];
		return dataItem;
	}
	void minStackFlush(int minStack[]){
		/*for (int i = 0; i <=stackI; i++){
			minStack[i] = 0;
		}*/
		stackI = 0;
	}

	int area(int noBuilding, int buildingHeight1[], int buildIndex){
		int minHeight = 1000000;//minHeight set to some large value
		int i = 0;

		/*while (i<noBuilding){//This while loop iterates till total number of buildings in current
			if (buildingHeight1[buildIndex]<minHeight){//we chechk that height of the building is less than minimum in all included and if so assign it to minHeight
				minHeight = buildingHeight1[buildIndex];
			}
			buildIndex++;
			i++;
		}*/
		if (minStackPop(minStack) > buildingHeight1[buildIndex+noBuilding - 1]){
			minHeight = buildingHeight1[buildIndex+noBuilding - 1];
			minStackPush(minStack, minHeight);
		}
		else{
			minHeight = minStackPop(minStack);
		}
	

		int areaRectangle = minHeight * noBuilding;// We calculate the area here
		return areaRectangle;
	}
	int main() {
		/* A brute force solution*/
		int maxArea = -1;//We have set the max area to -1 as no area is negative
		cin >> numBuildings;

		for (int i = 0; i<numBuildings; i++){
			cin >> buildingHeight[i];//cin always reads one charactes before space
		}
		//minStack[stackI] = buildingHeight[0];
		//stackI++;
		for (int i = 0; i<numBuildings; i++){//choosing the first building
			minStackFlush(minStack);
			minStackPush(minStack, buildingHeight[i]);
			for (int j = i + 1; j <= numBuildings; j++){//loop for incrementing buildings in list one by one
				int areaCurrent = area(j - i, buildingHeight, i);//j-i gives the number of buildings to include in the call
				if (areaCurrent>maxArea){
					maxArea = areaCurrent;
				}
			}
		
			//cout << minStack[stackI]<<"\n";
		}
		cout << maxArea;
		//cout << minStack[stackI];
		getchar();
		getchar();
		return 0;
	}
