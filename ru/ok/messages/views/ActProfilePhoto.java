package ru.ok.messages.views;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import ru.ok.messages.views.fragments.FrgProfilePhoto;

public class ActProfilePhoto extends s5 implements i16, yle {
    public static final /* synthetic */ int c1 = 0;
    public View Z0;
    public mif a1;
    public tg b1;

    public final String Z() {
        return null;
    }

    public final mif a() {
        return this.a1;
    }

    public final void c(boolean z, boolean z2, boolean z3) {
        if (z) {
            g0((View.OnSystemUiVisibilityChangeListener) null);
        } else {
            b0((View.OnSystemUiVisibilityChangeListener) null);
        }
        this.Z0.setVisibility(z ? 0 : 4);
        if (z) {
            this.b1.e((Toolbar) this.a1.b);
        } else {
            this.b1.r((Toolbar) this.a1.b);
        }
    }

    public final void e() {
        c(((Toolbar) this.a1.b).getVisibility() != 0, true, false);
    }

    public final boolean f() {
        return ((Toolbar) this.a1.b).getVisibility() == 0;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, s5, androidx.fragment.app.b, ru.ok.messages.views.ActProfilePhoto, r5, im, java.lang.Object, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b1 = ((k93) this.O0.b).c();
        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        this.a1 = i0(zrb.act_profile_photo);
        g0((View.OnSystemUiVisibilityChangeListener) null);
        int i = xhc.b;
        f0(getResources().getColor(i));
        getWindow().setNavigationBarColor(getResources().getColor(i));
        mif mif = this.a1;
        pv0 pv0 = new pv0(14);
        Toolbar toolbar = (Toolbar) mif.b;
        if (toolbar != null) {
            toolbar.setOnMenuItemClickListener(pv0);
        }
        Toolbar toolbar2 = (Toolbar) this.a1.b;
        if (toolbar2 != null) {
            toolbar2.setBackgroundResource(i);
        }
        mif mif2 = this.a1;
        Drawable q = js.q(zhc.j, -1, this);
        Toolbar toolbar3 = (Toolbar) mif2.b;
        if (toolbar3 != null) {
            toolbar3.setNavigationIcon(q);
        }
        mif mif3 = this.a1;
        d5 d5Var = new d5(3, (Object) this);
        Toolbar toolbar4 = (Toolbar) mif3.b;
        if (toolbar4 != null) {
            toolbar4.setNavigationOnClickListener(d5Var);
        }
        TextView textView = (TextView) this.a1.o;
        if (textView != null) {
            textView.setTextColor(-1);
        }
        this.a1.m();
        Drawable navigationIcon = ((Toolbar) this.a1.b).getNavigationIcon();
        if (navigationIcon != null) {
            js.D(navigationIcon, -1);
        }
        mif mif4 = this.a1;
        Drawable q2 = js.q(zhc.Q, -1, this);
        Toolbar toolbar5 = (Toolbar) mif4.b;
        if (toolbar5 != null) {
            toolbar5.setOverflowIcon(q2);
        }
        if (bundle == null) {
            i6 i6Var = (i6) getIntent().getParcelableExtra("ru.ok.tamtam.extra.PHOTO_HOLDER");
            wo8 wo8 = (wo8) getIntent().getParcelableExtra("ru.ok.tamtam.extra.EXTRA_CONTROL_MESSAGE_DB");
            if (i6Var != null) {
                FrgProfilePhoto frgProfilePhoto = new FrgProfilePhoto();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("ru.ok.tamtam.extra.CONTENT_HOLDER", i6Var);
                if (wo8 != null) {
                    bundle2.putParcelable("ru.ok.tamtam.extra.EXTRA_CONTROL_MSG_DB_PARC", wo8);
                }
                frgProfilePhoto.Y0(bundle2);
                kjd.c(P(), yqb.act_profile_photo__container, frgProfilePhoto, "ru.ok.messages.views.fragments.FrgProfilePhoto");
            } else {
                throw new IllegalArgumentException("PhotoContentHolder must be non null");
            }
        }
        this.Z0 = findViewById(yqb.act_profile_photo__vw_top_bg);
        this.Z0.getLayoutParams().height = dh4.a(this) * 2;
    }

    public final void onResume() {
        super.onResume();
        xg9 m = ((k93) this.O0.b).m();
        mnc mnc = mnc.AVATAR_VIEWER;
        eja eja = eja.e;
        m.f(mnc, eja.e);
    }

    public final wce t() {
        return db4.e0;
    }
}
