class Address {
    string street;
    string city;
    string state;
    int zip;
};

class Person {
    Address address;
    string name;
    int age;
};

Address a;
a.street = "1969 The Woods Circle";
a.city = "Barnhart";
a.state = "MO";
a.zip = 63012;

Person jordan;
jordan.address = a;
jordan.name = "Jordan Renaud";
jordan.age = 22;

print jordan;

