using namespace std;

long long solution(int price, int money, int count)
{
    long long answer = -1;
    long long total = 0;
    for(int i = 1;i<=count;i++){
        total += price*i;
    }
    
    answer =total -money;
    if(answer <1){
        return 0;
    }

    return answer;
}