package defpackage;

import android.util.LogPrinter;
import android.view.View;

/* renamed from: yb6  reason: default package */
public class yb6 {
    public int a;
    public int b;
    public int c;

    public yb6() {
        c();
    }

    public int a(dc6 dc6, View view, n1g n1g, int i, boolean z) {
        return this.a - n1g.m(view, i, dc6.getLayoutMode());
    }

    public void b(int i, int i2) {
        this.a = Math.max(this.a, i);
        this.b = Math.max(this.b, i2);
    }

    public void c() {
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
        this.c = 2;
    }

    public int d(boolean z) {
        if (!z) {
            int i = this.c;
            LogPrinter logPrinter = dc6.A0;
            if ((i & 2) != 0) {
                return 100000;
            }
        }
        return this.a + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bounds{before=");
        sb.append(this.a);
        sb.append(", after=");
        return hr1.h(sb, this.b, '}');
    }
}
