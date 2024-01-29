package Documents;

import Exceptions.Exception555;
import Exceptions.Exception1a2b;
import Exceptions.ExceptionABS;

public class Register {
    private Document[] documents;

    void saveDoc(Document document) {
        try {
            document.validateDocumentNumber();
        } catch (Exception555 | Exception1a2b | ExceptionABS exception) {
            System.out.println("Неккоректное имя документа. Нельзя сохранить в регистр" + exception.getClass().getName());
            System.out.println("Ошибка: " + exception.getMessage());
        }
    }
}
