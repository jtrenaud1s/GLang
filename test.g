int f = 5;
print f;

int a[3][3];

for(int i = 10; i; i = i - 1) {
    print i;
};


for(int i = 3; i; i = i - 1) {
    for(int j = 3; j; j = j - 1) {
        a[i-1][j-1] = i * j;
    };
};


for(int i = 3; i; i = i - 1) {
    for(int j = 3; j; j = j - 1) {
        print a[i-1][j-1];
    };
};