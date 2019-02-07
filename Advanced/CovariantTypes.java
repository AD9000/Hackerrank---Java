// Author: Atharv Damle

// Covariant data types use the fact that a parent class can
// be instanciated with a child class. Eg:
// Region r = new WestBengal(); ---- this is valid
// Region r = new AndhraPradesh(); ---- this is valid too!
// Create covariant types which can be used to produce different outputs by instanciating the same parent class.

// Full Question: https://www.hackerrank.com/challenges/java-covariance/problem

class Flower {
    String whatsYourName()
    {
        return "I have many names and types";
    }
}

class Jasmine extends Flower {
    String whatsYourName()
    {
        return "Jasmine";
    }
}

class Lily extends Flower {
    String whatsYourName()
    {
        return "Lily";
    }
}

class Region {
    Flower yourNationalFlower()
    {
        return new Flower();
    }
}

class WestBengal extends Region {
    Jasmine yourNationalFlower()
    {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region {
    Lily yourNationalFlower()
    {
        return new Lily();
    }
}
