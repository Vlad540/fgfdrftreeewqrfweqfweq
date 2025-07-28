package defpackage;

/* renamed from: tlc  reason: default package */
public final class tlc {
    public final String a;
    public final long b;
    public final boolean c;
    public final String d;

    public tlc(long j, String str, ym8 ym8, String str2) {
        this.a = ym8.Z;
        nd4 nd4 = ym8.H0;
        this.b = nd4 != null ? nd4.a : System.currentTimeMillis();
        this.c = ym8.X == ms8.o;
        Object X = o23.X(ym8.w0);
        String str3 = null;
        fpa fpa = X instanceof fpa ? (fpa) X : null;
        if (fpa != null) {
            String str4 = fpa.B0;
            str3 = str4 == null ? fpa.o : str4;
        }
        this.d = str3;
    }
}
