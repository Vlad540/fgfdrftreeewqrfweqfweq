package defpackage;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandlesVM;
import java.util.Map;

/* renamed from: wkc  reason: default package */
public final class wkc implements ykc {
    public final mm a;
    public boolean b;
    public Bundle c;
    public final r7e d;

    public wkc(mm mmVar, cbf cbf) {
        this.a = mmVar;
        this.d = new r7e(new ke(4, (Object) cbf));
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((SavedStateHandlesVM) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a2 = ((tkc) entry.getValue()).e.a();
            if (!hhd.f(a2, Bundle.EMPTY)) {
                bundle.putBundle(str, a2);
            }
        }
        this.b = false;
        return bundle;
    }

    public final void b() {
        if (!this.b) {
            Bundle c2 = this.a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.c;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (c2 != null) {
                bundle.putAll(c2);
            }
            this.c = bundle;
            this.b = true;
            SavedStateHandlesVM savedStateHandlesVM = (SavedStateHandlesVM) this.d.getValue();
        }
    }
}
