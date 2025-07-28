package defpackage;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: fn  reason: default package */
public class fn extends g83 implements km {
    public final en X;
    public dn o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fn(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            if (r6 != 0) goto L_0x0014
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            int r3 = defpackage.ylb.dialogTheme
            r2.resolveAttribute(r3, r1, r0)
            int r1 = r1.resourceId
            goto L_0x0015
        L_0x0014:
            r1 = r6
        L_0x0015:
            r4.<init>(r5, r1)
            en r1 = new en
            r1.<init>(r4)
            r4.X = r1
            rm r4 = r4.d()
            if (r6 != 0) goto L_0x0035
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            int r1 = defpackage.ylb.dialogTheme
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L_0x0035:
            r5 = r4
            dn r5 = (defpackage.dn) r5
            r5.i1 = r6
            r4.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fn.<init>(android.content.Context, int):void");
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        dn dnVar = (dn) d();
        dnVar.v();
        ((ViewGroup) dnVar.P0.findViewById(16908290)).addView(view, layoutParams);
        dnVar.B0.a(dnVar.A0.getCallback());
    }

    public final rm d() {
        if (this.o == null) {
            qm qmVar = rm.a;
            this.o = new dn(getContext(), getWindow(), this, this);
        }
        return this.o;
    }

    public final void dismiss() {
        super.dismiss();
        d().e();
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        en enVar = this.X;
        if (enVar == null) {
            return false;
        }
        return enVar.a.f(keyEvent);
    }

    public final void e() {
        xie.G(getWindow().getDecorView(), this);
        ete.X(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(hrb.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public final boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final View findViewById(int i) {
        dn dnVar = (dn) d();
        dnVar.v();
        return dnVar.A0.findViewById(i);
    }

    public final void invalidateOptionsMenu() {
        d().a();
    }

    public void onCreate(Bundle bundle) {
        dn dnVar = (dn) d();
        LayoutInflater from = LayoutInflater.from(dnVar.z0);
        if (from.getFactory() == null) {
            from.setFactory2(dnVar);
        } else {
            boolean z = from.getFactory2() instanceof dn;
        }
        super.onCreate(bundle);
        d().c();
    }

    public final void onStop() {
        super.onStop();
        dn dnVar = (dn) d();
        dnVar.z();
        n1g n1g = dnVar.D0;
        if (n1g != null) {
            n1g.W(false);
        }
    }

    public void setContentView(int i) {
        e();
        d().h(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().k(charSequence);
    }

    public void setContentView(View view) {
        e();
        d().i(view);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        d().k(getContext().getString(i));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        d().j(view, layoutParams);
    }
}
