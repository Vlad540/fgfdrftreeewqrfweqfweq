package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gad  reason: default package */
public final class gad extends mad {
    public final /* synthetic */ List c;
    public final /* synthetic */ Matrix d;

    public gad(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    public final void a(Matrix matrix, cad cad, int i, Canvas canvas) {
        for (mad a : this.c) {
            a.a(this.d, cad, i, canvas);
        }
    }
}
