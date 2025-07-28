package defpackage;

import java.util.Arrays;
import java.util.Locale;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: sm7  reason: default package */
public final class sm7 extends ol implements tna, qce {
    public final long X;
    public final String Y = sm7.class.getName();
    public final long o;

    public sm7(long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.X = j3;
    }

    public final void c(lbe lbe) {
        tm7 tm7 = (tm7) lbe;
        i22 y = m().y(this.o);
        if (y != null) {
            to8 p = p();
            ym8 ym8 = tm7.c;
            long f = p.f(y.a, ((j2b) r()).a.s(), ym8);
            if (f != 0) {
                l().c(new ove(y.a, f, 0));
                return;
            }
            udd.s(this.Y, String.format(Locale.ENGLISH, "Can't insert message: response = %s", Arrays.copyOf(new Object[]{tm7}, 1)), (Throwable) null);
        }
    }

    public final void d(uae uae) {
        l().c(new jh0(this.a, uae));
        if (!iu7.F(uae.b)) {
            f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002b, code lost:
        r7 = p().j(r0.a, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0037, code lost:
        r0 = defpackage.ls8.DELETED;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onPreExecute: serverChatId = "
            r0.<init>(r1)
            long r1 = r7.o
            r0.append(r1)
            java.lang.String r3 = ", serverMessageId = "
            r0.append(r3)
            long r3 = r7.X
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = r7.Y
            udd.q(r5, r0)
            t52 r0 = r7.m()
            i22 r0 = r0.y(r1)
            r1 = 3
            if (r0 != 0) goto L_0x002b
            return r1
        L_0x002b:
            to8 r7 = r7.p()
            long r5 = r0.a
            vo8 r7 = r7.j(r5, r3)
            if (r7 == 0) goto L_0x0040
            ls8 r0 = defpackage.ls8.DELETED
            ls8 r7 = r7.z0
            if (r7 != r0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r7 = 1
            return r7
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sm7.e():int");
    }

    public final void f() {
        udd.s(this.Y, "onMaxFailCount", (Throwable) null);
        t().d(this.a);
    }

    public final byte[] g() {
        Tasks.LocationStop locationStop = new Tasks.LocationStop();
        locationStop.requestId = this.a;
        locationStop.chatId = this.o;
        locationStop.messageId = this.X;
        return gr8.toByteArray(locationStop);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_LOCATION_STOP;
    }

    public final int h() {
        return 1000000;
    }

    public final ibe i() {
        pn2 pn2 = new pn2((dfa) null, 16);
        pn2.n(this.o, ApiProtocol.PARAM_CHAT_ID);
        pn2.n(this.X, "messageId");
        return pn2;
    }
}
