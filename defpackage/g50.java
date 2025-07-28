package defpackage;

/* renamed from: g50  reason: default package */
public final class g50 {
    public static final g50 e = new g50(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public g50(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = mze.B(i3) ? mze.v(i3, i2) : -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(83);
        sb.append("AudioFormat[sampleRate=");
        sb.append(this.a);
        sb.append(", channelCount=");
        sb.append(this.b);
        sb.append(", encoding=");
        sb.append(this.c);
        sb.append(']');
        return sb.toString();
    }
}
