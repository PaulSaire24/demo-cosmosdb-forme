package com.example.democosmosdb.patternexercises.exercises3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryApplication {
    public static final Map<String, Supplier<FactoryDocument>> MAP =  new HashMap<>();

    static {
        MAP.put("pdf",() -> new PdfDocument());
        MAP.put("markdown",MarkDowndDocument::new);
        MAP.put("html",HtmlDocument::new);
    }

    public static FactoryDocument getDocument(String documentType) {
        if (MAP.get(documentType).get() != null) {
            return MAP.get(documentType).get();
        }
         throw  new IllegalArgumentException("document type not supported");
    }
}
