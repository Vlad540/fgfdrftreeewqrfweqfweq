package defpackage;

/* renamed from: jh0  reason: default package */
public class jh0 extends kh0 {
    public final uae b;

    public jh0(uae uae) {
        this(Long.MIN_VALUE, uae);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BaseErrorEvent{error=");
        sb.append(this.b);
        sb.append(", requestId=");
        return m4b.i(sb, this.a, '}');
    }

    public jh0(long j, uae uae) {
        super(j);
        this.b = uae;
    }
}
