package defpackage;

/* renamed from: tm7  reason: default package */
public final class tm7 extends lbe {
    public ym8 c;

    public tm7(ws8 ws8) {
        super(ws8);
    }

    public final void b(ws8 ws8, String str) {
        str.getClass();
        if (!str.equals("message")) {
            ws8.z();
        } else {
            this.c = hhd.H(ws8);
        }
    }

    public final String toString() {
        ym8 ym8 = this.c;
        return "{message=" + ym8 + "}";
    }
}
