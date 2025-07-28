package defpackage;

/* renamed from: pd5  reason: default package */
public final class pd5 extends lbe {
    public String c;

    public pd5(ws8 ws8) {
        super(ws8);
    }

    public final void b(ws8 ws8, String str) {
        str.getClass();
        if (!str.equals("url")) {
            ws8.z();
        } else {
            this.c = jjd.M(ws8);
        }
    }

    public final String toString() {
        return wn6.i("{url='", this.c, "'}");
    }
}
