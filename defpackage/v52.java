package defpackage;

/* renamed from: v52  reason: default package */
public final class v52 extends lbe {
    public j22 c;

    public v52(ws8 ws8) {
        super(ws8);
    }

    public final void b(ws8 ws8, String str) {
        if (str.equals("chat")) {
            this.c = j22.a(ws8);
        } else {
            ws8.z();
        }
    }

    public final String toString() {
        j22 j22 = this.c;
        return "{chat=" + j22 + "}";
    }
}
