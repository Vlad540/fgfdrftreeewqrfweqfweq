package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: s4b  reason: default package */
public final class s4b {
    public final int a;
    public final Rect b;
    public final int c;
    public final int d;
    public final Matrix e;
    public final xac f;
    public final String g;
    public final ArrayList h;
    public final ch7 i;
    public int j = -1;

    public s4b(nw1 nw1, Rect rect, int i2, int i3, Matrix matrix, xac xac, vn1 vn1, int i4) {
        this.a = i4;
        this.d = i3;
        this.c = i2;
        this.b = rect;
        this.e = matrix;
        this.f = xac;
        this.g = String.valueOf(nw1.hashCode());
        this.h = new ArrayList();
        List<xw1> list = nw1.a;
        Objects.requireNonNull(list);
        for (xw1 xw1 : list) {
            ArrayList arrayList = this.h;
            xw1.getClass();
            arrayList.add(0);
        }
        this.i = vn1;
    }
}
