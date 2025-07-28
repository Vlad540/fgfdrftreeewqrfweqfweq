package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.a;

/* renamed from: mga  reason: default package */
public final class mga extends o57 {
    public final /* synthetic */ int d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mga(a aVar, int i) {
        super(aVar);
        this.d = i;
    }

    public final int c(View view) {
        switch (this.d) {
            case 0:
                ((a) this.b).getClass();
                return a.E(view) + ((n6c) view.getLayoutParams()).rightMargin;
            default:
                ((a) this.b).getClass();
                return a.z(view) + ((n6c) view.getLayoutParams()).bottomMargin;
        }
    }

    public final int d(View view) {
        switch (this.d) {
            case 0:
                n6c n6c = (n6c) view.getLayoutParams();
                ((a) this.b).getClass();
                return a.D(view) + n6c.leftMargin + n6c.rightMargin;
            default:
                n6c n6c2 = (n6c) view.getLayoutParams();
                ((a) this.b).getClass();
                return a.C(view) + n6c2.topMargin + n6c2.bottomMargin;
        }
    }

    public final int e(View view) {
        switch (this.d) {
            case 0:
                n6c n6c = (n6c) view.getLayoutParams();
                ((a) this.b).getClass();
                return a.C(view) + n6c.topMargin + n6c.bottomMargin;
            default:
                n6c n6c2 = (n6c) view.getLayoutParams();
                ((a) this.b).getClass();
                return a.D(view) + n6c2.leftMargin + n6c2.rightMargin;
        }
    }

    public final int f(View view) {
        switch (this.d) {
            case 0:
                ((a) this.b).getClass();
                return a.B(view) - ((n6c) view.getLayoutParams()).leftMargin;
            default:
                ((a) this.b).getClass();
                return a.F(view) - ((n6c) view.getLayoutParams()).topMargin;
        }
    }

    public final int g() {
        switch (this.d) {
            case 0:
                return ((a) this.b).n;
            default:
                return ((a) this.b).o;
        }
    }

    public final int h() {
        switch (this.d) {
            case 0:
                a aVar = (a) this.b;
                return aVar.n - aVar.K();
            default:
                a aVar2 = (a) this.b;
                return aVar2.o - aVar2.I();
        }
    }

    public final int i() {
        switch (this.d) {
            case 0:
                return ((a) this.b).K();
            default:
                return ((a) this.b).I();
        }
    }

    public final int j() {
        switch (this.d) {
            case 0:
                return ((a) this.b).l;
            default:
                return ((a) this.b).m;
        }
    }

    public final int k() {
        switch (this.d) {
            case 0:
                return ((a) this.b).m;
            default:
                return ((a) this.b).l;
        }
    }

    public final int m() {
        switch (this.d) {
            case 0:
                return ((a) this.b).J();
            default:
                return ((a) this.b).L();
        }
    }

    public final int n() {
        switch (this.d) {
            case 0:
                a aVar = (a) this.b;
                return (aVar.n - aVar.J()) - aVar.K();
            default:
                a aVar2 = (a) this.b;
                return (aVar2.o - aVar2.L()) - aVar2.I();
        }
    }

    public final int p(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.c;
                ((a) this.b).P(rect, view);
                return rect.right;
            default:
                Rect rect2 = (Rect) this.c;
                ((a) this.b).P(rect2, view);
                return rect2.bottom;
        }
    }

    public final int q(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.c;
                ((a) this.b).P(rect, view);
                return rect.left;
            default:
                Rect rect2 = (Rect) this.c;
                ((a) this.b).P(rect2, view);
                return rect2.top;
        }
    }

    public final void r(int i) {
        switch (this.d) {
            case 0:
                ((a) this.b).T(i);
                return;
            default:
                ((a) this.b).U(i);
                return;
        }
    }
}
