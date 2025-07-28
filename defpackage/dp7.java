package defpackage;

/* renamed from: dp7  reason: default package */
public final class dp7 {
    public static final j67 g = new j67(4);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoginResponse{uid='");
        sb.append(this.a);
        sb.append("', sessionKey='");
        sb.append(this.b);
        sb.append("', secretSessionKey='");
        sb.append(this.c);
        sb.append("', authenticationToken='");
        sb.append(this.d);
        sb.append("', apiServer='");
        sb.append(this.e);
        sb.append("', authenticationHash='");
        return wn6.l(sb, this.f, "'}");
    }
}
