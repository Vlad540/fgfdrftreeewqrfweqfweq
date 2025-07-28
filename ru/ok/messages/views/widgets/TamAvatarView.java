package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/views/widgets/TamAvatarView;", "Lsc0;", "", "Lade;", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class TamAvatarView extends sc0 implements ade {
    public wce C0;

    public TamAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (!isInEditMode()) {
            setLayerType(2, (Paint) null);
            y66 a = new z66(getContext().getResources()).a();
            getContext();
            mn4 mn4 = new mn4(a);
            this.a = mn4;
            mn4.e().setCallback(this);
            nqc x = pfa.x(context);
            this.o = x.o();
            this.x0 = (pc0) x.getAccessor().c(pc0.class);
            this.y0 = ((j2b) x.q()).a;
            this.w0 = x.f();
            this.z0 = (o2b) x.getAccessor().c(o2b.class);
        }
        wce wce = (wce) wce.d0.a.getValue();
        this.C0 = wce == null ? db4.e0 : wce;
        this.C0 = fja.E(context);
    }

    public final void c(Drawable drawable) {
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(aic.c);
            if (findDrawableByLayerId != null) {
                js.D(findDrawableByLayerId, this.C0.m);
            }
            Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(aic.b);
            if (findDrawableByLayerId2 != null) {
                js.D(findDrawableByLayerId2, this.C0.k);
            }
        }
    }

    public final void z(wce wce) {
        this.C0 = wce;
        c(this.b);
    }
}
