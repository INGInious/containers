#include "MyClass.h"
#include<iostream>

MyClass::MyClass()
{
    //ctor
}

MyClass::~MyClass()
{
    //dtor
}

void MyClass::sayHello(){
    std::cout<<"Hello! This is a class"<<std::endl;
}
