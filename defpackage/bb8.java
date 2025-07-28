package defpackage;

import android.view.View;

/* renamed from: bb8  reason: default package */
public final class bb8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jb8 b;

    public /* synthetic */ bb8(jb8 jb8, int i) {
        this.a = i;
        this.b = jb8;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                return;
            default:
                jb8 jb8 = this.b;
                if (jb8.x0.g()) {
                    jb8.Y.getClass();
                    yb8.g(2);
                }
                jb8.dismiss();
                return;
        }
    }
}
