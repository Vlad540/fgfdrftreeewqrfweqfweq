package ru.ok.android.externcalls.sdk.api;

import java.io.IOException;
import ru.ok.android.api.json.JsonTypeMismatchException;

public class InternalIdResponse {
    public static final h67 PARSER = new yc5(26);
    public final String error;
    public final String name;
    public final long okId;

    public InternalIdResponse(long j, String str, String str2) {
        this.okId = j;
        this.name = str;
        this.error = str2;
    }

    public static InternalIdResponse parse(m67 m67) throws IOException, JsonTypeMismatchException {
        m67.s();
        long j = 0;
        String str = null;
        String str2 = null;
        while (m67.hasNext()) {
            String T = m67.T();
            T.getClass();
            char c = 65535;
            switch (T.hashCode()) {
                case 3373707:
                    if (T.equals("name")) {
                        c = 0;
                        break;
                    }
                    break;
                case 96784904:
                    if (T.equals("error")) {
                        c = 1;
                        break;
                    }
                    break;
                case 105793118:
                    if (T.equals("ok_id")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    str = m67.H();
                    break;
                case 1:
                    str2 = m67.H();
                    break;
                case 2:
                    j = m67.w();
                    break;
                default:
                    m67.z();
                    break;
            }
        }
        m67.q();
        return new InternalIdResponse(j, str, str2);
    }
}
