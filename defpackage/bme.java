package defpackage;

/* renamed from: bme  reason: default package */
public final class bme extends ccf {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public bme(cme cme, int i) {
        this.d = cme;
        this.c = i;
        this.b = false;
    }

    public void a() {
        switch (this.a) {
            case 0:
                this.b = true;
                return;
            default:
                return;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                ((cme) this.d).a.setVisibility(0);
                return;
            default:
                if (!this.b) {
                    this.b = true;
                    bcf bcf = ((acf) this.d).d;
                    if (bcf != null) {
                        bcf.b();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void c() {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    ((cme) this.d).a.setVisibility(this.c);
                    return;
                }
                return;
            default:
                int i = this.c + 1;
                this.c = i;
                acf acf = (acf) this.d;
                if (i == acf.a.size()) {
                    bcf bcf = acf.d;
                    if (bcf != null) {
                        bcf.c();
                    }
                    this.c = 0;
                    this.b = false;
                    acf.e = false;
                    return;
                }
                return;
        }
    }

    public bme(acf acf) {
        this.d = acf;
        this.b = false;
        this.c = 0;
    }
}
