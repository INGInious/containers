#ifndef MYCPP11CLASS_H
#define MYCPP11CLASS_H

#include <string>

class MyCpp11Class
{
    public:
        MyCpp11Class();
        virtual ~MyCpp11Class();
        virtual std::string getName();
        virtual void setName(std::string _name);

    protected:

    private:
        std::string name;
};

#endif // MYCPP11CLASS_H
