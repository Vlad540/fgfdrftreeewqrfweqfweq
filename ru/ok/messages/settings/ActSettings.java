package ru.ok.messages.settings;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import ru.ok.messages.settings.caching.FrgCachingSettings;
import ru.ok.messages.settings.locations.FrgLiveLocationSettings;
import ru.ok.messages.views.widgets.SlideOutLayout;

public class ActSettings extends r5 implements c8d, yle, ojd {
    public static final /* synthetic */ int Z0 = 0;
    public mif Y0;

    public final boolean D() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ru.ok.messages.settings.ActSettings, r5, android.app.Activity] */
    public final void N(int i) {
        finish();
        overridePendingTransition(0, 0);
    }

    public final void Q() {
    }

    public final String Z() {
        return null;
    }

    public final mif a() {
        return this.Y0;
    }

    public final void a0() {
        f0(this.R0.L);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [ru.ok.messages.settings.ActSettings, androidx.fragment.app.b, r5, im, ojd, java.lang.Object, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        a aVar;
        super.onCreate(bundle);
        setContentView(zrb.act_settings);
        wce wce = this.R0;
        f0(wce.L);
        ci9 ci9 = new ci9(new mn(this), findViewById(yqb.toolbar));
        ci9.c = wce;
        mif mif = new mif(ci9);
        this.Y0 = mif;
        int i = zhc.j;
        int i2 = ((wce) mif.c).w;
        Toolbar toolbar = (Toolbar) mif.b;
        if (toolbar != null) {
            toolbar.setNavigationIcon(i);
            Drawable navigationIcon = toolbar.getNavigationIcon();
            if (navigationIcon != null) {
                js.D(navigationIcon, i2);
            }
        }
        mif mif2 = this.Y0;
        d5 d5Var = new d5(4, (Object) this);
        Toolbar toolbar2 = (Toolbar) mif2.b;
        if (toolbar2 != null) {
            toolbar2.setNavigationOnClickListener(d5Var);
        }
        ((SlideOutLayout) findViewById(yqb.act_settings__slideout)).setSlideOutListener(this);
        if (bundle == null) {
            int intExtra = getIntent().getIntExtra("ru.ok.tamtam.extra.SETTING_ID", 0);
            if (intExtra == yqb.setting_media) {
                aVar = new FrgMediaSettings();
            } else if (intExtra == yqb.setting_messages) {
                aVar = new FrgMessagesSettings();
            } else if (intExtra == yqb.setting_privacy_live_location) {
                aVar = new FrgLiveLocationSettings();
            } else if (intExtra == 0 || intExtra == yqb.setting_media_caching) {
                aVar = new FrgCachingSettings();
            } else {
                throw new IllegalArgumentException(rf0.f(intExtra, "Fragment for setting id: ", " not found!"));
            }
            vx5 P = P();
            P.getClass();
            hd0 hd0 = new hd0(P);
            int i3 = yqb.act_settings__container;
            if (i3 != 0) {
                hd0.f(i3, aVar, "ru.ok.messages.settings.FrgBaseSettings", 2);
                c cVar = aVar.J0;
                if (cVar == null || cVar == hd0.q) {
                    hd0.b(new dy5(8, aVar));
                    hd0.d(false);
                    return;
                }
                throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + aVar.toString() + " is already attached to a FragmentManager.");
            }
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
    }

    public final void p() {
    }
}
