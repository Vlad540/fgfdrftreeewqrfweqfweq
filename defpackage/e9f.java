package defpackage;

/* renamed from: e9f  reason: default package */
public final class e9f extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ f9f o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e9f(f9f f9f, int i) {
        super(9, (Object) null);
        this.c = i;
        switch (i) {
            case 1:
                c9f c9f = c9f.a;
                this.o = f9f;
                super(9, (Object) c9f);
                return;
            default:
                this.o = f9f;
                return;
        }
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!hhd.f(obj, obj2)) {
                    float[] fArr = (float[]) obj2;
                    float[] fArr2 = (float[]) obj;
                    this.o.requestLayout();
                    return;
                }
                return;
            default:
                if (!hhd.f(obj, obj2)) {
                    c9f c9f = (c9f) obj2;
                    c9f c9f2 = (c9f) obj;
                    this.o.requestLayout();
                    return;
                }
                return;
        }
    }
}
