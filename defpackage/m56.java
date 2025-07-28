package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import one.me.sdk.gallery.view.NumericCheckButton;
import one.me.sdk.gallery.view.VideoInfoTextView;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: m56  reason: default package */
public final class m56 extends n56 {
    public final m66 J0;
    public NumericCheckButton K0;
    public final OneMeDraweeView L0;
    public final VideoInfoTextView M0;

    public m56(View view, m66 m66) {
        super(view);
        wce wce;
        wce wce2;
        this.J0 = m66;
        on4 on4 = (OneMeDraweeView) view.findViewById(s9a.e);
        this.L0 = on4;
        ViewStub viewStub = (ViewStub) view.findViewById(s9a.c);
        this.M0 = (VideoInfoTextView) view.findViewById(s9a.f);
        Drawable b = gq3.b(view.getContext(), zhc.C);
        if (view.isInEditMode()) {
            wce = db4.e0;
        } else {
            Context context = view.getContext();
            r7e r7e = wce.a0;
            wce = fja.E(context);
        }
        b.setTint(n1g.c0(wce.w, 0.3f));
        y66 hierarchy = on4.getHierarchy();
        if (hierarchy != null) {
            hierarchy.i(b, 1);
        }
        if (view.isInEditMode()) {
            wce2 = db4.e0;
        } else {
            Context context2 = view.getContext();
            r7e r7e2 = wce.a0;
            wce2 = fja.E(context2);
        }
        on4.setBackgroundColor(wce2.H);
        if (m66.b.c) {
            viewStub.setOnInflateListener(new l56(this));
            viewStub.inflate();
        }
    }
}
