package defpackage;

/* renamed from: ql9  reason: default package */
public final class ql9 extends lbe {
    public uj3 c;

    public final void b(ws8 ws8, String str) {
        if (str.equals("contact")) {
            this.c = uj3.e(ws8);
        } else {
            ws8.z();
        }
    }

    public final String toString() {
        uj3 uj3 = this.c;
        return "{contact=" + uj3 + "}";
    }
}
