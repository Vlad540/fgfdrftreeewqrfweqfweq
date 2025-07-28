package defpackage;

/* renamed from: ib4  reason: default package */
public final class ib4 extends wb4 implements Comparable {
    public final int X;
    public final int Y = this.o.b();

    public ib4(int i, uoe uoe, int i2, nb4 nb4, int i3) {
        super(i, uoe, i2);
        this.X = qi0.o(i3, nb4.t0) ? 1 : 0;
    }

    public final int a() {
        return this.X;
    }

    public final /* bridge */ /* synthetic */ boolean b(wb4 wb4) {
        ib4 ib4 = (ib4) wb4;
        return false;
    }

    public final int compareTo(Object obj) {
        return Integer.compare(this.Y, ((ib4) obj).Y);
    }
}
