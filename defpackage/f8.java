package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: f8  reason: default package */
public final class f8 extends sgc {
    public fc7 j;
    public final ii5 k = new ii5(11);

    public f8() {
        this.e = 1;
    }

    public final void J(int i, String str) {
        this.j.B(i, str);
    }

    public final void M(String str, String[] strArr, int i) {
        this.j.F(str, strArr, i);
    }

    public final void N(Bundle bundle) {
        super.N(bundle);
        ii5 ii5 = this.k;
        ii5.getClass();
        ii5.b = bundle.getInt("TransactionIndexer.currentIndex");
    }

    public final void O(Bundle bundle) {
        super.O(bundle);
        bundle.putInt("TransactionIndexer.currentIndex", this.k.b);
    }

    public final void T(Intent intent) {
        this.j.startActivity(intent);
    }

    public final void U(String str, Intent intent, int i) {
        this.j.A(str, intent, i, (Bundle) null);
    }

    public final void V(String str, Intent intent, int i, Bundle bundle) {
        this.j.A(str, intent, i, bundle);
    }

    public final void W(String str, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        this.j.k(str, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public final void Y(String str) {
        this.j.f(str);
    }

    public final void Z(fc7 fc7, ViewGroup viewGroup) {
        if (this.j != fc7 || this.i != viewGroup) {
            ViewGroup viewGroup2 = this.i;
            if (viewGroup2 != null && (viewGroup2 instanceof vr3)) {
                K((vr3) viewGroup2);
            }
            if (viewGroup instanceof vr3) {
                a((vr3) viewGroup);
            }
            this.j = fc7;
            this.i = viewGroup;
            viewGroup.post(new vp6(24, this));
        }
    }

    public final Activity d() {
        fc7 fc7 = this.j;
        if (fc7 != null) {
            return fc7.a();
        }
        return null;
    }

    public final sgc i() {
        return this;
    }

    public final List j() {
        return this.j.V();
    }

    public final ii5 k() {
        return this.k;
    }

    public final void o() {
        if (this.j != null && d() != null) {
            d().invalidateOptionsMenu();
        }
    }

    public final void p(Activity activity, boolean z) {
        super.p(activity, z);
        if (!z) {
            this.j = null;
        }
    }
}
