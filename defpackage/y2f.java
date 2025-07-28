package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: y2f  reason: default package */
public final class y2f implements Serializable {
    public final List X;
    public final byte Y;
    public final String a;
    public final long b;
    public final String c;
    public final int o;

    public y2f(String str, long j, String str2, int i, List list, byte b2) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.o = i;
        this.X = list;
        this.Y = b2;
    }

    /* JADX WARNING: type inference failed for: r0v41, types: [x89, java.lang.Object] */
    public static final y2f a(ws8 ws8) {
        int i;
        String str;
        ws8 ws82 = ws8;
        try {
            i = jjd.K(ws8);
        } catch (Throwable th) {
            Throwable th2 = th;
            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
            Iterator it = uzc.a.iterator();
            while (it.hasNext()) {
                ((ny9) it.next()).getClass();
                ny9.a(th2);
            }
            int t = hr1.t(m4b.a);
            if (t == 0) {
                i = 0;
            } else if (t != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th2;
            }
        }
        String str2 = "";
        long j = 0;
        String str3 = null;
        int i2 = 0;
        hw4 hw4 = null;
        byte b2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            try {
                str = jjd.M(ws8);
            } catch (Throwable th3) {
                udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                Iterator it2 = uzc.a.iterator();
                while (it2.hasNext()) {
                    ((ny9) it2.next()).getClass();
                    ny9.a(th3);
                }
                int t2 = hr1.t(m4b.a);
                if (t2 != 0) {
                    if (t2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
            }
            if (str != null) {
                try {
                    switch (str.hashCode()) {
                        case -2128794476:
                            if (str.equals("startedAt")) {
                                j = jjd.J(ws82, 0);
                                continue;
                            }
                            break;
                        case -1676095234:
                            if (str.equals(ApiProtocol.PARAM_CONVERSATION_ID)) {
                                str3 = jjd.M(ws8);
                                continue;
                            }
                            break;
                        case -1401988028:
                            if (str.equals(ApiProtocol.PARAM_JOIN_LINK)) {
                                str2 = jjd.M(ws8);
                                continue;
                            }
                            break;
                        case 3575610:
                            if (str.equals("type")) {
                                b2 = jjd.F(ws8).byteValue();
                                continue;
                            }
                            break;
                        case 265384045:
                            if (!str.equals("previewParticipantIds")) {
                                break;
                            } else {
                                hw4 hw42 = hw4.a;
                                hw4 T = jjd.T(ws82, new Object());
                                if (T != null) {
                                    hw42 = T;
                                }
                                hw4 = hw42;
                                continue;
                            }
                        case 1268671573:
                            if (str.equals("approxParticipantsCount")) {
                                i2 = jjd.I(ws8);
                                continue;
                            }
                            break;
                    }
                    ws8.z();
                } catch (Throwable th4) {
                    udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                    Iterator it3 = uzc.a.iterator();
                    while (it3.hasNext()) {
                        ((ny9) it3.next()).getClass();
                        ny9.a(th4);
                    }
                    int t3 = hr1.t(m4b.a);
                    if (t3 != 0) {
                        if (t3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th4;
                    }
                }
            }
        }
        return new y2f(str3 == null ? "" : str3, j, str2 == null ? "" : str2, i2, hw4, b2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{conversationId='");
        sb.append(this.a);
        sb.append("', startedAt=");
        sb.append(this.b);
        sb.append(", joinLink=");
        sb.append(this.c);
        sb.append(", approxParticipantCount=");
        sb.append(this.o);
        sb.append(", previewParticipantIds=");
        sb.append(this.X);
        sb.append(", type=");
        return wn6.j(sb, this.Y, "}");
    }
}
