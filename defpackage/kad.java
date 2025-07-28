package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: kad  reason: default package */
public final class kad extends lad {
    public float b;
    public float c;

    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.b, this.c);
        path.transform(matrix);
    }
}
