int i;
int j;

int a[3][3];

for(i = 3; i; i = i - 1) {
    for(j = 3; j; j = j - 1) {
        a[i-1][j-1] = i * j;
    };
};


for(i = 3; i; i = i - 1) {
    for(j = 3; j; j = j - 1) {
        print a[i-1][j-1];
    };
};