package defpackage;

import java.util.Arrays;

/* renamed from: fmd  reason: default package */
public final class fmd implements Cloneable {
    public /* synthetic */ int[] a;
    public /* synthetic */ Object[] b;
    public /* synthetic */ int c;

    public fmd() {
        this(0);
    }

    public final void a(int i, Object obj) {
        int i2 = this.c;
        if (i2 == 0 || i > this.a[i2 - 1]) {
            if (i2 >= this.a.length) {
                int i3 = (i2 + 1) * 4;
                int i4 = 4;
                while (true) {
                    if (i4 >= 32) {
                        break;
                    }
                    int i5 = (1 << i4) - 12;
                    if (i3 <= i5) {
                        i3 = i5;
                        break;
                    }
                    i4++;
                }
                int i6 = i3 / 4;
                this.a = Arrays.copyOf(this.a, i6);
                this.b = Arrays.copyOf(this.b, i6);
            }
            this.a[i2] = i;
            this.b[i2] = obj;
            this.c = i2 + 1;
            return;
        }
        d(i, obj);
    }

    /* renamed from: b */
    public final fmd clone() {
        fmd fmd = (fmd) super.clone();
        fmd.a = (int[]) this.a.clone();
        fmd.b = (Object[]) this.b.clone();
        return fmd;
    }

    public final Object c(int i) {
        Object obj;
        int h = e07.h(this.c, i, this.a);
        if (h < 0 || (obj = this.b[h]) == wx3.f) {
            return null;
        }
        return obj;
    }

    public final void d(int i, Object obj) {
        int h = e07.h(this.c, i, this.a);
        if (h >= 0) {
            this.b[h] = obj;
            return;
        }
        int i2 = ~h;
        int i3 = this.c;
        if (i2 < i3) {
            Object[] objArr = this.b;
            if (objArr[i2] == wx3.f) {
                this.a[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.a.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            this.a = Arrays.copyOf(this.a, i7);
            this.b = Arrays.copyOf(this.b, i7);
        }
        int i8 = this.c;
        if (i8 - i2 != 0) {
            int[] iArr = this.a;
            int i9 = i2 + 1;
            cs.P(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.b;
            cs.Q(i9, i2, this.c, objArr2, objArr2);
        }
        this.a[i2] = i;
        this.b[i2] = obj;
        this.c++;
    }

    public final String toString() {
        int i = this.c;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.a[i3]);
            sb.append('=');
            Object obj = this.b[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public fmd(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.a = new int[i5];
        this.b = new Object[i5];
    }
}
