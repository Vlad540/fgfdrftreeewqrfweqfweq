package ru.ok.messages.media.mediabar;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import ru.ok.messages.views.widgets.SlideOutLayout;

public class FrgLocalGif extends FrgLocalMedia implements ql7 {
    public SimpleDraweeView M1;

    public final boolean H0(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332 || !this.s1) {
            return true;
        }
        f1();
        return true;
    }

    public final void L0() {
        super.L0();
        this.I1.b();
    }

    public final void O(tk7 tk7, Uri uri, int i, Uri uri2) {
        ywa a = a06.a.a();
        a.c(at7.x(uri.toString()));
        a.l = this.M1.getController();
        a.j = true;
        if (!r1g.p(tk7.o)) {
            a.f = tr6.a(at7.x(tk7.o));
        }
        this.M1.setController(a.a());
    }

    public final void b() {
        if (s1() != null) {
            s1().e();
        }
    }

    public final View y0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SlideOutLayout slideOutLayout = (SlideOutLayout) layoutInflater.inflate(zrb.frg_local_gif, viewGroup, false);
        slideOutLayout.setSlideOutListener(this);
        SimpleDraweeView findViewById = slideOutLayout.findViewById(yqb.frg_local_gif__drawee);
        this.M1 = findViewById;
        findViewById.getHierarchy().i(new u10(e0(), -1), 3);
        a24.a0(this.M1, new eu5(2, this));
        SimpleDraweeView simpleDraweeView = this.M1;
        if (this.H1) {
            simpleDraweeView.setTransitionName(this.G1.a());
        }
        return slideOutLayout;
    }
}
