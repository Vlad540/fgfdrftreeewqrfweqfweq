package defpackage;

/* renamed from: c67  reason: default package */
public abstract class c67 extends u66 {
    public static final int[] x0 = a22.h;
    public int[] X;
    public final int Y;
    public yyc Z;
    public final tn6 o;
    public final boolean w0;

    public c67(tn6 tn6, int i) {
        this.a = i;
        this.c = new s67(0, (s67) null, a67.STRICT_DUPLICATE_DETECTION.a(i) ? new nxc(this) : null);
        this.b = a67.WRITE_NUMBERS_AS_STRINGS.a(i);
        this.X = x0;
        this.Z = z94.a;
        this.o = tn6;
        if (a67.ESCAPE_NON_ASCII.a(i)) {
            this.Y = 127;
        }
        this.w0 = !a67.QUOTE_FIELD_NAMES.a(i);
    }
}
