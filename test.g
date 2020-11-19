function int fib(int n) {
    int f[n + 2];
    f[0] = 0;
    f[1] = 1;

    for(int i = 2; i <= n; i = i + 1) {
        f[i] = f[i - 1] + f[i - 2];
    };

    return f[n];
};

for (int i = 0; i < 10; i = i + 1) {
    print fib(i);
};