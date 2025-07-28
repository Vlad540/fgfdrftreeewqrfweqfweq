package defpackage;

/* renamed from: bi3  reason: default package */
public final /* synthetic */ class bi3 implements of3, kh7, nf3 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ bi3(int i, boolean z) {
        this.b = i;
        this.c = z;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                gi3 gi3 = (gi3) obj;
                int i = gi3.m;
                boolean z = this.c;
                int i2 = this.b;
                gi3.m = z ? i2 | i : (~i2) & i;
                return;
            default:
                ((qza) obj).H(this.b, this.c);
                return;
        }
    }

    public void invoke(Object obj) {
        ((gya) obj).i(this.b, this.c);
    }

    public /* synthetic */ bi3(boolean z) {
        this.c = z;
        this.b = 1;
    }

    public /* synthetic */ bi3(boolean z, int i) {
        this.c = z;
        this.b = i;
    }
}
