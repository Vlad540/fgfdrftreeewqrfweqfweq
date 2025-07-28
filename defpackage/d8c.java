package defpackage;

/* renamed from: d8c  reason: default package */
public final class d8c extends gs6 {
    public static final d8c y0 = new d8c();
    public final transient Object X;
    public final transient Object[] Y;
    public final transient int Z;
    public final transient int w0;
    public final transient d8c x0;

    public d8c() {
        this.X = null;
        this.Y = new Object[0];
        this.Z = 0;
        this.w0 = 0;
        this.x0 = this;
    }

    public final gt6 c() {
        return new g8c(this, this.Y, this.Z, this.w0);
    }

    public final gt6 d() {
        return new h8c(this, new i8c(this.Z, this.w0, this.Y));
    }

    public final boolean g() {
        return false;
    }

    public final Object get(Object obj) {
        Object k = j8c.k(this.X, this.Y, this.w0, this.Z, obj);
        if (k == null) {
            return null;
        }
        return k;
    }

    public final int size() {
        return this.w0;
    }

    public d8c(int i, Object[] objArr) {
        this.Y = objArr;
        this.w0 = i;
        this.Z = 0;
        int h = i >= 2 ? gt6.h(i) : 0;
        Object j = j8c.j(objArr, i, h, 0);
        if (!(j instanceof Object[])) {
            this.X = j;
            Object j2 = j8c.j(objArr, i, h, 1);
            if (!(j2 instanceof Object[])) {
                this.x0 = new d8c(j2, objArr, i, this);
                return;
            }
            throw ((ys6) ((Object[]) j2)[2]).a();
        }
        throw ((ys6) ((Object[]) j)[2]).a();
    }

    public d8c(Object obj, Object[] objArr, int i, d8c d8c) {
        this.X = obj;
        this.Y = objArr;
        this.Z = 1;
        this.w0 = i;
        this.x0 = d8c;
    }
}
