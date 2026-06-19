//Write  to implement epsilon closure of all state  if any NFA with epsilon transition.


#include <stdio.h>
#define MAX 20

int n;                      
int epsilon[MAX][MAX];      
int visited[MAX];
void dfs(int state) {
    visited[state] = 1;
    printf("%d ", state);
    for (int i = 0; i < n; i++) {
        if (epsilon[state][i] == 1 && !visited[i]) {
            dfs(i);
        }
    }
}

int main() {
    int t;
    printf("Enter number of states: ");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            epsilon[i][j] = 0;

    printf("Enter number of epsilon transitions: ");
    scanf("%d", &t);

    printf("Enter epsilon transitions (from to):\n");
    for (int i = 0; i < t; i++) {
        int from, to;
        scanf("%d %d", &from, &to);
        epsilon[from][to] = 1;
    }

    for (int i = 0; i < n; i++) {

       
        for (int j = 0; j < n; j++)
            visited[j] = 0;

        printf("\nEpsilon Closure of state %d: ", i);
        dfs(i);
    }

    return 0;
}
