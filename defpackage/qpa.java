package defpackage;

/* renamed from: qpa  reason: default package */
public final class qpa extends lbe {
    public String c;

    public final void b(ws8 ws8, String str) {
        if (str.equals("url")) {
            this.c = ws8.z0();
        } else {
            ws8.z();
        }
    }

    public final String toString() {
        return wn6.i("{url='", this.c, "'}");
    }
}
