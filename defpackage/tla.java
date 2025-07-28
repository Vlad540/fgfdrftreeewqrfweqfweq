package defpackage;

import org.webrtc.SessionDescription;

/* renamed from: tla  reason: default package */
public final /* synthetic */ class tla implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zla b;
    public final /* synthetic */ SessionDescription c;

    public /* synthetic */ tla(zla zla, SessionDescription sessionDescription, int i) {
        this.a = i;
        this.b = zla;
        this.c = sessionDescription;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                zla zla = this.b;
                zla.getClass();
                SessionDescription sessionDescription = this.c;
                String str = sessionDescription.description;
                eh5 eh5 = zla.U0;
                if (eh5.c) {
                    eh5.b = 0;
                    eh5.a = 0;
                    eh5.c = false;
                }
                long a2 = eh5.a(str);
                eh5.b = a2;
                if (a2 != 0) {
                    long j = eh5.a;
                    if (j != 0) {
                        eh5.c = true;
                        eh5.d.f(j ^ a2);
                    }
                }
                yla yla = zla.d1;
                if (yla != null) {
                    yla.n(zla, sessionDescription);
                    return;
                }
                return;
            default:
                zla zla2 = this.b;
                zla2.getClass();
                SessionDescription sessionDescription2 = this.c;
                String str2 = sessionDescription2.description;
                eh5 eh52 = zla2.U0;
                if (eh52.c) {
                    eh52.b = 0;
                    eh52.a = 0;
                    eh52.c = false;
                }
                long a3 = eh5.a(str2);
                eh52.a = a3;
                long j2 = eh52.b;
                if (!(j2 == 0 || a3 == 0)) {
                    eh52.c = true;
                    eh52.d.f(a3 ^ j2);
                }
                yla yla2 = zla2.d1;
                if (yla2 != null) {
                    yla2.b(zla2, sessionDescription2);
                    return;
                }
                return;
        }
    }
}
