package defpackage;

/* renamed from: nn8  reason: default package */
public final class nn8 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ on8 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nn8(Object obj, on8 on8, int i) {
        super(9, obj);
        this.c = i;
        this.o = on8;
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!hhd.f(obj, obj2)) {
                    int[] iArr = (int[]) obj;
                    on8 on8 = this.o;
                    on8.c((int[]) obj2, on8.getBounds());
                    return;
                }
                return;
            default:
                if (!hhd.f(obj, obj2)) {
                    int[] iArr2 = (int[]) obj;
                    on8 on82 = this.o;
                    on82.d((int[]) obj2, on82.getBounds());
                    return;
                }
                return;
        }
    }
}
