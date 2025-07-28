package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

public class AppCompatImageView extends ImageView {
    public final b9 a;
    public final jn b;
    public boolean c;

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        b9 b9Var = this.a;
        if (b9Var != null) {
            b9Var.i();
        }
        jn jnVar = this.b;
        if (jnVar != null) {
            jnVar.h();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        b9 b9Var = this.a;
        if (b9Var != null) {
            return b9Var.B();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        b9 b9Var = this.a;
        if (b9Var != null) {
            return b9Var.C();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        od3 od3;
        jn jnVar = this.b;
        if (jnVar == null || (od3 = (od3) jnVar.o) == null) {
            return null;
        }
        return (ColorStateList) od3.d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        od3 od3;
        jn jnVar = this.b;
        if (jnVar == null || (od3 = (od3) jnVar.o) == null) {
            return null;
        }
        return (PorterDuff.Mode) od3.e;
    }

    public boolean hasOverlappingRendering() {
        return ((((ImageView) this.b.c).getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        b9 b9Var = this.a;
        if (b9Var != null) {
            b9Var.I();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        b9 b9Var = this.a;
        if (b9Var != null) {
            b9Var.J(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        jn jnVar = this.b;
        if (jnVar != null) {
            jnVar.h();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        jn jnVar = this.b;
        if (!(jnVar == null || drawable == null || this.c)) {
            jnVar.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (jnVar != null) {
            jnVar.h();
            if (!this.c) {
                ImageView imageView = (ImageView) jnVar.c;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(jnVar.b);
                }
            }
        }
    }

    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    public void setImageResource(int i) {
        jn jnVar = this.b;
        if (jnVar != null) {
            ImageView imageView = (ImageView) jnVar.c;
            if (i != 0) {
                Drawable n = am7.n(imageView.getContext(), i);
                if (n != null) {
                    bn4.a(n);
                }
                imageView.setImageDrawable(n);
            } else {
                imageView.setImageDrawable((Drawable) null);
            }
            jnVar.h();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        jn jnVar = this.b;
        if (jnVar != null) {
            jnVar.h();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        b9 b9Var = this.a;
        if (b9Var != null) {
            b9Var.P(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        b9 b9Var = this.a;
        if (b9Var != null) {
            b9Var.Q(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        jn jnVar = this.b;
        if (jnVar != null) {
            if (((od3) jnVar.o) == null) {
                jnVar.o = new od3(2);
            }
            od3 od3 = (od3) jnVar.o;
            od3.d = colorStateList;
            od3.c = true;
            jnVar.h();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        jn jnVar = this.b;
        if (jnVar != null) {
            if (((od3) jnVar.o) == null) {
                jnVar.o = new od3(2);
            }
            od3 od3 = (od3) jnVar.o;
            od3.e = mode;
            od3.b = true;
            jnVar.h();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        eke.a(context);
        this.c = false;
        vhe.a(getContext(), this);
        b9 b9Var = new b9((View) this);
        this.a = b9Var;
        b9Var.F(attributeSet, i);
        jn jnVar = new jn((ImageView) this);
        this.b = jnVar;
        jnVar.E(attributeSet, i);
    }
}
