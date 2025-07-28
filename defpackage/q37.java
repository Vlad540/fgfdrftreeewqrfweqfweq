package defpackage;

/* renamed from: q37  reason: default package */
public abstract class q37 {
    public boolean a;
    public int b;

    public final void a(int i) {
        if (!this.a) {
            this.a = true;
            this.b = i;
        } else if (this.b != i) {
            StringBuilder m = me4.m(i, "Given job ID ", " is different than previous ");
            m.append(this.b);
            throw new IllegalArgumentException(m.toString());
        }
    }

    public void b() {
    }
}
