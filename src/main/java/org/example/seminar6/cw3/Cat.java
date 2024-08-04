package org.example.seminar6.cw3;

import java.util.Objects;

public class Cat {

//    1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для
//    приложения, которое является
//    а) информационной системой ветеринарной клиники
//    б) архивом выставки котов
//    в) информационной системой Театра кошек Ю. Д. Куклачёва
//    Можно записать в текстовом виде, не обязательно реализовывать в java.

//1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно
//    использовать не все придуманные поля и методы. Создайте несколько
//    экземпляров этого класса, выведите их в консоль.
//2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась
//    его кличка, цвет и возраст (или другие параметры на ваше усмотрение).

    int id;
    String name;
    int age;
    String sex;
    String ovner;
    String color;

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", ovner='" + ovner + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return id == cat.id && age == cat.age && Objects.equals(name, cat.name) && Objects.equals(sex, cat.sex) && Objects.equals(ovner, cat.ovner) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, sex, ovner, color);
//        return 1;
    }
}
