package ru.ok.messages.media.attaches.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import ru.ok.messages.views.widgets.BlockedAttachView;
import ru.ok.messages.views.widgets.SlideOutLayout;

public class FrgAttachUnknown extends FrgAttachView {
    public final boolean H0(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332 || h1() == null) {
            return true;
        }
        c0().finish();
        return true;
    }

    public final View y0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SlideOutLayout slideOutLayout = (SlideOutLayout) layoutInflater.inflate(zrb.frg_unknown_attach_view, viewGroup, false);
        A1();
        BlockedAttachView blockedAttachView = (BlockedAttachView) slideOutLayout.findViewById(yqb.frg_unknown_attach__deleted_view);
        blockedAttachView.a.setText(this.Z.getString("ru.ok.tamtam.extra.TEXT"));
        blockedAttachView.setBackgroundColor(-16777216);
        at7.i(blockedAttachView, new f5(8, this));
        slideOutLayout.setSlideOutListener(this);
        Z0(true);
        mif w1 = w1();
        if (w1 != null) {
            w1.m();
        }
        B1(slideOutLayout, blockedAttachView);
        return slideOutLayout;
    }

    public final void z1(boolean z) {
    }
}
