package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.TextView;

/* renamed from: vyb  reason: default package */
public final class vyb extends ViewGroup implements mhe {
    public static final xhd F0 = new Object();
    public static final /* synthetic */ k77[] G0;
    public static final r7e H0 = new r7e(new k6b(15));
    public final TextView A0;
    public final t3a B0;
    public final uyb C0;
    public final uyb D0;
    public final uyb E0;
    public boolean a;
    public ValueAnimator b;
    public final Paint c = new Paint(1);
    public float o = -1.0f;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    /* JADX WARNING: type inference failed for: r0v3, types: [xhd, java.lang.Object] */
    static {
        Class<vyb> cls = vyb.class;
        G0 = new k77[]{new hc9(cls, "isOwn", "isOwn()Z"), c3d.g(m7c.a, cls, "reaction", "getReaction()Lru/ok/tamtam/models/message/reactions/Reaction;"), new hc9(cls, "count", "getCount()I")};
    }

    public vyb(Context context) {
        super(context);
        TextView textView = new TextView(context);
        nge nge = nte.a;
        jp2.a.b(textView, yq4.b);
        textView.setIncludeFontPadding(false);
        textView.setGravity(17);
        textView.setTextColor(-1);
        this.A0 = textView;
        t3a t3a = new t3a(context);
        t3a.setHasBackground(false);
        F0.getClass();
        t3a.setReplaceInterpolator((PathInterpolator) H0.getValue());
        t3a.setTypography(jp2.h);
        this.B0 = t3a;
        this.C0 = new uyb(this, 0);
        this.D0 = new uyb(new ryb(""), this);
        this.E0 = new uyb(this, 2);
        setOutlineProvider(new eu3(dh4.c().getDisplayMetrics().density * 48.0f));
        addView(textView);
        addView(t3a);
    }

    private final float getEmojiCenterX() {
        TextView textView = this.A0;
        return (((float) textView.getWidth()) / 2.0f) + ((float) textView.getLeft());
    }

    public final void a(boolean z) {
        float f;
        long j;
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            vx3.f(valueAnimator);
        }
        float measuredWidth = ((float) getMeasuredWidth()) - getEmojiCenterX();
        float f2 = 0.0f;
        if (this.o == -1.0f) {
            this.o = z ? measuredWidth : 0.0f;
        }
        float f3 = this.o;
        Float valueOf = Float.valueOf(f3);
        if (!(!(f3 == 0.0f))) {
            valueOf = null;
        }
        float floatValue = valueOf != null ? valueOf.floatValue() : measuredWidth;
        if (!z) {
            floatValue = this.o;
        }
        if (!z) {
            f2 = measuredWidth;
        }
        Float valueOf2 = Float.valueOf(floatValue);
        Float valueOf3 = Float.valueOf(f2);
        float floatValue2 = valueOf2.floatValue();
        float floatValue3 = valueOf3.floatValue();
        if (z) {
            f = this.o / measuredWidth;
            j = 350;
        } else {
            f = ((float) 1) - (this.o / measuredWidth);
            j = 500;
        }
        long j2 = (long) (f * ((float) j));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{floatValue2, floatValue3});
        ofFloat.setDuration(j2);
        this.B0.setReplaceDuration(j2);
        F0.getClass();
        ofFloat.setInterpolator((PathInterpolator) H0.getValue());
        ofFloat.addUpdateListener(new c00(14, this));
        ofFloat.addListener(new tyb(this, floatValue2, 0));
        ofFloat.addListener(new mf(6, this));
        ofFloat.start();
        this.b = ofFloat;
    }

    public final boolean b() {
        k77 k77 = G0[0];
        return ((Boolean) this.C0.b).booleanValue();
    }

    public final void dispatchDraw(Canvas canvas) {
        boolean z = this.a;
        Paint paint = this.c;
        t3a t3a = this.B0;
        if (z) {
            paint.setColor(this.x0);
            canvas.drawRect(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), paint);
            float emojiCenterX = getEmojiCenterX();
            if (((float) ((int) this.o)) + emojiCenterX > ((float) t3a.getRight())) {
                t3a.setTextColor(this.y0);
            } else {
                t3a.setTextColor(this.z0);
            }
            paint.setColor(this.w0);
            TextView textView = this.A0;
            canvas.drawCircle(emojiCenterX, (((float) textView.getHeight()) / 2.0f) + ((float) textView.getTop()), this.o, paint);
        } else {
            paint.setColor(b() ? this.w0 : this.x0);
            canvas.drawRect(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), paint);
            t3a.setTextColor(b() ? this.y0 : this.z0);
        }
        super.dispatchDraw(canvas);
    }

    public final int getCount() {
        k77 k77 = G0[2];
        return ((Number) this.E0.b).intValue();
    }

    public final ryb getReaction() {
        k77 k77 = G0[1];
        return (ryb) this.D0.b;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int X = a24.X(((float) 10) * dh4.c().getDisplayMetrics().density);
        TextView textView = this.A0;
        n1g.D(textView, X, (getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2), 0, 12);
        int b2 = rf0.b((float) 4, dh4.c().getDisplayMetrics().density, textView.getMeasuredWidth(), X);
        t3a t3a = this.B0;
        n1g.D(t3a, b2, (getMeasuredHeight() / 2) - (t3a.getMeasuredHeight() / 2), 0, 12);
    }

    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(a24.X(((float) 20) * dh4.c().getDisplayMetrics().density), 1073741824);
        TextView textView = this.A0;
        textView.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = textView.getMeasuredWidth();
        int b2 = rf0.b((float) 4, dh4.c().getDisplayMetrics().density, measuredWidth, a24.X(((float) 10) * dh4.c().getDisplayMetrics().density) * 2);
        t3a t3a = this.B0;
        t3a.measure(0, 0);
        setMeasuredDimension(t3a.getMeasuredWidth() + b2, Math.max(a24.X(((float) 28) * dh4.c().getDisplayMetrics().density), t3a.getMeasuredHeight()));
    }

    public final void onThemeChanged(pda pda) {
    }

    public final void setCount(int i) {
        this.E0.o1(this, G0[2], Integer.valueOf(i));
    }

    public final void setOnChipClickListener(u16 u16) {
        a24.a0(this, new xv5(this, 23, u16));
    }

    public final void setOwn(boolean z) {
        this.C0.o1(this, G0[0], Boolean.valueOf(z));
    }

    public final void setReaction(ryb ryb) {
        this.D0.o1(this, G0[1], ryb);
    }
}
