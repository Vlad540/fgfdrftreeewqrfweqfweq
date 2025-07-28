package defpackage;

/* renamed from: x52  reason: default package */
public final class x52 {
    public final long a;
    public final int b;
    public final long c;
    public final String d;

    public x52(w52 w52) {
        this.a = w52.b;
        this.b = w52.a;
        this.c = w52.c;
        this.d = (String) w52.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdminParticipant{id=");
        sb.append(this.a);
        sb.append(", permissions=");
        sb.append(this.b);
        sb.append(", inviterId=");
        sb.append(this.c);
        sb.append(", alias='");
        return wn6.l(sb, this.d, "'}");
    }
}
