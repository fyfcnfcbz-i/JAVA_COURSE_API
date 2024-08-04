package org.example.seminar4.test3;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {

//    В обычный калькулятор без логирования добавьте возможность отменить
//    последнюю операцию.
//
//    Отмена последней операции должна быть реализована следующим образом:
//    если передан оператор '<' калькулятор должен вывести результат
//    предпоследней операции.

    public ArrayDeque<Double> resultsStack = new ArrayDeque<>();
    public double prevResult;

    public double calculate(char op, int a, int b) {
        double result;

        if (op == '<') {
            if (resultsStack.size() >= 2) {
                resultsStack.pop(); // Удаляем последний результат
                result = resultsStack.peek(); // Получаем предпоследний результат
            } else if (resultsStack.size() == 1) {
                result = resultsStack.peek();
            } else {
                result = 0;
            }
        } else {
            switch (op) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b != 0) {
                        result = (double) a / b;
                    } else {
                        throw new ArithmeticException("Деление на ноль");
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Неподдерживаемая операция");
            }
            resultsStack.push(result);
        }

        return result;

    }

    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
            c = 4;
            op2 = '+';
            d = 7;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Main calculator = new Main();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
        double result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        double prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);

    }


}
