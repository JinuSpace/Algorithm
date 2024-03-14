#include <string>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

#define ll long long



int main() {
   
   
   while(1){
   	
   	string name;
   int age, weight;
   
   		cin >> name >> age >> weight;
   		
   		if(name == "#" && age == 0 && weight == 0){
   			break;
		   }
		   
		if(age >17 || weight >= 80){
			cout << name << " Senior\n";
		}else{
			cout << name << " Junior\n";
		}
		
   }
   
   
   
   

	


    return 0;

}



