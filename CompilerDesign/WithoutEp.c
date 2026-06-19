#include <stdio.h>
#include <string.h>

#define MAX 10

int n, m; // n = states, m = input symbols
int epsilon[MAX][MAX];
int trans[MAX][MAX][MAX];  // trans[state][symbol][next_state]
int closure[MAX][MAX];

// Function to compute epsilon closure using DFS
void dfs(int state, int visited[]) {
    visited[state] = 1;
    closure[state][state] = 1;

    for(int i = 0; i < n; i++) {
        if(epsilon[state][i] && !visited[i]) {
            dfs(i, visited);
            closure[state][i] = 1;
        }
    }
}

int main() {

    printf("Enter number of states: ");
    scanf("%d", &n);

    printf("Enter number of input symbols: ");
    scanf("%d", &m);

    // Initialize matrices
    memset(epsilon, 0, sizeof(epsilon));
    memset(trans, 0, sizeof(trans));
    memset(closure, 0, sizeof(closure));

    int e;
    printf("Enter number of epsilon transitions: ");
    scanf("%d", &e);

    printf("Enter epsilon transitions (from to):\n");
    for(int i = 0; i < e; i++) {
        int from, to;
        scanf("%d %d", &from, &to);
        epsilon[from][to] = 1;
    }

    int t;
    printf("Enter number of normal transitions: ");
    scanf("%d", &t);

    printf("Enter transitions (from symbol to):\n");
    for(int i = 0; i < t; i++) {
        int from, sym, to;
        scanf("%d %d %d", &from, &sym, &to);
        trans[from][sym][to] = 1;
    }

    // Step 1: Compute epsilon closures
    for(int i = 0; i < n; i++) {
        int visited[MAX] = {0};
        dfs(i, visited);
    }

    printf("\nEpsilon Closures:\n");
    for(int i = 0; i < n; i++) {
        printf("Closure(%d): ", i);
        for(int j = 0; j < n; j++)
            if(closure[i][j])
                printf("%d ", j);
        printf("\n");
    }

    // Step 2: Construct new transitions without epsilon
    printf("\nNew Transition Table (Without Epsilon):\n");

    for(int i = 0; i < n; i++) {
        for(int sym = 0; sym < m; sym++) {

            int result[MAX] = {0};

            // For each state in closure(i)
            for(int j = 0; j < n; j++) {
                if(closure[i][j]) {
                    for(int k = 0; k < n; k++) {
                        if(trans[j][sym][k]) {
                            // Add closure of k
                            for(int x = 0; x < n; x++)
                                if(closure[k][x])
                                    result[x] = 1;
                        }
                    }
                }
            }

            printf("δ'(%d, %d): ", i, sym);
            for(int r = 0; r < n; r++)
                if(result[r])
                    printf("%d ", r);
            printf("\n");
        }
    }

    return 0;
}