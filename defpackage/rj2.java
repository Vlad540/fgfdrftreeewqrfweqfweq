package defpackage;

/* renamed from: rj2  reason: default package */
public final class rj2 extends lbe {
    public j22 c;

    public rj2(ws8 ws8) {
        super(ws8);
    }

    public final void b(ws8 ws8, String str) {
        str.getClass();
        if (!str.equals("chat")) {
            ws8.z();
        } else {
            this.c = j22.a(ws8);
        }
    }

    public final String toString() {
        j22 j22 = this.c;
        return "{chat=" + j22 + "}";
    }
}
