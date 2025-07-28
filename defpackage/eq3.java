package defpackage;

/* renamed from: eq3  reason: default package */
public final class eq3 {
    public final /* synthetic */ int a = 0;
    public long b;
    public String c;
    public String d;
    public String e;

    public /* synthetic */ eq3() {
    }

    public boolean a() {
        String str = this.d;
        return str != null && str.length() != 0 && p0e.Q(str, "image/", true) && !h0e.R(str, "djvu", true);
    }

    public boolean b() {
        String str = this.d;
        return (str == null || str.length() == 0 || !p0e.Q(str, "video/", true)) ? false : true;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentUriParams{contentLength=");
                sb.append(this.b);
                sb.append(", contentName='");
                sb.append(this.c);
                sb.append("', mimeType='");
                sb.append(this.d);
                sb.append("', path='");
                return wn6.l(sb, this.e, "'}");
            default:
                return super.toString();
        }
    }

    public eq3(eq3 eq3) {
        this.b = eq3.b;
        this.c = eq3.c;
        this.d = eq3.d;
        this.e = eq3.e;
    }
}
