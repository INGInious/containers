#include "MyCpp11Class.h"
#include <string>

MyCpp11Class::MyCpp11Class()
{
    //ctor
}

MyCpp11Class::~MyCpp11Class()
{
    //dtor
}

void MyCpp11Class::setName(std::string _name){
    name = _name;
}

std::string MyCpp11Class::getName(){
    return name;
}
