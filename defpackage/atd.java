package defpackage;

/* renamed from: atd  reason: default package */
public final class atd extends lbe {
    public psd c;

    public atd(ws8 ws8) {
        super(ws8);
    }

    public final void b(ws8 ws8, String str) {
        if (str.equals("sticker")) {
            this.c = psd.a(ws8);
        } else {
            ws8.z();
        }
    }

    public final String toString() {
        return wn6.i("{sticker = ", this.c.toString(), "}");
    }
}
