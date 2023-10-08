#include <cstdio>

int main(void) {
    int T;
    scanf("%d", &T);
    // printf("T = %d\n", T);
    for (int i=0; i<T; i++) {
        // --- INPUT
        int N, K;
        char s[100];
        scanf("%d %d", &N, &K);
        // printf("N=%d K=%d\n", N, K);
        scanf("%s", s);
        // printf("s = %s\n", s);

        // -- solve 
        solve(N, K, s);

        // -- OUTPUT
        int cnt = 5;
        char ans[100]="GHHGG";
        printf("%d\n%s\n", cnt, ans);
    }
    return 0;
}

void solve(int N, int K, char s[])
{
}
