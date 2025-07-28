package defpackage;

/* renamed from: lzd  reason: default package */
public abstract class lzd {
    public final /* synthetic */ int a;
    public long b;
    public long c;
    public long d;
    public int e;
    public int f;
    public long g;
    public boolean h;
    public boolean i;
    public final Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;

    public lzd(int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.j = new iw9(1);
                this.n = new j1c();
                return;
            default:
                this.j = new iw9(0);
                this.n = new v2b(8);
                return;
        }
    }

    public void a(long j2) {
        switch (this.a) {
            case 0:
                this.d = j2;
                return;
            default:
                this.d = j2;
                return;
        }
    }

    public abstract long b(ija ija);

    public abstract long c(yze yze);

    public abstract boolean d(ija ija, long j2, j1c j1c);

    public abstract boolean e(yze yze, long j2, v2b v2b);

    public void f(boolean z) {
        switch (this.a) {
            case 0:
                if (z) {
                    this.n = new v2b(8);
                    this.c = 0;
                    this.e = 0;
                } else {
                    this.e = 1;
                }
                this.b = -1;
                this.d = 0;
                return;
            default:
                if (z) {
                    this.n = new j1c();
                    this.c = 0;
                    this.e = 0;
                } else {
                    this.e = 1;
                }
                this.b = -1;
                this.d = 0;
                return;
        }
    }
}
