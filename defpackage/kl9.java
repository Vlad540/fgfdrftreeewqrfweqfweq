package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: kl9  reason: default package */
public final class kl9 extends lbe {
    public String c;
    public long o;

    public kl9(ws8 ws8) {
        super(ws8);
    }

    public final void b(ws8 ws8, String str) {
        str.getClass();
        if (str.equals(ApiProtocol.PARAM_CHAT_ID)) {
            this.o = jjd.J(ws8, 0);
        } else if (!str.equals("text")) {
            ws8.z();
        } else {
            this.c = jjd.M(ws8);
        }
    }

    public final String toString() {
        StringBuilder j = m4b.j("{chatId='", this.o, ", text='", this.c);
        j.append("'}");
        return j.toString();
    }
}
