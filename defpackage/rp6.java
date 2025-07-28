package defpackage;

import android.graphics.Bitmap;

/* renamed from: rp6  reason: default package */
public final /* synthetic */ class rp6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sp6 b;
    public final /* synthetic */ Bitmap c;
    public final /* synthetic */ xu5 o;

    public /* synthetic */ rp6(sp6 sp6, Bitmap bitmap, xu5 xu5, int i) {
        this.a = i;
        this.b = sp6;
        this.c = bitmap;
        this.o = xu5;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b(this.c, this.o);
                return;
            default:
                this.b.b(this.c, this.o);
                return;
        }
    }
}
