package defpackage;

/* renamed from: sm9  reason: default package */
public final class sm9 extends lbe {
    public long X;
    public long c;
    public m2b o;

    public final void b(ws8 ws8, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1276666629:
                if (str.equals("presence")) {
                    c2 = 0;
                    break;
                }
                break;
            case -836030906:
                if (str.equals("userId")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3560141:
                if (str.equals("time")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.o = m2b.a(ws8);
                return;
            case 1:
                this.c = ws8.w0();
                return;
            case 2:
                this.X = ws8.w0();
                return;
            default:
                ws8.z();
                return;
        }
    }

    public final String toString() {
        long j = this.c;
        m2b m2b = this.o;
        long j2 = this.X;
        return "{userId=" + j + ", presence=" + m2b + ", time=" + j2 + "}";
    }
}
