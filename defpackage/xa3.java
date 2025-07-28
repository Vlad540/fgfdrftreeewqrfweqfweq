package defpackage;

/* renamed from: xa3  reason: default package */
public final class xa3 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public xa3(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo{sessionKey='");
        sb.append(this.a);
        sb.append("', sessionSecret='");
        sb.append(this.b);
        sb.append("', apiEndpoint='");
        sb.append(this.c);
        sb.append("', authToken='");
        return wn6.l(sb, this.d, "'}");
    }
}
