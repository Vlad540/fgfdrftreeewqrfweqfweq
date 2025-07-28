package defpackage;

import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: r89  reason: default package */
public final class r89 extends lbe {
    public long c;
    public List o;

    public r89(ws8 ws8) {
        super(ws8);
        if (this.o == null) {
            this.o = Collections.emptyList();
        }
    }

    public final void b(ws8 ws8, String str) {
        str.getClass();
        if (str.equals(ApiProtocol.PARAM_CHAT_ID)) {
            this.c = ws8.w0();
        } else if (!str.equals("messages")) {
            ws8.z();
        } else {
            this.o = zy.e(ws8);
        }
    }

    public final String toString() {
        long j = this.c;
        int p = ete.p(this.o);
        return "{chatId=" + j + ", messages=" + p + "}";
    }
}
