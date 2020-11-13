int a[3][3];

int i;
int j;

print "initializing arrays";
for(i = 3; i; i = i - 1) {
    for(j = 3; j; j = j - 1) {
        a[i-1][j-1] = (i * j);
    };
};

print "initialized arrays";

for(i = 3; i; i = i - 1) {
    for(j = 3; j; j = j - 1) {
        print a[i-1][j-1];
    };
};