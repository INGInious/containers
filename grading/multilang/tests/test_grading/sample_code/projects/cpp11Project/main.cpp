#include <iostream>
#include "MyCpp11Class.h"
#include <string>

using namespace std;

int main()
{
    MyCpp11Class myCpp11Object;
    myCpp11Object.setName("I am a cpp11 Object!!!");
    auto name = myCpp11Object.getName();
    std::cout<<name<<std::endl;
    return 0;
}
