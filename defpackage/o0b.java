package defpackage;

/* renamed from: o0b  reason: default package */
public class o0b implements n0b {
    public final Object[] a;
    public int b;

    public o0b(int i) {
        if (i > 0) {
            this.a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0".toString());
    }

    public void a(Object obj) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            objArr[i] = obj;
            this.b = i + 1;
        }
    }

    public boolean g(Object obj) {
        Object[] objArr;
        boolean z;
        int i = this.b;
        int i2 = 0;
        while (true) {
            objArr = this.a;
            if (i2 >= i) {
                z = false;
                break;
            } else if (objArr[i2] == obj) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            int i3 = this.b;
            if (i3 >= objArr.length) {
                return false;
            }
            objArr[i3] = obj;
            this.b = i3 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!".toString());
    }

    public Object h() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.b = i - 1;
        return obj;
    }

    public o0b() {
        this.a = new Object[256];
    }
}
