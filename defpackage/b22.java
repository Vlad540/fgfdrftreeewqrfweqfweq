package defpackage;

/* renamed from: b22  reason: default package */
public final class b22 {
    public final String a;
    public final b22 b;
    public final int c;

    public b22(String str, b22 b22) {
        this.a = str;
        this.b = b22;
        this.c = b22 != null ? 1 + b22.c : 1;
    }
}
