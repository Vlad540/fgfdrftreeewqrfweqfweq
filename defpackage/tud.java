package defpackage;

/* renamed from: tud  reason: default package */
public final class tud extends lbe {
    public String c;

    public tud(ws8 ws8) {
        super(ws8);
    }

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
