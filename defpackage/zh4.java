package defpackage;

/* renamed from: zh4  reason: default package */
public final class zh4 {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;

    public zh4(ai4 ai4) {
        this.a = ez3.O(1, new xh4(ai4, 1));
        this.b = ez3.O(1, new yh4(this, ai4, 0));
        this.c = ez3.O(1, new xh4(ai4, 2));
        this.d = ez3.O(1, new yh4(this, ai4, 1));
        this.e = ez3.O(1, new xh4(ai4, this));
        this.f = ez3.O(1, new yh4(this, ai4, 2));
    }

    public final ys0 a() {
        return (ys0) this.b.getValue();
    }
}
