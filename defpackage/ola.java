package defpackage;

/* renamed from: ola  reason: default package */
public final /* synthetic */ class ola implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zla b;

    public /* synthetic */ ola(zla zla, int i) {
        this.a = i;
        this.b = zla;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                zla zla = this.b;
                zla.n1 = false;
                yla yla = zla.d1;
                if (yla != null) {
                    yla.d(zla);
                    return;
                }
                return;
            case 1:
                yla yla2 = this.b.d1;
                if (yla2 != null) {
                    yla2.e();
                    return;
                }
                return;
            case 2:
                zla zla2 = this.b;
                zla2.getClass();
                zla2.O0.log("PCRTCClient", "createPeerConnectionFactoryInternal, " + zla2);
                zla2.a1 = false;
                return;
            case 3:
                yla yla3 = this.b.d1;
                if (yla3 != null) {
                    yla3.g();
                    return;
                }
                return;
            case 4:
                zla zla3 = this.b;
                yla yla4 = zla3.d1;
                if (yla4 != null) {
                    yla4.c(zla3);
                    return;
                }
                return;
            case 5:
                zla zla4 = this.b;
                yla yla5 = zla4.d1;
                if (yla5 != null) {
                    yla5.r(zla4);
                    return;
                }
                return;
            case 6:
                this.b.a1 = true;
                return;
            case 7:
                zla zla5 = this.b;
                zla5.q();
                kj kjVar = zla5.x0;
                if (kjVar != null) {
                    kjVar.b();
                    kjVar.a.getClass();
                }
                ni niVar = zla5.z0;
                if (niVar != null) {
                    az3 az3 = niVar.c;
                    if (az3 != null) {
                        az3.c(niVar);
                    }
                    niVar.c = null;
                }
                zla5.O0.log("PCRTCClient", zla5 + ": " + d59.c(zla5) + " was released");
                return;
            default:
                this.b.q();
                return;
        }
    }

    public /* synthetic */ ola(zla zla, String str, int i) {
        this.a = i;
        this.b = zla;
    }
}
