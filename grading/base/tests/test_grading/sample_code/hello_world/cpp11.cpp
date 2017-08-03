#include <iostream>

int main() {
  auto one_lambda = []() { std::cout << "Hello world!\n"; };

  one_lambda();
}
