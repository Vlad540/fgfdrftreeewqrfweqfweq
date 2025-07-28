package ru.ok.messages.media.mediabar;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b;
import ru.ok.messages.views.dialogs.ConfirmationDialog;
import ru.ok.messages.views.widgets.SlideOutLayout;

public class FrgLocalPhoto extends FrgLocalMedia implements ql7, oc3 {
    public LocalPhotoView M1;

    public final boolean H0(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            o1();
            r5 h1 = h1();
            if (h1 == null || !this.s1) {
                return true;
            }
            h1.onBackPressed();
            return true;
        } else if (menuItem.getItemId() != yqb.menu_local_photo__clear_edit) {
            return true;
        } else {
            Bundle bundle = new Bundle();
            bundle.putInt("ru.ok.tamtam.extra.CONTENT_RES_ID", cic.i2);
            bundle.putInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID", cic.l2);
            bundle.putInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID", cic.r);
            ConfirmationDialog confirmationDialog = new ConfirmationDialog();
            confirmationDialog.Y0(bundle);
            confirmationDialog.c1(0, this);
            confirmationDialog.l1(this.J0, "ru.ok.messages.views.dialogs.ConfirmationDialog");
            return true;
        }
    }

    public final void L0() {
        super.L0();
        this.I1.b();
    }

    public final void O(tk7 tk7, Uri uri, int i, Uri uri2) {
        ur6 d = ur6.d(at7.x(uri.toString()));
        if (uri2 != null) {
            d.l = new pha(uri2);
        }
        ywa a = a06.a.a();
        a.e = d.a();
        a.l = this.M1.getController();
        pwc pwc = ((k93) this.t1.b).j().f;
        if (!r1g.p(tk7.o) && !kpa.b(pwc.e(tk7), tk7)) {
            ur6 d2 = ur6.d(at7.x(tk7.o));
            int i2 = tk7.X;
            if (i2 != 0) {
                d2.l = new mpa(i2, 0);
            }
            a.f = d2.a();
        }
        this.M1.setController(a.a());
        v1();
    }

    public final void P0(View view, Bundle bundle) {
        super.P0(view, bundle);
        this.I1.b();
    }

    public final void Q() {
        super.Q();
        this.M1.getZoomableController().reset();
    }

    public final void S(Bundle bundle) {
        ActLocalMedias c0 = c0();
        if (c0 instanceof ActLocalMedias) {
            vd9 vd9 = c0.m1;
            vd9.getClass();
            vd9.y0 = new kpa((Uri) null, (Uri) null, (jw3) null, (js4) null, (Uri) null, (Uri) null);
            vd9.d2();
            vd9.f2(new od9(vd9, 5));
            vd9.f2(new od9(vd9, 0));
        }
    }

    public final void b() {
        if (s1() != null) {
            s1().e();
        }
    }

    public final boolean o1() {
        this.M1.getZoomableController().reset();
        return false;
    }

    public final void v1() {
        MenuItem g;
        yle c0 = c0();
        mif a = c0 instanceof yle ? c0.a() : null;
        if (a != null && (g = a.g(yqb.menu_local_photo__clear_edit)) != null) {
            rwc h = ((k93) this.t1.b).j().f.h(this.G1);
            if (h != null) {
                g.setVisible(kpa.b(h.c, h.a));
            } else {
                g.setVisible(false);
            }
            b c02 = c0();
            if (c02 instanceof im) {
                c02.invalidateOptionsMenu();
            }
        }
    }

    public final void x0(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        menuInflater.inflate(bsb.menu_local_photo, menu);
        js.b(this.v1, menu, (Integer) null);
        v1();
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [android.view.View, ru.ok.messages.media.mediabar.LocalPhotoView] */
    public final View y0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SlideOutLayout slideOutLayout = (SlideOutLayout) layoutInflater.inflate(zrb.frg_local_photo, viewGroup, false);
        slideOutLayout.setSlideOutListener(this);
        slideOutLayout.setBackgroundColor(this.v1.m);
        LocalPhotoView localPhotoView = (LocalPhotoView) slideOutLayout.findViewById(yqb.frg_local_photo__iv_photo);
        this.M1 = localPhotoView;
        localPhotoView.setListener(this);
        this.M1.setZoomEnabled(true);
        ? r3 = this.M1;
        if (this.H1) {
            r3.setTransitionName(this.G1.a());
        }
        return slideOutLayout;
    }
}
