package defpackage;

/* renamed from: la3  reason: default package */
public final class la3 extends lbe {
    public String c;
    public gze o;

    public final void b(ws8 ws8, String str) {
        str.getClass();
        if (str.equals("hash")) {
            this.c = ws8.z0();
        } else if (!str.equals("user")) {
            ws8.z();
        } else {
            this.o = ez3.U(ws8);
        }
    }

    public final String toString() {
        String str = this.c;
        gze gze = this.o;
        return "{hash='" + str + "', userSettings=" + gze + "}";
    }
}
