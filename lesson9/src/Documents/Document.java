package Documents;

import Exceptions.Exception555;
import Exceptions.Exception1a2b;
import Exceptions.ExceptionABS;

import java.util.Date;

public class Document {
    protected String docNumber;
    protected Date docDate;

    public Document(String docNumber, Date docDate) {
        this.docNumber = docNumber;
        this.docDate = docDate;
    }

    public void displayInfo() {};

    public String getDocNumber() {
        return docNumber;
    }

    public void validateDocumentNumber() throws ExceptionABS, Exception555, Exception1a2b {
        DocumentValidator.validateDocumentNumber(docNumber);
    }
}
