package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;

@Deprecated
public class SimpleDraweeView extends a76 {
    public static o3e A0;
    public n0 z0;

    public SimpleDraweeView(Context context) {
        super(context);
        l(context, (AttributeSet) null);
    }

    public n0 getControllerBuilder() {
        return this.z0;
    }

    public final void l(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        int resourceId;
        try {
            n06.s();
            if (isInEditMode()) {
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                ez3.n(A0, "SimpleDraweeView was not initialized!");
                this.z0 = (n0) A0.get();
            }
            if (attributeSet != null) {
                obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uvb.SimpleDraweeView);
                if (obtainStyledAttributes.hasValue(uvb.SimpleDraweeView_actualImageUri)) {
                    m(Uri.parse(obtainStyledAttributes.getString(uvb.SimpleDraweeView_actualImageUri)));
                } else if (obtainStyledAttributes.hasValue(uvb.SimpleDraweeView_actualImageResource) && (resourceId = obtainStyledAttributes.getResourceId(uvb.SimpleDraweeView_actualImageResource, -1)) != -1) {
                    if (isInEditMode()) {
                        setImageResource(resourceId);
                    } else {
                        setActualImageResource(resourceId);
                    }
                }
                obtainStyledAttributes.recycle();
            }
            n06.s();
        } catch (Throwable th) {
            n06.s();
            throw th;
        }
    }

    public final void m(Uri uri) {
        n0 n0Var = this.z0;
        n0Var.d = null;
        ywa ywa = (ywa) n0Var;
        ywa.c(uri);
        ywa.l = getController();
        setController(ywa.a());
    }

    public void setActualImageResource(int i) {
        m(fye.c(i));
    }

    public void setImageRequest(tr6 tr6) {
        n0 n0Var = this.z0;
        n0Var.e = tr6;
        n0Var.l = getController();
        setController(n0Var.a());
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
    }

    public void setImageURI(Uri uri) {
        m(uri);
    }

    public void setImageURI(String str) {
        m(str != null ? Uri.parse(str) : null);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l(context, attributeSet);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l(context, attributeSet);
    }
}
