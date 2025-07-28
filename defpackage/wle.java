package defpackage;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: wle  reason: default package */
public final class wle extends n1g {
    public final cme f;
    public final Window.Callback g;
    public final mv4 h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final ArrayList l = new ArrayList();
    public final lde m = new lde(4, (Object) this);

    public wle(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        super(3);
        vle vle = new vle(this);
        toolbar.getClass();
        cme cme = new cme(toolbar, false);
        this.f = cme;
        callback.getClass();
        this.g = callback;
        cme.k = callback;
        toolbar.setOnMenuItemClickListener(vle);
        if (!cme.g) {
            cme.h = charSequence;
            if ((cme.b & 8) != 0) {
                Toolbar toolbar2 = cme.a;
                toolbar2.setTitle(charSequence);
                if (cme.g) {
                    eaf.k(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.h = new mv4(26, this);
    }

    public final void H() {
    }

    public final void I() {
        this.f.a.removeCallbacks(this.m);
    }

    public final boolean J(int i2, KeyEvent keyEvent) {
        Menu g0 = g0();
        if (g0 == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        g0.setQwertyMode(z);
        return g0.performShortcut(i2, keyEvent, 0);
    }

    public final boolean K(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            L();
        }
        return true;
    }

    public final boolean L() {
        return this.f.a.w();
    }

    public final void V(boolean z) {
    }

    public final void W(boolean z) {
    }

    public final void X(CharSequence charSequence) {
        cme cme = this.f;
        if (!cme.g) {
            cme.h = charSequence;
            if ((cme.b & 8) != 0) {
                Toolbar toolbar = cme.a;
                toolbar.setTitle(charSequence);
                if (cme.g) {
                    eaf.k(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.w0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d() {
        /*
            r0 = this;
            cme r0 = r0.f
            androidx.appcompat.widget.Toolbar r0 = r0.a
            androidx.appcompat.widget.ActionMenuView r0 = r0.a
            if (r0 == 0) goto L_0x0014
            i7 r0 = r0.w0
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wle.d():boolean");
    }

    public final boolean e() {
        ul8 ul8;
        rle rle = this.f.a.e1;
        if (rle == null || (ul8 = rle.b) == null) {
            return false;
        }
        if (rle == null) {
            ul8 = null;
        }
        if (ul8 == null) {
            return true;
        }
        ul8.collapseActionView();
        return true;
    }

    public final Menu g0() {
        boolean z = this.j;
        cme cme = this.f;
        if (!z) {
            xp0 xp0 = new xp0((Object) this);
            ygd ygd = new ygd(this);
            Toolbar toolbar = cme.a;
            toolbar.f1 = xp0;
            toolbar.g1 = ygd;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.x0 = xp0;
                actionMenuView.y0 = ygd;
            }
            this.j = true;
        }
        return cme.a.getMenu();
    }

    public final void j(boolean z) {
        if (z != this.k) {
            this.k = z;
            ArrayList arrayList = this.l;
            if (arrayList.size() > 0) {
                hr1.r(arrayList.get(0));
                throw null;
            }
        }
    }

    public final int q() {
        return this.f.b;
    }

    public final Context w() {
        return this.f.a.getContext();
    }

    public final boolean z() {
        cme cme = this.f;
        Toolbar toolbar = cme.a;
        lde lde = this.m;
        toolbar.removeCallbacks(lde);
        Toolbar toolbar2 = cme.a;
        WeakHashMap weakHashMap = eaf.a;
        toolbar2.postOnAnimation(lde);
        return true;
    }
}
