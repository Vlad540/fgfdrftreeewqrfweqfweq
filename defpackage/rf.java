package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: rf  reason: default package */
public final class rf extends Drawable.ConstantState {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public rf(EnhancedVectorDrawable enhancedVectorDrawable) {
        this.b = enhancedVectorDrawable;
    }

    public boolean canApplyTheme() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    public final int getChangingConfigurations() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    public final Drawable newDrawable() {
        switch (this.a) {
            case 0:
                sf sfVar = new sf((Context) null);
                Drawable newDrawable = ((Drawable.ConstantState) this.b).newDrawable();
                sfVar.a = newDrawable;
                newDrawable.setCallback(sfVar.Y);
                return sfVar;
            default:
                EnhancedVectorDrawable enhancedVectorDrawable = (EnhancedVectorDrawable) this.b;
                return new EnhancedVectorDrawable(EnhancedVectorDrawable.access$getResources$p(enhancedVectorDrawable), EnhancedVectorDrawable.access$getResId$p(enhancedVectorDrawable));
        }
    }

    public rf(Drawable.ConstantState constantState) {
        this.b = constantState;
    }

    public final Drawable newDrawable(Resources resources) {
        switch (this.a) {
            case 0:
                sf sfVar = new sf((Context) null);
                Drawable newDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources);
                sfVar.a = newDrawable;
                newDrawable.setCallback(sfVar.Y);
                return sfVar;
            default:
                return resources != null ? new EnhancedVectorDrawable(resources, EnhancedVectorDrawable.access$getResId$p((EnhancedVectorDrawable) this.b)) : newDrawable();
        }
    }

    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.a) {
            case 0:
                sf sfVar = new sf((Context) null);
                Drawable newDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources, theme);
                sfVar.a = newDrawable;
                newDrawable.setCallback(sfVar.Y);
                return sfVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
