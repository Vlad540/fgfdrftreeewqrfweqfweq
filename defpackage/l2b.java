package defpackage;

/* renamed from: l2b  reason: default package */
public final class l2b {
    public static final l2b c = new l2b(0, 0);
    public static final l2b d = new l2b(30, 0);
    public final int a;
    public final int b;

    public l2b(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Presence{type=");
        sb.append(this.a);
        sb.append(",seen=");
        return wn6.j(sb, this.b, "}");
    }
}
