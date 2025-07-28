package defpackage;

import android.view.KeyEvent;
import android.widget.SeekBar;
import androidx.mediarouter.app.d;
import androidx.mediarouter.app.e;
import java.util.Collections;

/* renamed from: ga8  reason: default package */
public final class ga8 extends fja {
    public final /* synthetic */ int e;
    public final /* synthetic */ KeyEvent.Callback f;

    public /* synthetic */ ga8(KeyEvent.Callback callback, int i) {
        this.e = i;
        this.f = callback;
    }

    public void m() {
        switch (this.e) {
            case 0:
                ((ia8) this.f).b();
                return;
            default:
                return;
        }
    }

    public void n() {
        switch (this.e) {
            case 0:
                ((ia8) this.f).b();
                return;
            default:
                return;
        }
    }

    public void o() {
        switch (this.e) {
            case 0:
                ((ia8) this.f).b();
                return;
            default:
                return;
        }
    }

    public void p() {
        switch (this.e) {
            case 0:
                ((ia8) this.f).b();
                return;
            case 1:
                ((ka8) this.f).g();
                return;
            case 3:
                ((ab8) this.f).g();
                return;
            case 4:
                ((jb8) this.f).n();
                return;
            default:
                return;
        }
    }

    public final void q(xb8 xb8) {
        x3a b;
        switch (this.e) {
            case 0:
                ((ia8) this.f).b();
                return;
            case 1:
                ((ka8) this.f).g();
                return;
            case 2:
                ((d) this.f).q(true);
                return;
            case 3:
                ((ab8) this.f).g();
                return;
            default:
                jb8 jb8 = (jb8) this.f;
                if (xb8 == jb8.x0 && xb8.a() != null) {
                    wb8 wb8 = xb8.a;
                    wb8.getClass();
                    yb8.b();
                    for (xb8 xb82 : Collections.unmodifiableList(wb8.b)) {
                        if (!Collections.unmodifiableList(jb8.x0.u).contains(xb82) && (b = jb8.x0.b(xb82)) != null && b.A() && !jb8.z0.contains(xb82)) {
                            jb8.o();
                            jb8.m();
                            return;
                        }
                    }
                }
                jb8.n();
                return;
        }
    }

    public void r() {
        switch (this.e) {
            case 0:
                ((ia8) this.f).b();
                return;
            case 1:
                ((ka8) this.f).g();
                return;
            case 3:
                ((ab8) this.f).g();
                return;
            case 4:
                ((jb8) this.f).n();
                return;
            default:
                return;
        }
    }

    public void s(xb8 xb8) {
        switch (this.e) {
            case 0:
                ((ia8) this.f).b();
                return;
            case 1:
                ((ka8) this.f).dismiss();
                return;
            case 3:
                ((ab8) this.f).dismiss();
                return;
            case 4:
                jb8 jb8 = (jb8) this.f;
                jb8.x0 = xb8;
                jb8.o();
                jb8.m();
                return;
            default:
                return;
        }
    }

    public void t() {
        switch (this.e) {
            case 0:
                ((ia8) this.f).b();
                return;
            case 2:
                ((d) this.f).q(false);
                return;
            case 4:
                ((jb8) this.f).n();
                return;
            default:
                return;
        }
    }

    public void u(xb8 xb8) {
        e eVar;
        KeyEvent.Callback callback = this.f;
        switch (this.e) {
            case 2:
                d dVar = (d) callback;
                SeekBar seekBar = (SeekBar) dVar.f1.get(xb8);
                int i = xb8.o;
                int i2 = d.D1;
                if (seekBar != null && dVar.a1 != xb8) {
                    seekBar.setProgress(i);
                    return;
                }
                return;
            case 4:
                int i3 = jb8.i1;
                jb8 jb8 = (jb8) callback;
                if (jb8.L0 != xb8 && (eVar = (e) jb8.K0.get(xb8.c)) != null) {
                    int i4 = eVar.J0.o;
                    eVar.B(i4 == 0);
                    eVar.L0.setProgress(i4);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void v() {
        switch (this.e) {
            case 0:
                ((ia8) this.f).getClass();
                return;
            default:
                return;
        }
    }
}
