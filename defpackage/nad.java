package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* renamed from: nad  reason: default package */
public final class nad {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public nad() {
        d(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public final void a(float f2) {
        float f3 = this.e;
        if (f3 != f2) {
            float f4 = ((f2 - f3) + 360.0f) % 360.0f;
            if (f4 <= 180.0f) {
                float f5 = this.c;
                float f6 = this.d;
                jad jad = new jad(f5, f6, f5, f6);
                jad.f = this.e;
                jad.g = f4;
                this.h.add(new had(jad));
                this.e = f2;
            }
        }
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((lad) arrayList.get(i)).a(matrix, path);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, lad, kad] */
    public final void c(float f2, float f3) {
        ? lad = new lad();
        lad.b = f2;
        lad.c = f3;
        this.g.add(lad);
        iad iad = new iad(lad, this.c, this.d);
        a(iad.b() + 270.0f);
        this.h.add(iad);
        this.e = iad.b() + 270.0f;
        this.c = f2;
        this.d = f3;
    }

    public final void d(float f2, float f3, float f4, float f5) {
        this.a = f2;
        this.b = f3;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = (f4 + f5) % 360.0f;
        this.g.clear();
        this.h.clear();
    }
}
