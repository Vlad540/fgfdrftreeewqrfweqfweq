package defpackage;

/* renamed from: b15  reason: default package */
public final class b15 {
    public final v05[] a;
    public final long[] b;
    public final String c;
    public final String d;

    public b15(String str, String str2, long[] jArr, v05[] v05Arr) {
        this.c = str;
        this.d = str2;
        this.b = jArr;
        this.a = v05Arr;
    }

    public final String a() {
        String str = this.c;
        int e = me4.e(1, str);
        String str2 = this.d;
        StringBuilder sb = new StringBuilder(me4.e(e, str2));
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return sb.toString();
    }
}
