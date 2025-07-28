package defpackage;

/* renamed from: cd4  reason: default package */
public class cd4 extends qj0 {
    public final bw9 a;
    public Object b;

    public cd4(bw9 bw9) {
        this.a = bw9;
    }

    public void a(Object obj) {
        e(obj);
    }

    public final void clear() {
        lazySet(32);
        this.b = null;
    }

    public final void e(Object obj) {
        int i = get();
        if ((i & 54) == 0) {
            bw9 bw9 = this.a;
            if (i == 8) {
                this.b = obj;
                lazySet(16);
                bw9.c((Object) null);
            } else {
                lazySet(2);
                bw9.c(obj);
            }
            if (get() != 4) {
                bw9.b();
            }
        }
    }

    public void f() {
        set(4);
        this.b = null;
    }

    public final boolean h() {
        return get() == 4;
    }

    public final boolean isEmpty() {
        return get() != 16;
    }

    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        Object obj = this.b;
        this.b = null;
        lazySet(32);
        return obj;
    }

    public final int q(int i) {
        lazySet(8);
        return 2;
    }
}
