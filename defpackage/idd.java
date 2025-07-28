package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: idd  reason: default package */
public final class idd extends Drawable implements Animatable, mhe {
    public static final /* synthetic */ k77[] E0;
    public static final float[] F0 = {1.0f, 0.33f, 1.0f};
    public static final float[] G0 = {0.0f, 359.0f};
    public final hdd A0;
    public final hdd B0;
    public final hdd C0;
    public final hdd D0;
    public final hhb X;
    public final ObjectAnimator Y;
    public final ObjectAnimator Z;
    public final Context a;
    public final ShapeDrawable[] b;
    public final wia[] c;
    public final hhb o;
    public final hdd w0;
    public final hdd x0;
    public final hdd y0;
    public final hdd z0;

    static {
        Class<idd> cls = idd.class;
        E0 = new k77[]{new hc9(cls, "colorState", "getColorState()Lone/me/sdk/uikit/common/emptyview/ShineAnimatedDrawable$Companion$ColorState;"), c3d.g(m7c.a, cls, "rotationValues", "getRotationValues()[F"), new hc9(cls, "rotationDirection", "getRotationDirection()Lone/me/sdk/uikit/common/emptyview/ShineAnimatedDrawable$Companion$RotateDirection;"), new hc9(cls, "rotationDuration", "getRotationDuration()J"), new hc9(cls, "scaleValues", "getScaleValues()[F"), new hc9(cls, "scaleDuration", "getScaleDuration()J"), new hc9(cls, "shapeHeight", "getShapeHeight()Ljava/lang/Integer;"), new hc9(cls, "isScaleAnimationEnabled", "isScaleAnimationEnabled()Z")};
    }

    public idd(Context context) {
        this.a = context;
        s59 s59 = km4.y0;
        this.b = new ShapeDrawable[]{a06.d(s59.n(context).g().f().a.a), a06.d(s59.n(context).g().f().a.b), a06.d(s59.n(context).g().f().a.c), a06.d(s59.n(context).g().f().a.d)};
        wia[] wiaArr = new wia[4];
        for (int i = 0; i < 4; i++) {
            wiaArr[i] = new wia(new hhb("x"), new hhb("y"));
        }
        this.c = wiaArr;
        hhb hhb = new hhb("scaleXY", 1.0f);
        this.o = hhb;
        hhb hhb2 = new hhb("rotation", 0.0f);
        this.X = hhb2;
        float[] fArr = F0;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, hhb, Arrays.copyOf(fArr, fArr.length));
        ofFloat.setDuration(8000);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new edd(this, 0));
        this.Y = ofFloat;
        float[] fArr2 = G0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object) null, hhb2, Arrays.copyOf(fArr2, fArr2.length));
        ofFloat2.setDuration(8000);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new edd(this, 1));
        this.Z = ofFloat2;
        this.w0 = new hdd(this, 0);
        this.x0 = new hdd(fArr2, this, 1);
        this.y0 = new hdd(this, 2);
        this.z0 = new hdd(this, 3);
        this.A0 = new hdd(fArr, this, 4);
        this.B0 = new hdd(this, 5);
        this.C0 = new hdd(this, 6);
        this.D0 = new hdd(this, 7);
    }

    public final void a(pda pda) {
        int[] iArr;
        int i = 0;
        k77 k77 = E0[0];
        int ordinal = ((fdd) this.w0.b).ordinal();
        if (ordinal == 0) {
            iArr = new int[]{pda.f().a.a, pda.f().a.b, pda.f().a.c, pda.f().a.d};
        } else if (ordinal == 1) {
            iArr = new int[]{-12940805, -10285313, -5616385, -16745729};
        } else if (ordinal == 2) {
            iArr = new int[]{-16745729, -13908427, -14904446, -15024573};
        } else if (ordinal == 3) {
            iArr = new int[]{-9803158, -6645094, -8882570, -10197916};
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int length = iArr.length;
        int i2 = 0;
        while (i < length) {
            this.b[i2].getPaint().setColor(iArr[i]);
            i++;
            i2++;
        }
    }

    public final void b(fdd fdd) {
        this.w0.o1(this, E0[0], fdd);
    }

    public final void c(boolean z) {
        this.D0.o1(this, E0[7], Boolean.valueOf(z));
    }

    public final void d() {
        k77 k77 = E0[7];
        if (((Boolean) this.D0.b).booleanValue()) {
            ObjectAnimator objectAnimator = this.Y;
            if (!objectAnimator.isRunning()) {
                objectAnimator.start();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void draw(Canvas canvas) {
        canvas.save();
        float centerX = (float) getBounds().centerX();
        float centerY = (float) getBounds().centerY();
        canvas.rotate(this.X.a, centerX, centerY);
        float f = this.o.a;
        canvas.scale(f, f, centerX, centerY);
        ShapeDrawable[] shapeDrawableArr = this.b;
        int length = shapeDrawableArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            ShapeDrawable shapeDrawable = shapeDrawableArr[i];
            int i3 = i2 + 1;
            wia wia = this.c[i2];
            float f2 = ((hhb) wia.a).a;
            float f3 = ((hhb) wia.b).a;
            int save = canvas.save();
            canvas.translate(f2, f3);
            try {
                shapeDrawable.draw(canvas);
                canvas.restoreToCount(save);
                i++;
                i2 = i3;
            } catch (Throwable th) {
                canvas.restoreToCount(save);
                throw th;
            }
        }
        canvas.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.Z.isRunning() || this.Y.isRunning();
    }

    public final void onBoundsChange(Rect rect) {
        k77 k77 = E0[6];
        Integer num = (Integer) this.C0.b;
        int intValue = num != null ? num.intValue() : Math.min(rect.width() / 2, rect.height() / 2);
        int i = intValue / 2;
        int i2 = 0;
        for (ShapeDrawable shapeDrawable : this.b) {
            float f = (float) intValue;
            shapeDrawable.getShape().resize(f, f);
            shapeDrawable.setBounds(0, 0, intValue, intValue);
        }
        wia[] wiaArr = this.c;
        int length = wiaArr.length;
        int i3 = 0;
        while (i2 < length) {
            wia wia = wiaArr[i2];
            int i4 = i3 + 1;
            float f2 = (float) i;
            double d = (double) (((float) i3) * 1.5707964f);
            float cos = (((float) Math.cos(d)) * f2) + ((float) (rect.left + i));
            float sin = (f2 * ((float) Math.sin(d))) + ((float) (rect.top + i));
            ((hhb) wia.a).a = cos;
            ((hhb) wia.b).a = sin;
            i2++;
            i3 = i4;
        }
    }

    public final void onThemeChanged(pda pda) {
        a(pda);
    }

    public final void setAlpha(int i) {
        for (ShapeDrawable alpha : this.b) {
            alpha.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        for (ShapeDrawable paint : this.b) {
            paint.getPaint().setColorFilter(colorFilter);
        }
    }

    public final void start() {
        udd.q("ShineAnimatedDrawable", "start()");
        d();
        this.Z.start();
    }

    public final void stop() {
        udd.q("ShineAnimatedDrawable", "stop()");
        ObjectAnimator objectAnimator = this.Y;
        if (objectAnimator.isRunning()) {
            objectAnimator.cancel();
        }
        this.Z.cancel();
    }
}
