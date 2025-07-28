package defpackage;

/* renamed from: ra2  reason: default package */
public final class ra2 extends lbe {
    public long c;
    public int o;

    public final void b(ws8 ws8, String str) {
        str.getClass();
        if (str.equals("unread")) {
            this.o = ws8.v0();
        } else if (!str.equals("mark")) {
            ws8.z();
        } else {
            this.c = ws8.w0();
        }
    }

    public final String toString() {
        long j = this.c;
        int i = this.o;
        return "{mark=" + j + ", unread=" + i + "}";
    }
}
