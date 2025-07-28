package defpackage;

/* renamed from: k8c  reason: default package */
public final class k8c extends gt6 {
    public static final Object[] x0;
    public static final k8c y0;
    public final transient int X;
    public final transient Object[] Y;
    public final transient int Z;
    public final transient Object[] o;
    public final transient int w0;

    static {
        Object[] objArr = new Object[0];
        x0 = objArr;
        y0 = new k8c(0, 0, 0, objArr, objArr);
    }

    public k8c(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.o = objArr;
        this.X = i;
        this.Y = objArr2;
        this.Z = i2;
        this.w0 = i3;
    }

    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.o;
        int i2 = this.w0;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    public final Object[] c() {
        return this.o;
    }

    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.Y;
            if (objArr.length != 0) {
                int F = gp0.F(obj);
                while (true) {
                    int i = F & this.Z;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    F = i + 1;
                }
            }
        }
        return false;
    }

    public final int d() {
        return this.w0;
    }

    public final int e() {
        return 0;
    }

    public final boolean f() {
        return false;
    }

    public final rue g() {
        return a().listIterator(0);
    }

    public final int hashCode() {
        return this.X;
    }

    public final ws6 k() {
        return ws6.h(this.w0, this.o);
    }

    public final int size() {
        return this.w0;
    }
}
