package defpackage;

/* renamed from: b9c  reason: default package */
public final class b9c extends lbe {
    public uj3 c;

    public b9c(ws8 ws8) {
        super(ws8);
    }

    public final void b(ws8 ws8, String str) {
        if (str.equals("profile")) {
            this.c = uj3.e(ws8);
        } else {
            ws8.z();
        }
    }

    public final String toString() {
        uj3 uj3 = this.c;
        return "{contactInfo=" + uj3 + "}";
    }
}
