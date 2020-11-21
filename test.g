class sort {
    int arr[];

    function null quickSort(int low, int high) {
        if (low < high) {
            int part = partition(low, high);

            quickSort(low, part - 1);
            quickSort(part + 1, high);
        };
    };


    function int partition(int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        int temp;

        for (int j = low; j <= (high - 1); j = j + 1) {
            if (arr[j] < pivot) {
                i = i + 1;

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            };
        };

        temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    };
};

sort a;

int i[10];

for(int j = 0; j < i.length(); j = j + 1) {
    read i[j];
};

a.arr = i;



print a.arr;
a.quickSort(0, 9);
print a.arr;

print i;
