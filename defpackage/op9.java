package defpackage;

import ru.ok.tamtam.android.services.NotificationTamService;

/* renamed from: op9  reason: default package */
public final /* synthetic */ class op9 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationTamService b;

    public /* synthetic */ op9(NotificationTamService notificationTamService, int i) {
        this.a = i;
        this.b = notificationTamService;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                nqc nqc = this.b.a;
                if (nqc == null) {
                    nqc = null;
                }
                return nqc.q();
            case 1:
                NotificationTamService notificationTamService = this.b;
                nqc nqc2 = notificationTamService.a;
                nqc nqc3 = null;
                if (nqc2 == null) {
                    nqc2 = null;
                }
                ju3 b2 = nqc2.s().b();
                nqc nqc4 = notificationTamService.a;
                if (nqc4 != null) {
                    nqc3 = nqc4;
                }
                return n1g.a(b2.plus(new qj(nqc3.i())).plus(x87.c()));
            case 2:
                nqc nqc5 = this.b.a;
                if (nqc5 == null) {
                    nqc5 = null;
                }
                return (p7a) nqc5.l().f.getValue();
            case 3:
                nqc nqc6 = this.b.a;
                if (nqc6 == null) {
                    nqc6 = null;
                }
                return nqc6.f();
            case 4:
                nqc nqc7 = this.b.a;
                if (nqc7 == null) {
                    nqc7 = null;
                }
                return ((hz3) ((a04) nqc7.getAccessor().c(a04.class))).b;
            case 5:
                nqc nqc8 = this.b.a;
                if (nqc8 == null) {
                    nqc8 = null;
                }
                return (m0c) nqc8.getAccessor().c(m0c.class);
            case 6:
                nqc nqc9 = this.b.a;
                if (nqc9 == null) {
                    nqc9 = null;
                }
                return (mr9) nqc9.l().h.getValue();
            default:
                nqc nqc10 = this.b.a;
                if (nqc10 == null) {
                    nqc10 = null;
                }
                return (kq9) nqc10.l().g.getValue();
        }
    }
}
