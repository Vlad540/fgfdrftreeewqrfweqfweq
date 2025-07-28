package defpackage;

/* renamed from: vb6  reason: default package */
public final class vb6 {
    public final zb6 a;
    public final bc6 b;
    public boolean c = true;

    public vb6(zb6 zb6, bc6 bc6) {
        this.a = zb6;
        this.b = bc6;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" ");
        sb.append(!this.c ? "+>" : "->");
        sb.append(" ");
        sb.append(this.b);
        return sb.toString();
    }
}
