package ru.ok.android.externcalls.sdk.api;

import java.io.IOException;
import ru.ok.android.api.json.JsonParseException;

public final class UnwrappingParser<T> implements h67 {
    private final String fieldName;
    private final h67 valueParser;

    public UnwrappingParser(String str, h67 h67) {
        this.fieldName = str;
        this.valueParser = h67;
    }

    public T parse(m67 m67) throws IOException, JsonParseException {
        m67.s();
        T t = null;
        while (m67.hasNext()) {
            if (this.fieldName.equals(m67.T())) {
                t = this.valueParser.parse(m67);
            }
        }
        m67.q();
        if (t != null) {
            return t;
        }
        throw new Exception(wn6.l(new StringBuilder("\""), this.fieldName, "\" not found"));
    }
}
