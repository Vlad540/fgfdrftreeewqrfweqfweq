package ru.ok.messages.contacts.profile;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.List;

public class ActContactAvatars extends s5 implements kbf, b16, i16, z06, yle {
    public static final /* synthetic */ int l1 = 0;
    public ViewPager Z0;
    public rn3 a1;
    public FrgContactAvatarsLoader b1;
    public zt3 c1;
    public ArrayList d1;
    public final ArrayList e1 = new ArrayList();
    public int f1;
    public int g1;
    public int h1;
    public mif i1;
    public tg j1;
    public pn1 k1;

    public final String Z() {
        return "AVATAR_PHOTO";
    }

    public final mif a() {
        return this.i1;
    }

    public final void c(boolean z, boolean z2, boolean z3) {
        if (z) {
            g0((View.OnSystemUiVisibilityChangeListener) null);
        } else {
            b0((View.OnSystemUiVisibilityChangeListener) null);
        }
        if (z) {
            this.j1.e((Toolbar) this.i1.b);
        } else {
            this.j1.r((Toolbar) this.i1.b);
        }
    }

    public final void e() {
        c(((Toolbar) this.i1.b).getVisibility() != 0, true, false);
    }

    public final boolean f() {
        return ((Toolbar) this.i1.b).getVisibility() == 0;
    }

    public final void j0(int i, List list) {
        udd.q("ru.ok.messages.contacts.profile.ActContactAvatars", "urls = " + list.size() + ", total = " + i);
        this.f1 = i;
        ArrayList arrayList = this.e1;
        arrayList.clear();
        arrayList.addAll(list);
        this.a1.d();
        this.Z0.post(new b(3, (Object) this));
    }

    public final void k(int i) {
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, ru.ok.messages.contacts.profile.ActContactAvatars] */
    public final void k0(int i) {
        if (this.f1 != 0) {
            if (i == -1) {
                i = 0;
            }
            mif mif = this.i1;
            mif.l((i + 1) + " " + getString(whc.B) + " " + this.f1);
        }
    }

