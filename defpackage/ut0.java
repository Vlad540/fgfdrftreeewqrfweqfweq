package defpackage;

/* renamed from: ut0  reason: default package */
public final class ut0 extends kw1 {
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ut0(int i, lhd lhd, Float f, int i2) {
        super(i, lhd, f);
        this.o = i2;
    }

    public final String toString() {
        switch (this.o) {
            case 0:
                return "[ButtCap]";
            case 1:
                return "[RoundCap]";
            default:
                return "[SquareCap]";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ut0() {
        super(0, (lhd) null, (Float) null);
        this.o = 0;
    }
}
