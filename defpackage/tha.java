package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: tha  reason: default package */
public final class tha extends EdgeEffect {
    public fnd a;
    public final /* synthetic */ int b;
    public final /* synthetic */ uha c;
    public final /* synthetic */ RecyclerView d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tha(int i, uha uha, RecyclerView recyclerView, Context context) {
        super(context);
        this.b = i;
        this.c = uha;
        this.d = recyclerView;
    }

    public final fnd a() {
        fnd fnd = new fnd(this.d, fnd.q);
        gnd gnd = new gnd();
        gnd.i = (double) 0.0f;
        gnd.a(1.0f);
        gnd.b(200.0f);
        fnd.m = gnd;
        return fnd;
    }

    public final void b(float f) {
        int i = this.b == 3 ? -1 : 1;
        uha uha = this.c;
        float f2 = ((float) (i * uha.a)) * f * uha.b;
        RecyclerView recyclerView = this.d;
        recyclerView.setTranslationY(recyclerView.getTranslationY() + f2);
        fnd fnd = this.a;
        if (fnd != null) {
            fnd.b();
        }
    }

    public final boolean draw(Canvas canvas) {
        return false;
    }

    public final boolean isFinished() {
        fnd fnd = this.a;
        return fnd == null || !fnd.f;
    }

    public final void onAbsorb(int i) {
        super.onAbsorb(i);
        float f = ((float) ((this.b == 3 ? -1 : 1) * i)) * this.c.c;
        fnd fnd = this.a;
        if (fnd != null) {
            fnd.b();
        }
        fnd a2 = a();
        a2.a = f;
        a2.g();
        this.a = a2;
    }

    public final void onPull(float f) {
        super.onPull(f);
        b(f);
    }

    public final void onRelease() {
        super.onRelease();
        if (this.d.getTranslationY() != 0.0f) {
            fnd a2 = a();
            a2.g();
            this.a = a2;
        }
    }

    public final void onPull(float f, float f2) {
        super.onPull(f, f2);
        b(f);
    }
}
