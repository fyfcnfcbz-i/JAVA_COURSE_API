
**Java JDK**
```she
https://www.oracle.com/java/technologies/downloads/
```
**Extension Pack VS Code**
```sh
https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-javapack
```
**IntelijIdea Community Edition**
```dtd
https://www.jetbrains.com/ru-ru/idea/download/?section=windows
```

**Ctrl + Alt + L** - форматирование проекта

### Ввод с клавиатуры 
```dtd
Scanner scanner = new Scanner(System.in);
int n = scanner.nextIn();
```

### Ввод данных с помощью консоли

**За чтение данных отвечает объект out в классе java.lang.System**

• **print()**: вывод переданной информации.

• **println()**: вывод переданной информации и перевод строки.

• printf(): форматированный вывод.
```dtd
%s String
%d целое число
%f вещественное число
%b boolean
%c char
%t Date
%% Символ %
```
**За чтение данных отвечает класс java.util.Scanner**
```dtd
next() считывает введенную строку до первого пробела
nextLine() считывает всю введенную строку
nextInt() считывает введенное число int
nextDouble() считывает введенное число double
nextByte() считывает введенное число byte
nextBoolean() считывает значение boolean
nextFloat() считывает введенное число byte
nextShort() считывает введенное число short
```

**Дата и время в Java**
- **java.time.LocalDate**
```dtd
now() Возвращает текущую системную дату
parse() Считывает введенную строку(”2000-10-01”), как дату
getYear() Возвращает год, как int
getMonth() Возвращает месяц, как int
getDayOfMonth() Возвращает день месяца, как int
```
- **java.time.LocalDateTime**
```dtd
now() Возвращает текущее системную дату и время
parse() Считывает введенную строку(”2000-10-01T00:00”), как дату и время
getHour() Возвращает часы, как int
getMinute() Возвращает минуты, как int
getSecond() Возвращает секунды, как int
```

