package defpackage;

import android.graphics.drawable.Drawable;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: r54  reason: default package */
public final class r54 extends s54 implements f13, mhe {
    public final zqd X;
    public boolean Y;
    public final ContextScope Z;
    public Drawable o;

    public r54(Drawable drawable, t0c t0c, zr7 zr7) {
        this.o = drawable;
        this.X = t0c;
        ContextScope a = n1g.a(zr7);
        this.Z = a;
        ez3.N(new ck5(t0c, new hp0(2, this, r54.class, "onThemeChanged", "onThemeChanged(Lone/me/sdk/design/OneMeTheme;)V", 4, 15), 5), a);
    }

    public final Drawable J() {
        mhe mhe = this.o;
        if (mhe == null) {
            return null;
        }
        mhe mutate = mhe.mutate();
        if (mutate != mhe) {
            mutate.setBounds(mhe.getBounds());
        }
        if (mutate instanceof mhe) {
            mutate.onThemeChanged((pda) this.X.getValue());
        }
        return mutate;
    }

    public final void close() {
        n1g.c(this.Z, (CancellationException) null);
        Drawable drawable = this.o;
        Closeable closeable = drawable instanceof Closeable ? (Closeable) drawable : null;
        if (closeable != null) {
            closeable.close();
        }
        this.o = null;
        this.Y = true;
    }

    public final int getHeight() {
        Drawable drawable = this.o;
        if (drawable != null) {
            Integer valueOf = Integer.valueOf(drawable.getIntrinsicHeight());
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.intValue();
            }
        }
        return 0;
    }

    public final int getSizeInBytes() {
        return getHeight() * getWidth() * 4;
    }

    public final int getWidth() {
        Drawable drawable = this.o;
        if (drawable != null) {
            Integer valueOf = Integer.valueOf(drawable.getIntrinsicWidth());
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.intValue();
            }
        }
        return 0;
    }

    public final boolean isClosed() {
        return this.Y;
    }

    public final boolean isStateful() {
        Drawable drawable = this.o;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return false;
    }

    public final void onThemeChanged(pda pda) {
        mhe mhe = this.o;
        mhe mhe2 = mhe instanceof mhe ? mhe : null;
        if (mhe2 != null) {
            mhe2.onThemeChanged(pda);
        }
    }
}
