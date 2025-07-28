package defpackage;

import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.internal.event.EventQueueCollector;

/* renamed from: cz0  reason: default package */
public final /* synthetic */ class cz0 implements EventQueueCollector.IdleStateProvider, of3, lh7, kh7, nf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ cz0() {
        this.a = 10;
        this.b = true;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                y52 y52 = (y52) obj;
                y52.d0 = new kp0(y52.d0.a, this.b);
                return;
            case 5:
                m00 m00 = (m00) obj;
                if (this.b) {
                    m00.i = g10.o;
                    return;
                } else {
                    m00.i = g10.a;
                    return;
                }
            case 7:
                ((qza) obj).Y(this.b);
                return;
            case 8:
                ((qza) obj).q0(this.b);
                return;
            case 9:
                ((qza) obj).w(this.b);
                return;
            case 10:
                m00 m002 = (m00) obj;
                boolean z = this.b;
                m002.x = z;
                if (m002.r != null && m002.b().d != null) {
                    m00 j = m002.b().d.j();
                    j.x = z;
                    o10 a2 = j.a();
                    u00 a3 = m002.b().a();
                    a3.e = a2;
                    m002.r = new v00(a3);
                    return;
                }
                return;
            default:
                m00 m003 = (m00) obj;
                boolean K = ete.K(m003);
                if (m003.d != null || K) {
                    boolean z2 = this.b;
                    if (K) {
                        k10 a4 = m003.b().d.d.a();
                        a4.n = z2;
                        n10 n10 = new n10(a4);
                        m00 j2 = m003.b().d.j();
                        j2.d = n10;
                        o10 a5 = j2.a();
                        u00 a6 = m003.b().a();
                        a6.e = a5;
                        m003.r = new v00(a6);
                        return;
                    }
                    k10 a7 = m003.c().a();
                    a7.n = z2;
                    m003.d = new n10(a7);
                    return;
                }
                return;
        }
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 2:
                ((hya) obj).O(this.b);
                return;
            case 3:
                ((hya) obj).j(this.b);
                return;
            case 4:
                ((gya) obj).j(this.b);
                return;
            default:
                ((hya) obj).O(this.b);
                return;
        }
    }

    public boolean isIdle() {
        return CallAnalyticsSender.setIdle$lambda$0(this.b);
    }

    public /* synthetic */ cz0(boolean z, int i) {
        this.a = i;
        this.b = z;
    }
}
