package defpackage;

/* renamed from: pt  reason: default package */
public final class pt extends lbe {
    public boolean c;
    public long o;

    public pt(ws8 ws8) {
        super(ws8);
    }

    public final void b(ws8 ws8, String str) {
        str.getClass();
        if (str.equals("success")) {
            this.c = jjd.E(ws8);
        } else if (!str.equals("updateTime")) {
            ws8.z();
        } else {
            this.o = jjd.J(ws8, 0);
        }
    }

    public final String toString() {
        boolean z = this.c;
        long j = this.o;
        return "Response{success=" + z + ", updateTime=" + j + "}";
    }
}
