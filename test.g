function null quickSort(int arr[], int low, int high) {
    if (low < high) {
        int part = partition(arr, low, high);
        print "Partition: " + part;

        quickSort(arr, low, part - 1);
        quickSort(arr, part + 1, high);
        print "High: " + high;
        print "Low: " + low;
        print arr;
    };
};


function int partition(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = low - 1;
    int temp;

    for (int j = low; j <= high - 1; j = j + 1) {
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
    print i;
    return i + 1;
};

int i[10];

i[0] = 22;
i[1] = 43;
i[2] = 75;
i[3] = 5;
i[4] = 3;
i[5] = 84;
i[6] = 372;
i[7] = 45672;
i[8] = 225;
i[9] = 89;

print i;
quickSort(i, 0, 9);
print i;