    public final void m(int i) {
        udd.q("ru.ok.messages.contacts.profile.ActContactAvatars", "onPageSelected: " + i);
        this.h1 = i;
        k0(i);
        if (this.e1.size() - i < 3) {
            this.b1.s1();
        }
        vl.b().b().f("AVATAR_PHOTO");
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [android.content.Context, ru.ok.messages.contacts.profile.ActContactAvatars, s5, androidx.fragment.app.b, r5, im, java.lang.Object, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        FrgContactAvatarsLoader frgContactAvatarsLoader;
        super.onCreate(bundle);
        this.j1 = ((k93) this.O0.b).c();
        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        mif i0 = i0(zrb.act_contact_avatars);
        this.i1 = i0;
        Drawable q = js.q(zhc.Q, -1, this);
        Toolbar toolbar = (Toolbar) i0.b;
        if (toolbar != null) {
            toolbar.setOverflowIcon(q);
        }
        g0((View.OnSystemUiVisibilityChangeListener) null);
        int i = xhc.b;
        f0(getResources().getColor(i));
        getWindow().setNavigationBarColor(getResources().getColor(i));
        Toolbar toolbar2 = (Toolbar) this.i1.b;
        if (toolbar2 != null) {
            toolbar2.setBackgroundResource(i);
        }
        mif mif = this.i1;
        Drawable q2 = js.q(zhc.j, -1, this);
        Toolbar toolbar3 = (Toolbar) mif.b;
        if (toolbar3 != null) {
            toolbar3.setNavigationIcon(q2);
        }
        Drawable navigationIcon = ((Toolbar) this.i1.b).getNavigationIcon();
        if (navigationIcon != null) {
            js.D(navigationIcon, -1);
        }
        mif mif2 = this.i1;
        d5 d5Var = new d5(1, (Object) this);
        Toolbar toolbar4 = (Toolbar) mif2.b;
        if (toolbar4 != null) {
            toolbar4.setNavigationOnClickListener(d5Var);
        }
        TextView textView = (TextView) this.i1.o;
        if (textView != null) {
            textView.setTextColor(-1);
        }
        ViewPager findViewById = findViewById(yqb.act_contact_profile__vp_pager);
        this.Z0 = findViewById;
        findViewById.b(new j5(this, 1));
        rn3 rn3 = new rn3(P(), this.e1, ((k93) this.O0.b).n().a.s() == getIntent().getLongExtra("ru.ok.tamtam.extra.CONTACT_ID", 0), this.g1);
        this.a1 = rn3;
        this.Z0.setAdapter(rn3);
        if (bundle != null) {
            this.c1 = (zt3) bundle.getSerializable("ru.ok.tamtam.extra.REMOVE_REQUESTS");
            this.d1 = (ArrayList) bundle.getSerializable("ru.ok.tamtam.extra.MAKE_MAIN_REQUESTS");
            int i2 = bundle.getInt("ru.ok.tamtam.extra.MAIN_PHOTO_INDEX");
            this.g1 = i2;
            this.a1.k = i2;
            this.h1 = bundle.getInt("ru.ok.tamtam.extra.CURRENT_PAGE");
        }
        FrgContactAvatarsLoader E = P().E("ru.ok.messages.contacts.profile.FrgContactAvatarsLoader");
        this.b1 = E;
        if (E == null) {
            this.h1 = 0;
            long longExtra = getIntent().getLongExtra("ru.ok.tamtam.extra.CONTACT_ID", 0);
            if (longExtra == 0) {
                uj3 uj3 = ((yj3) getIntent().getParcelableExtra("ru.ok.tamtam.extra.CONTACT_INFO")).a;
                frgContactAvatarsLoader = new FrgContactAvatarsLoader();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("ru.ok.tamtam.extra.CONTACT_INFO", new yj3(uj3));
                frgContactAvatarsLoader.Y0(bundle2);
            } else {
                FrgContactAvatarsLoader frgContactAvatarsLoader2 = new FrgContactAvatarsLoader();
                Bundle bundle3 = new Bundle();
                bundle3.putLong("ru.ok.tamtam.extra.CONTACT_ID", longExtra);
                frgContactAvatarsLoader2.Y0(bundle3);
                frgContactAvatarsLoader = frgContactAvatarsLoader2;
            }
            this.b1 = frgContactAvatarsLoader;
            vx5 P = P();
            FrgContactAvatarsLoader frgContactAvatarsLoader3 = this.b1;
            P.getClass();
            hd0 hd0 = new hd0(P);
            hd0.f(0, frgContactAvatarsLoader3, "ru.ok.messages.contacts.profile.FrgContactAvatarsLoader", 1);
            hd0.d(false);
        }
        vl.b().b().f("AVATAR_PHOTO");
    }

    @a1e
    public void onEvent(c9c c9c) {
        zt3 zt3 = this.c1;
        if (zt3 != null && zt3.contains(Long.valueOf(c9c.a))) {
            FrgContactAvatarsLoader frgContactAvatarsLoader = this.b1;
            if (frgContactAvatarsLoader != null) {
                int i = frgContactAvatarsLoader.I1 - 1;
                frgContactAvatarsLoader.I1 = i;
                if (i <= 0) {
                    i = 0;
                }
                frgContactAvatarsLoader.I1 = i;
            }
            this.c1.remove((Object) Long.valueOf(c9c.a));
        }
    }

    public final void onPause() {
        super.onPause();
        this.b1.N1 = null;
    }

    public final void onResume() {
        super.onResume();
        FrgContactAvatarsLoader frgContactAvatarsLoader = this.b1;
        frgContactAvatarsLoader.N1 = this;
        if (frgContactAvatarsLoader.M1) {
            j0(frgContactAvatarsLoader.K1, frgContactAvatarsLoader.H1);
        }
        FrgContactAvatarsLoader frgContactAvatarsLoader2 = this.b1;
        j0(frgContactAvatarsLoader2.J1 + frgContactAvatarsLoader2.K1, frgContactAvatarsLoader2.H1);
        ((k93) this.O0.b).m().f(mnc.AVATAR_VIEWER, eja.e);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("ru.ok.tamtam.extra.REMOVE_REQUESTS", this.c1);
        bundle.putSerializable("ru.ok.tamtam.extra.MAKE_MAIN_REQUESTS", this.d1);
        bundle.putInt("ru.ok.tamtam.extra.MAIN_PHOTO_INDEX", this.g1);
        bundle.putInt("ru.ok.tamtam.extra.CURRENT_PAGE", this.h1);
    }

    public final void q(int i, float f) {
    }

    public final wce t() {
        return db4.e0;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.Context, ru.ok.messages.contacts.profile.ActContactAvatars, r5] */
    @a1e
    public void onEvent(jh0 jh0) {
        ArrayList arrayList;
        long j = jh0.a;
        zt3 zt3 = this.c1;
        if ((zt3 != null && zt3.contains(Long.valueOf(j))) || ((arrayList = this.d1) != null && arrayList.contains(Long.valueOf(j)))) {
            if (this.T0) {
                zt3 zt32 = this.c1;
                uae uae = jh0.b;
                long j2 = jh0.a;
                if (zt32 == null || !zt32.contains(Long.valueOf(j2))) {
                    ArrayList arrayList2 = this.d1;
                    if (arrayList2 != null && arrayList2.contains(Long.valueOf(j2))) {
                        this.d1.remove(Long.valueOf(j2));
                        if (!iu7.F(uae.b)) {
                            a06.H(1, this, getString(cic.i));
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.c1.remove((Object) Long.valueOf(j2));
                if (!iu7.F(uae.b)) {
                    a06.H(1, this, getString(cic.i));
                    return;
                }
                return;
            }
            wx3.C(this.U0, jh0, false);
        }
    }

    @a1e
    public void onEvent(fd3 fd3) {
        if (this.T0) {
            throw null;
        }
    }
}
