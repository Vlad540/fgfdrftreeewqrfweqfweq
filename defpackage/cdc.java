package defpackage;

/* renamed from: cdc  reason: default package */
public final class cdc extends q1 {
    public final /* synthetic */ ddc X;
    public int c;
    public int o;

    public cdc(ddc ddc) {
        this.X = ddc;
        this.c = ddc.getSize();
        this.o = ddc.c;
    }

    public final void a() {
        int i = this.c;
        if (i == 0) {
            this.a = 2;
            return;
        }
        ddc ddc = this.X;
        Object[] objArr = ddc.a;
        int i2 = this.o;
        this.b = objArr[i2];
        this.a = 1;
        this.o = (i2 + 1) % ddc.b;
        this.c = i - 1;
    }
}
