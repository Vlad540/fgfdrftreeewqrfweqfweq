package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: x8f  reason: default package */
public final class x8f extends lbe {
    public ArrayList c;

    public x8f(ws8 ws8) {
        super(ws8);
    }

    public final void b(ws8 ws8, String str) {
        int i;
        int i2 = 1;
        if (hhd.f(str, "info")) {
            this.c = new ArrayList();
            try {
                i = jjd.D(ws8);
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
            int i3 = 0;
            while (i3 < i) {
                try {
                    ArrayList arrayList = this.c;
                    if (arrayList != null) {
                        int x0 = ws8.x0();
                        String str2 = null;
                        String str3 = null;
                        long j = 0;
                        for (int i4 = 0; i4 < x0; i4++) {
                            String z0 = ws8.z0();
                            z0.getClass();
                            char c2 = 65535;
                            switch (z0.hashCode()) {
                                case 116079:
                                    if (z0.equals("url")) {
                                        c2 = 0;
                                        break;
                                    }
                                    break;
                                case 110541305:
                                    if (z0.equals(ApiProtocol.KEY_TOKEN)) {
                                        c2 = 1;
                                        break;
                                    }
                                    break;
                                case 452782838:
                                    if (z0.equals("videoId")) {
                                        c2 = 2;
                                        break;
                                    }
                                    break;
                            }
                            switch (c2) {
                                case 0:
                                    ws8 ws82 = ws8;
                                    str2 = jjd.M(ws8);
                                    break;
                                case 1:
                                    ws8 ws83 = ws8;
                                    str3 = jjd.M(ws8);
                                    break;
                                case 2:
                                    j = jjd.J(ws8, 0);
                                    break;
                                default:
                                    ws8.z();
                                    ws8 ws84 = ws8;
                                    break;
                            }
                        }
                        ws8 ws85 = ws8;
                        arrayList.add(new y8f(j, str2, str3));
                        i2 = 1;
                    } else {
                        ws8 ws86 = ws8;
                    }
                    i3 += i2;
                } catch (Throwable th3) {
                    udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                    Iterator it2 = uzc.a.iterator();
                    while (it2.hasNext()) {
                        ((ny9) it2.next()).getClass();
                        ny9.a(th3);
                    }
                    int t2 = hr1.t(m4b.a);
                    if (t2 == 0) {
                        return;
                    }
                    if (t2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
            }
            return;
        }
        ws8 ws87 = ws8;
        try {
            ws8.z();
        } catch (Throwable th4) {
            Throwable th5 = th4;
            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
            Iterator it3 = uzc.a.iterator();
            while (it3.hasNext()) {
                ((ny9) it3.next()).getClass();
                ny9.a(th5);
            }
            int t3 = hr1.t(m4b.a);
            if (t3 == 0) {
                return;
            }
            if (t3 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            throw th5;
        }
    }

    public final String toString() {
        ArrayList arrayList = this.c;
        return wn6.i("{videoUploadInfo=[", o23.c0(arrayList != null ? o23.s0(arrayList) : hw4.a, (String) null, (String) null, (String) null, new u1c(28), 31), "]}");
    }
}
