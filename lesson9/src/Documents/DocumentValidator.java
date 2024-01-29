package Documents;

import Exceptions.Exception555;
import Exceptions.Exception1a2b;
import Exceptions.ExceptionABS;

public class DocumentValidator {
    public static void validateDocumentNumber(String docNumber) throws ExceptionABS, Exception555, Exception1a2b {
        checkContainsAbc(docNumber);
        checkStartsWith555(docNumber);
        checkEndsWith1a2b(docNumber);
    }

    private static void checkContainsAbc(String docNumber) throws ExceptionABS {
        if (docNumber.contains("abc")) {
            throw new ExceptionABS("Document number contain 'abc'");
        }
    }

    private static void checkStartsWith555(String docNumber) throws Exception555 {
        if (docNumber.startsWith("555")) {
            throw new Exception555("Document number start with '555'");
        }
    }

    private static void checkEndsWith1a2b(String docNumber) throws Exception1a2b {
        if (docNumber.endsWith("1a2b")) {
            throw new Exception1a2b("Document number end with '1a2b'");
        }
    }
}
