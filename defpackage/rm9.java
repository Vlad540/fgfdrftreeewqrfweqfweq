package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: rm9  reason: default package */
public final class rm9 extends lbe {
    public vr8 X;
    public long c;
    public long o;

    public rm9(ws8 ws8) {
        super(ws8);
    }

    public final void b(ws8 ws8, String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1716357513) {
            if (hashCode != -1440013438) {
                if (hashCode == -1361631597 && str.equals(ApiProtocol.PARAM_CHAT_ID)) {
                    this.c = jjd.J(ws8, 0);
                    return;
                }
            } else if (str.equals("messageId")) {
                this.o = jjd.J(ws8, 0);
                return;
            }
        } else if (str.equals("reactionInfo")) {
            this.X = n1g.G(ws8);
            return;
        }
        ws8.z();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r6 = r6.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r6 = this;
            long r0 = r6.c
            long r2 = r6.o
            vr8 r6 = r6.X
            if (r6 == 0) goto L_0x0015
            java.util.List r6 = r6.a
            if (r6 == 0) goto L_0x0015
            int r6 = r6.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x0016
        L_0x0015:
            r6 = 0
        L_0x0016:
            java.lang.String r4 = "{chatId="
            java.lang.String r5 = ", messageId="
            java.lang.StringBuilder r0 = hr1.k(r0, r4, r5)
            r0.append(r2)
            java.lang.String r1 = ", reactionInfo = "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = " }"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm9.toString():java.lang.String");
    }
}
