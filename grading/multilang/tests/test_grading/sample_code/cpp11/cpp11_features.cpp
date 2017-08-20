/*
 * Test file for c++11 specific features
 * based on http://codeforces.com/blog/entry/10124
 */

#include<bits/stdc++.h>

using namespace std;

template<typename T>
struct number_iterator : std::iterator<random_access_iterator_tag, T>{
	T v;
	number_iterator(T _v) : v(_v) {}
	operator T&(){return v;}
	T operator *() const {return v;}
};
template <typename T>
struct number_range {
	T b,e;
	number_range(T b, T e):b(b),e(e){}
	number_iterator<T> begin(){return b;}
	number_iterator<T> end(){return e;}
};
/* make_pair like functions for our range type */
template<typename T> number_range<T> range(T e) {return number_range<T>(0, e);}

// inclusive range
template<typename T> number_range<T> range(T b, T e) {return number_range<T>(b, e);}


int main(){
	vector<int> numbers = { 2,3,5,7};
	for (auto& x : numbers)
	    x *= 2;
	for (auto x : numbers)
	    cout << x << endl;
	int sum = 0;
	for (auto i: range(1000))
	    sum += i;
	for (auto i: range(10, 20))
	    cout << i << endl;
	return 0;
}
