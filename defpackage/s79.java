package defpackage;

import android.util.Rational;
import android.util.Size;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: s79  reason: default package */
public final class s79 implements i75 {
    public int a;
    public int b;
    public boolean c;
    public final Serializable o;

    public s79(fu1 fu1, Rational rational) {
        this.a = fu1.b();
        this.b = fu1.g();
        this.o = rational;
        boolean z = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        this.c = z;
    }

    public bpe B(int i, int i2) {
        if (i2 == 2) {
            this.a = i;
        } else if (i2 == 1) {
            this.b = i;
        }
        HashMap hashMap = (HashMap) this.o;
        r79 r79 = (r79) hashMap.get(Integer.valueOf(i2));
        if (r79 != null) {
            return r79;
        }
        r79 r792 = new r79();
        hashMap.put(Integer.valueOf(i2), r792);
        return r792;
    }

    public void M(vtc vtc) {
        this.c = true;
    }

    public Size a(br6 br6) {
        boolean z = false;
        int B = br6.B(0);
        Size size = (Size) br6.d(br6.F, (Object) null);
        if (size == null) {
            return size;
        }
        int O = z3d.O(B);
        if (1 == this.b) {
            z = true;
        }
        int x = z3d.x(O, this.a, z);
        return (x == 90 || x == 270) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public void w() {
    }

    public s79() {
        this.a = -1;
        this.b = -1;
        this.o = new HashMap();
    }
}
