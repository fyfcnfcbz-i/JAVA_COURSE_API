package org.example.seminar1.test3;

public class Main {
    public static void main(String[] args) {
/**
 * В методе calculate класса Calculator реализовать калькулятор,
 * который будет выполнять математические операции (+, -, *, /) над двумя
 * целыми числами и возвращать результат вещественного типа.
 * В классе Printer необходимо реализовать проверку переданного оператора,
 * при некорректном операторе программа должна вывести сообщение об ошибке
 * "Некорректный оператор: 'оператор'".
  */

    }
}

class Calculator {
    public double calculate(char op, int a, int b) {
        // Введите свое решение ниже
        switch (op) {
            case '+':
                double s = a + b;
                return s;
            case '-':
                double m = a - b;
                return m;
            case '*':
                double y = a * b;
                return y;
            case '/':
                double d = a / b;
                return d;
        }

        return 0;
    }
}
