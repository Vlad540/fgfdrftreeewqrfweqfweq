package defpackage;

import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: twc  reason: default package */
public final class twc extends b7c {
    public static final /* synthetic */ int P0 = 0;
    public final i08 J0;
    public final OneMeDraweeView K0;
    public final View L0;
    public qwc M0;
    public Uri N0;
    public Uri O0;

    public twc(i08 i08, OneMeDraweeView oneMeDraweeView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, FrameLayout frameLayout) {
        super(frameLayout);
        this.J0 = i08;
        this.K0 = oneMeDraweeView;
        this.L0 = appCompatImageView2;
        a24.Z(oneMeDraweeView, 300, new swc(this, 0));
        a24.Z(appCompatImageView, 300, new swc(this, 1));
    }
}
