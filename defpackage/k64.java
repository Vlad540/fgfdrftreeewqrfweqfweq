package defpackage;

/* renamed from: k64  reason: default package */
public final class k64 {
    public final /* synthetic */ int a;
    public final String b;
    public final String c;

    public /* synthetic */ k64(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.b);
                sb.append("(");
                return wn6.l(sb, this.c, ")");
            default:
                return this.b + ", " + this.c;
        }
    }
}
