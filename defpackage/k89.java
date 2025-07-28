package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: k89  reason: default package */
public final class k89 extends lbe {
    public final long c;
    public final Set o;

    public k89(long j, LinkedHashSet linkedHashSet) {
        this.c = j;
        this.o = linkedHashSet;
    }

    public static final k89 c(ws8 ws8) {
        int K;
        if (!ws8.m() || (K = jjd.K(ws8)) == 0) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        long j = 0;
        for (int i = 0; i < K; i++) {
            String M = jjd.M(ws8);
            if (M != null) {
                if (M.equals(ApiProtocol.PARAM_CHAT_ID)) {
                    j = jjd.J(ws8, 0);
                } else if (M.equals("messageIds")) {
                    int D = jjd.D(ws8);
                    for (int i2 = 0; i2 < D; i2++) {
                        linkedHashSet.add(Long.valueOf(ws8.w0()));
                    }
                } else {
                    ws8.z();
                }
            }
        }
        return new k89(j, linkedHashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k89)) {
            return false;
        }
        k89 k89 = (k89) obj;
        return this.c == k89.c && hhd.f(this.o, k89.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + (Long.hashCode(this.c) * 31);
    }

    public final String toString() {
        return "Response(chatId=" + this.c + ", messageIds=" + this.o + ")";
    }
}
