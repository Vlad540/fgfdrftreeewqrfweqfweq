package defpackage;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: xr7  reason: default package */
public final class xr7 {
    public final pae a;
    public final t97 b;
    public final t97 c;
    public final ContextScope d;
    public final jc9 e = new jc9();
    public final LinkedHashMap f = new LinkedHashMap();
    public long g = -1;
    public boolean h = true;
    public boolean i;

    public xr7(t97 t97, t97 t972, pae pae) {
        this.a = pae;
        this.b = t97;
        this.c = t972;
        this.d = n1g.a(((n3a) pae).b());
        long[] jArr = llc.a;
    }

    public final void a(List list) {
        oma oma = oma.CHAT_INIT_TO_RENDER;
        jc9 jc9 = this.e;
        nma nma = (nma) jc9.f(oma);
        if (nma != null && nma.e == -1) {
            nma nma2 = (nma) jc9.f(oma);
            if (nma2 != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                nma2.e = elapsedRealtime - nma2.b;
                nma2.h = list;
                f(elapsedRealtime);
            }
            if (!this.i) {
                this.g = ((i03) ((f03) this.b.getValue())).D();
            }
            ((uma) this.c.getValue()).d(1, 0);
        }
    }

    public final void b(List list) {
        oma oma = oma.CHATS_INIT_TO_RENDER;
        jc9 jc9 = this.e;
        nma nma = (nma) jc9.f(oma);
        if (nma != null && nma.e == -1) {
            nma nma2 = (nma) jc9.f(oma);
            if (nma2 != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                nma2.e = elapsedRealtime - nma2.b;
                nma2.h = list;
                nma nma3 = (nma) jc9.f(oma.FOLDERS_INIT_TO_RENDER);
                if (nma3 == null || nma3.e != -1) {
                    f(elapsedRealtime);
                }
            }
            ((uma) this.c.getValue()).e(1, 0);
        }
    }

    public final qma c(lma lma) {
        lg7 lg7;
        nma nma;
        oma oma = oma.MAIN_ACTIVITY_INIT_TO_RENDER;
        jc9 jc9 = this.e;
        nma nma2 = (nma) jc9.f(oma);
        long j = 0;
        if (nma2 != null) {
            if (!this.h) {
                nma2 = null;
            }
            if (nma2 != null) {
                nma2.f = 0;
                j = 1;
            }
        }
        oma oma2 = oma.FOLDERS_INIT_TO_RENDER;
        nma nma3 = (nma) jc9.f(oma2);
        lma lma2 = lma.EVENT_OPEN_CHATS;
        long j2 = -1;
        if (nma3 != null) {
            if (lma != lma2) {
                nma3 = null;
            }
            if (nma3 != null) {
                nma3.f = j;
                j++;
                if (this.h) {
                    nma nma4 = (nma) jc9.f(oma);
                    nma3.g = nma4 != null ? nma4.f : -1;
                }
            }
        }
        oma oma3 = oma.CHATS_INIT_TO_RENDER;
        nma nma5 = (nma) jc9.f(oma3);
        if (nma5 != null) {
            if (lma != lma2) {
                nma5 = null;
            }
            if (nma5 != null) {
                nma5.f = j;
                j++;
                if (this.h) {
                    nma nma6 = (nma) jc9.f(oma);
                    nma5.g = nma6 != null ? nma6.f : -1;
                }
            }
        }
        oma oma4 = oma.CHAT_INIT_TO_RENDER;
        nma nma7 = (nma) jc9.f(oma4);
        if (nma7 != null) {
            if (lma != lma.EVENT_OPEN_CHAT) {
                nma7 = null;
            }
            if (nma7 != null) {
                nma7.f = j;
                if (this.h) {
                    nma nma8 = (nma) jc9.f(oma);
                    nma7.g = nma8 != null ? nma8.f : -1;
                }
            }
        }
        int ordinal = lma.ordinal();
        if (ordinal == 1) {
            lg7 c2 = hwf.c();
            if (!this.h) {
                return null;
            }
            nma nma9 = (nma) jc9.f(oma);
            if (nma9 != null) {
                j2 = nma9.e;
                c2.add(nma9);
            }
            nma nma10 = (nma) jc9.f(oma2);
            if (nma10 != null) {
                c2.add(nma10);
            }
            nma nma11 = (nma) jc9.f(oma3);
            if (nma11 != null) {
                c2.add(nma11);
            }
            lg7 = hwf.a(c2);
        } else if (ordinal != 2) {
            return null;
        } else {
            lg7 c3 = hwf.c();
            if (this.h && (nma = (nma) jc9.f(oma)) != null) {
                j2 = nma.e;
                c3.add(nma);
            }
            nma nma12 = (nma) jc9.f(oma4);
            if (nma12 == null) {
                return null;
            }
            if (!this.h) {
                j2 = nma12.e;
            }
            c3.add(nma12);
            lg7 = hwf.a(c3);
        }
        this.h = false;
        return new qma(j2, lg7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r3.hashCode();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(android.content.Intent r3) {
        /*
            r2 = this;
            java.lang.String r3 = r3.getAction()
            if (r3 == 0) goto L_0x0037
            int r0 = r3.hashCode()
            r1 = -1173447682(0xffffffffba0e9bfe, float:-5.440115E-4)
            if (r0 == r1) goto L_0x002c
            r1 = -1173264947(0xffffffffba1165cd, float:-5.5464805E-4)
            if (r0 == r1) goto L_0x0023
            r1 = -58484670(0xfffffffffc839842, float:-5.4662324E36)
            if (r0 == r1) goto L_0x001a
            goto L_0x0037
        L_0x001a:
            java.lang.String r0 = "android.intent.action.SEND_MULTIPLE"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0035
            goto L_0x0037
        L_0x0023:
            java.lang.String r0 = "android.intent.action.SEND"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0037
            goto L_0x0035
        L_0x002c:
            java.lang.String r0 = "android.intent.action.MAIN"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r3 = 0
            goto L_0x0038
        L_0x0037:
            r3 = 1
        L_0x0038:
            r2.i = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xr7.d(android.content.Intent):void");
    }

    public final void e(lma lma, List list) {
        g37 g37 = (g37) this.f.remove(lma);
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.e.i(((nma) it.next()).a);
        }
        this.i = false;
    }

    public final void f(long j) {
        nma nma = (nma) this.e.f(oma.MAIN_ACTIVITY_INIT_TO_RENDER);
        if (nma != null) {
            if (nma.e != -1) {
                nma = null;
            }
            if (nma != null) {
                nma.e = j - nma.b;
            }
        }
    }
}
