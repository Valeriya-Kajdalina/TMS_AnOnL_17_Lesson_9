package Exceptions;
//Работа с прошлыми домашними заданиями. Создать свои классы
//исключений на каждую ситуацию:
//- Проверить содержит ли номер документа последовательность abc.
//- Проверить начинается ли номер документа с последовательности 555.
//- Проверить заканчивается ли номер документа на последовательность
//1a2b.
//Если номер документа не удовлетворяет условию - то "бросить"
//исключение.
//В методе класса, в котором будут вызываться эти методы для
//демонстрации работы, перехватить исключение конструкцией try-catch и в
//блоке catch вывести сообщение для пользователя (сообщение на
//консоль).

public class ExceptionABS extends Exception{
    public ExceptionABS(String message) {
        super(message);
    }
}