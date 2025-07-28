package defpackage;

/* renamed from: dk1  reason: default package */
public final /* synthetic */ class dk1 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ik1 b;

    public /* synthetic */ dk1(ik1 ik1, int i) {
        this.a = i;
        this.b = ik1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                ik1.B(this.b);
                return jue.a;
            case 1:
                return this.b.V0;
            case 2:
                return this.b.Y0;
            case 3:
                return this.b.V0;
            case 4:
                raf raf = raf.a;
                ik1 ik1 = this.b;
                return new ed1(raf, new hk1(ik1), new dk1(ik1, 1), new dk1(ik1, 2), (s51) null, 34);
            default:
                return this.b.V0;
        }
    }
}
