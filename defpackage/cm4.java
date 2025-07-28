package defpackage;

/* renamed from: cm4  reason: default package */
public final class cm4 extends lbe {
    public long c;

    public cm4(ws8 ws8) {
        super(ws8);
    }

    public final void b(ws8 ws8, String str) {
        if (str.equals("time")) {
            this.c = jjd.J(ws8, 0);
        } else {
            ws8.z();
        }
    }

    public final String toString() {
        return us8.j(this.c, "Response{time=", "}");
    }
}
