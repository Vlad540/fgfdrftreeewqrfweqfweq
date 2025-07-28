package defpackage;

/* renamed from: xr1  reason: default package */
public final class xr1 extends ps1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn1 b;

    public xr1() {
        this.a = 1;
        this.b = null;
    }

    public final void a(int i) {
        switch (this.a) {
            case 0:
                this.b.d(new Exception("Capture request is cancelled because camera is closed", (Throwable) null));
                return;
            case 1:
                sn1 sn1 = this.b;
                if (sn1 != null) {
                    sn1.d(new Exception("Camera is closed"));
                    return;
                }
                return;
            default:
                sn1 sn12 = this.b;
                if (sn12 != null) {
                    sn12.d(new Exception("Camera is closed"));
                    return;
                }
                return;
        }
    }

    public final void b(int i, ws1 ws1) {
        switch (this.a) {
            case 0:
                this.b.b((Object) null);
                return;
            case 1:
                sn1 sn1 = this.b;
                if (sn1 != null) {
                    sn1.b(ws1);
                    return;
                }
                return;
            default:
                sn1 sn12 = this.b;
                if (sn12 != null) {
                    sn12.b((Object) null);
                    return;
                }
                return;
        }
    }

    public final void c(int i, bqc bqc) {
        switch (this.a) {
            case 0:
                this.b.d(new Exception("Capture request failed with reason ".concat("ERROR"), (Throwable) null));
                return;
            case 1:
                sn1 sn1 = this.b;
                if (sn1 != null) {
                    sn1.d(new Exception());
                    return;
                }
                return;
            default:
                sn1 sn12 = this.b;
                if (sn12 != null) {
                    sn12.d(new Exception());
                    return;
                }
                return;
        }
    }

    public /* synthetic */ xr1(sn1 sn1, int i) {
        this.a = i;
        this.b = sn1;
    }
}
