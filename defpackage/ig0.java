package defpackage;

import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;

/* renamed from: ig0  reason: default package */
public final class ig0 extends chd {
    public final gg0 J0 = ((gg0) zf0.a.getAccessor().c(gg0.class));
    public final tn3 K0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ig0(android.content.Context r4, defpackage.sn3 r5) {
        /*
            r3 = this;
            zf0 r0 = defpackage.zf0.a
            w4 r0 = r0.getAccessor()
            java.lang.Class<gg0> r1 = gg0.class
            java.lang.Object r0 = r0.c(r1)
            gg0 r0 = (gg0) r0
            androidx.viewpager2.widget.ViewPager2 r1 = new androidx.viewpager2.widget.ViewPager2
            r1.<init>(r4)
            swb.r(r1)
            r3.<init>(r1)
            r3.J0 = r0
            tn3 r4 = new tn3
            r4.<init>(r5)
            r3.K0 = r4
            int r5 = defpackage.nz9.a
            r1.setId(r5)
            android.view.ViewGroup$LayoutParams r5 = new android.view.ViewGroup$LayoutParams
            r0 = -1
            r2 = -2
            r5.<init>(r0, r2)
            r1.setLayoutParams(r5)
            r1.setAdapter(r4)
            r4 = 0
            r1.setOrientation(r4)
            r5 = 2
            r1.setOffscreenPageLimit(r5)
            r1.setClipToPadding(r4)
            r1.setClipChildren(r4)
            j9 r4 = new j9
            r4.<init>(r1, r5, r3)
            r1.setPageTransformer(r4)
            hg0 r4 = new hg0
            r5 = 0
            r4.<init>(r5, r3)
            r1.b(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ig0.<init>(android.content.Context, sn3):void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [ig0, java.lang.Object, b7c] */
    /* renamed from: F */
    public final void A(yf0 yf0) {
        b bVar = new b(13, this);
        List list = yf0.b;
        this.K0.F(list, bVar);
        ViewPager2 viewPager2 = (ViewPager2) this.a;
        viewPager2.setUserInputEnabled(list.size() > 1);
        if (list.size() == 1 && ((un3) list.get(0)).a == 1) {
            viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
    }
}
