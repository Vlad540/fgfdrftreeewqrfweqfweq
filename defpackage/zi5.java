package defpackage;

/* renamed from: zi5  reason: default package */
public final class zi5 {
    public final mv4 a;
    public final yi5 b;

    /* JADX WARNING: type inference failed for: r0v2, types: [yi5, w66] */
    public zi5(lk9 lk9, h0b h0b) {
        if (h0b.d > 0) {
            this.b = new w66(lk9, h0b, mk9.j());
            this.a = new mv4(14, this);
            return;
        }
        throw new IllegalArgumentException();
    }

    public final t54 a(int i) {
        return e13.p0((byte[]) this.b.get(i), this.a, e13.Y);
    }
}
