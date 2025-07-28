package defpackage;

/* renamed from: k99  reason: default package */
public final class k99 extends lbe {
    public zy c;

    public k99(ws8 ws8) {
        super(ws8);
    }

    public final void b(ws8 ws8, String str) {
        str.getClass();
        if (!str.equals("attachments")) {
            ws8.z();
        } else {
            this.c = zy.a(ws8);
        }
    }

    public final String toString() {
        zy zyVar = this.c;
        return "{attaches=" + zyVar + "}";
    }
}
