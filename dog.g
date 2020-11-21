print "f";

class Dog {
    string name;
    int age;
    string color;
    string breed;

    function null construct(string cname, int cage, string ccolor, string cbreed) {
        name = cname;
        age = cage;
        color = ccolor;
        breed = cbreed;
    };
};

Dog bork;
bork.construct("bork", 5, "brown", "dog");

print bork;