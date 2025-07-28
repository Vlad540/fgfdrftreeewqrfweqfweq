package defpackage;

import android.view.View;
import android.view.ViewGroup;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: hs2  reason: default package */
public final class hs2 extends ccd {
    public String B0 = BuildConfig.FLAVOR;

    public final void m(ViewGroup viewGroup, View view, View view2, cre cre, boolean z, k40 k40) {
        raa searchView;
        String string = viewGroup.getResources().getString(h2a.q);
        this.B0 = string;
        if (!(view2 == null || z || (searchView = swb.p(view2, string).getSearchView()) == null)) {
            int i = raa.M0;
            searchView.c(true);
        }
        super.m(viewGroup, view, view2, cre, z, k40);
    }

    public final void o() {
        String str = this.B0;
        this.Z.put(str, str);
    }

    public final kre p(View view, boolean z) {
        kre kre = new kre();
        kre.R(new gs2(view, this, z));
        return kre;
    }
}
